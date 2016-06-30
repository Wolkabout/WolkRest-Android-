package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
import com.wolkabout.wolkrestandroid.Preferences;
import com.wolkabout.wolkrestandroid.dto.MobileDeviceRequest;
import com.wolkabout.wolkrestandroid.enumeration.MobileDeviceType;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Delete;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Rest(rootUrl = Preferences.HOST + "/v2/mobile-devices",
        converters = MappingJackson2HttpMessageConverter.class,
        interceptors = AuthenticationInterceptor.class,
        responseErrorHandler = DefaultErrorHandler.class)
public interface MobileDevicesService {

    /**
     * Method: POST <br>
     * URL: /v2/mobile-devices
     * @param request {@link MobileDeviceRequest} request body
     */
    @Post("")
    void registerMobileDevice(@Body MobileDeviceRequest request);

    /**
     * Method: DELETE <br>
     * URL: /v2/mobile-devices?deviceId={deviceId}&deviceType={deviceType}
     *
     * @param deviceId String request parameter
     * @param deviceType {@link MobileDeviceType} Enum String request parameter
     */
    @Delete("?deviceId={deviceId}&deviceType={deviceType}")
    void removeMobileDevice(@Path String deviceId, @Path MobileDeviceType deviceType);

}
