package com.wolkabout.wolkrestandroid;

import com.wolkabout.wolkrestandroid.dto.AuthenticationResponseDto;
import com.wolkabout.wolkrestandroid.dto.RefreshTokenDto;
import com.wolkabout.wolkrestandroid.service.AuthenticationService;

import org.androidannotations.annotations.Background;
import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.androidannotations.rest.spring.annotations.RestService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@EBean
public class AuthenticationInterceptor implements ClientHttpRequestInterceptor {

    private static final String AUTHORIZATION = "Authorization";

    @Pref
    Credentials_ credentials;

    @RestService
    AuthenticationService authenticationService;

    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        checkCredentials();

        if (credentials.accessToken().exists()) {
            final HttpHeaders headers = request.getHeaders();
            headers.set(AUTHORIZATION, credentials.accessToken().get());
        }

        return execution.execute(request, body);
    }

    private synchronized void checkCredentials() {
        lock.lock();
        try {
            if (shouldRenewAccessToken()) {
                refreshToken();
            }
        } finally {
            lock.unlock();
        }
    }

    private boolean shouldRenewAccessToken() {
        if (!credentials.accessToken().exists()) {
            return false;
        }

        final Date now = new Date();

        final Date refreshTokenExpiration = new Date(credentials.refreshTokenExpires().get());
        if (refreshTokenExpiration.before(now)) {
            credentials.clear();
            return false;
        }

        final long expirationTime = credentials.accessTokenExpires().get();
        return new Date(expirationTime).before(now);
    }

    private void refreshToken() {
        final AuthenticationResponseDto response = authenticationService.refreshToken(new RefreshTokenDto(credentials.refreshToken().get()));
        credentials.accessToken().put(response.getAccessToken());
        credentials.accessTokenExpires().put(response.getAccessTokenExpires().getTime());
        credentials.refreshToken().put(response.getRefreshToken());
        credentials.refreshTokenExpires().put(response.getRefreshTokenExpires().getTime());
    }

}
