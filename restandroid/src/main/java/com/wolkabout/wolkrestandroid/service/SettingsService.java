package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
import com.wolkabout.wolkrestandroid.Preferences;
import com.wolkabout.wolkrestandroid.dto.UserSettingDto;
import com.wolkabout.wolkrestandroid.dto.UserSettingsDto;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

@Rest(rootUrl = Preferences.HOST + "/v2/settings",
        converters = MappingJackson2HttpMessageConverter.class,
        interceptors = AuthenticationInterceptor.class,
        responseErrorHandler = DefaultErrorHandler.class)
public interface SettingsService {

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
