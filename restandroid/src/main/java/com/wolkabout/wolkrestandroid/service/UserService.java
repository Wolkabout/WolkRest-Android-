package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.restandroid.BuildConfig;
import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.MessageConverter;
import com.wolkabout.wolkrestandroid.dto.ChangePasswordRequest;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.Rest;

@Rest(rootUrl = BuildConfig.HOST,
        converters = MessageConverter.class,
        interceptors = AuthenticationInterceptor.class)
public interface UserService {

    /**
     * Method: POST <br>
     * URL: /v2/change-password
     *
     * @param changePasswordRequest {@link ChangePasswordRequest} request body
     */
    @Post("/v2/change-password")
    void changePassword(@Body ChangePasswordRequest changePasswordRequest);

}
