package com.wolkabout.wolkrestandroid;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

@EBean
public class AuthenticationInterceptor implements ClientHttpRequestInterceptor {

    private static final String AUTHORIZATION = "Authorization";

    @Pref
    Credentials_ credentials;

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
        if (credentials.accessToken().exists()) {
            final HttpHeaders headers = request.getHeaders();
            headers.set(AUTHORIZATION, credentials.accessToken().get());
        }

        return execution.execute(request, body);
    }

}
