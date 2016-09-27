package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.restandroid.BuildConfig;
import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
import com.wolkabout.wolkrestandroid.MessageConverter;
import com.wolkabout.wolkrestandroid.dto.UserSettingDto;
import com.wolkabout.wolkrestandroid.dto.UserSettingsDto;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;

import java.util.List;

@Rest(rootUrl = BuildConfig.HOST + "/v2/settings",
        converters = MessageConverter.class,
        interceptors = AuthenticationInterceptor.class,
        responseErrorHandler = DefaultErrorHandler.class)
public interface SettingsService extends RestClientErrorHandling {

    /**
     * Method: GET <br>
     * URL: /v2/settings
     *
     * @return A list of {@link UserSettingDto}s
     */
    @Get("")
    List<UserSettingDto> getUserSettings();

    /**
     * Method: PUT <br>
     * URL: /v2/settings
     *
     * @param userSettingDto {@link UserSettingsDto} request body
     */
    @Put("")
    void updateUserSettings(@Body UserSettingsDto userSettingDto);

}
