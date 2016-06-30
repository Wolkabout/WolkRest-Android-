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

@EBean
public class AuthenticationInterceptor implements ClientHttpRequestInterceptor {

    private static final String AUTHORIZATION = "Authorization";

    private static final int TIME_BEFORE_EXPIRATION = 5 * 24 * 60 * 60 * 1000; // 5 days

    @Pref
    Credentials_ credentials;

    @RestService
    AuthenticationService authenticationService;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        if (credentials.accessToken().exists()) {
            final HttpHeaders headers = request.getHeaders();
            headers.set(AUTHORIZATION, credentials.accessToken().get());
        }

        if (shouldRenewAccessToken()) {
            refreshToken();
        }

        return execution.execute(request, body);
    }

    private boolean shouldRenewAccessToken() {
        if (!credentials.refreshTokenExpires().exists()) {
            return false;
        }

        final long expirationTime = credentials.refreshTokenExpires().get();
        final Date renewalDate = new Date(expirationTime - TIME_BEFORE_EXPIRATION);
        return new Date().after(renewalDate);
    }

    @Background
    void refreshToken() {
        final AuthenticationResponseDto response = authenticationService.refreshToken(new RefreshTokenDto(credentials.refreshToken().get()));
        credentials.accessToken().put(response.getAccessToken());
        credentials.accessTokenExpires().put(response.getAccessTokenExpires().getTime());
        credentials.refreshToken().put(response.getRefreshToken());
        credentials.refreshTokenExpires().put(response.getRefreshTokenExpires().getTime());
    }

}
