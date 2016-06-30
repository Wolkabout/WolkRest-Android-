package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
import com.wolkabout.wolkrestandroid.Preferences;
import com.wolkabout.wolkrestandroid.dto.CreatePointBodyDTO;
import com.wolkabout.wolkrestandroid.dto.DeviceStatusResponse;
import com.wolkabout.wolkrestandroid.dto.SerialNumberRequest;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Delete;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

@Rest(rootUrl = Preferences.HOST + "/v2/devices",
        converters = MappingJackson2HttpMessageConverter.class,
        interceptors = AuthenticationInterceptor.class,
        responseErrorHandler = DefaultErrorHandler.class)
public interface DeviceService {

    /**
     * Method: GET <br>
     * URL: /v2/devices/{serialNumber}/activation_status
     *
     * @param serialNumber String path parameter
     * @return {@link DeviceStatusResponse}
     */
    @Get("/{serialNumber}/activation_status")
    DeviceStatusResponse getDeviceStatus(@Path String serialNumber);

    /**
     * Method: POST <br>
     * URL: /v2/devices/{serialNumber}
     *
     * @param serialNumber String path variable
     * @param createPointBodyDTO {@link CreatePointBodyDTO} request body
     */
    @Post("/{serialNumber}")
    void createPoint(@Path String serialNumber, @Body CreatePointBodyDTO createPointBodyDTO);

    /**
     * Method: PUT <br>
     * URL: /v2/devices/{serialNumber}/workingStatus
     *
     * @param serialNumber String path parameter
     * @param serialNumberRequest {@link SerialNumberRequest} passed as request body.
     */
    @Put("/{serialNumber}/workingStatus")
    void turnOffDevice(@Path String serialNumber, @Body SerialNumberRequest serialNumberRequest);

    /**
     * Method: DELETE <br>
     * URL: /v2/devices/{serialNumber}
     * @param serialNumber String path parameter
     */
    @Delete("/{serialNumber}")
    void deactivateDevice(@Path String serialNumber);

}
