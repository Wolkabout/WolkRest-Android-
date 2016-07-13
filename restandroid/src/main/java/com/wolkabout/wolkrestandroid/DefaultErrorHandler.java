package com.wolkabout.wolkrestandroid;

import android.util.Log;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.IOException;

@EBean(scope = EBean.Scope.Singleton)
public class DefaultErrorHandler implements ResponseErrorHandler {

    private static final String TAG = DefaultErrorHandler.class.getSimpleName();

    @Pref
    Credentials_ credentials;

    private ErrorHandler errorHandler;

    @Override
    public boolean hasError(ClientHttpResponse response) throws IOException {
        switch (response.getStatusCode()) {
            case OK:
            case CREATED:
            case BAD_REQUEST: // Handled manually
                return false;
            default:
                return true;
        }

    }

    @Override
    public void handleError(ClientHttpResponse response) throws IOException {
        if (errorHandler == null) {
            Log.e(TAG, "Error handler not set.");
            return;
        }

        if (response.getStatusCode() == HttpStatus.UNAUTHORIZED) {
            errorHandler.onAuthenticationError();
        }
    }

    public void setErrorHandler(ErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    public interface ErrorHandler {

        void onAuthenticationError();

    }
}
