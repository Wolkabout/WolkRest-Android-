package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.restandroid.BuildConfig;
import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
import com.wolkabout.wolkrestandroid.MessageConverter;
import com.wolkabout.wolkrestandroid.dto.CreatePointBodyDTO;
import com.wolkabout.wolkrestandroid.dto.CreatedPointDto;
import com.wolkabout.wolkrestandroid.dto.DeviceStatusResponse;
import com.wolkabout.wolkrestandroid.dto.SerialDto;
import com.wolkabout.wolkrestandroid.dto.SerialNumberRequest;
import com.wolkabout.wolkrestandroid.enumeration.SensorType;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Delete;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;

import java.util.List;

@Rest(rootUrl = BuildConfig.HOST,
        converters = MessageConverter.class,
        interceptors = AuthenticationInterceptor.class,
        responseErrorHandler = DefaultErrorHandler.class)
public interface DeviceService extends RestClientErrorHandling {

    /**
     * Method: GET <br>
     * URL: /v2/devices/{serialNumber}/activation_status
     *
     * @param serialNumber String path parameter
     * @return {@link DeviceStatusResponse}
     */
    @Get("/v2/devices/{serialNumber}/activation_status")
    DeviceStatusResponse getDeviceStatus(@Path String serialNumber);

    /**
     * Method: POST <br>
     * URL: /v2/devices/{serialNumber}
     *
     * @param serialNumber String path variable
     * @param createPointBodyDTO {@link CreatePointBodyDTO} request body
     */
    @Post("/v2/devices/{serialNumber}")
    void createPoint(@Path String serialNumber, @Body CreatePointBodyDTO createPointBodyDTO);

    /**
     * Method: PUT <br>
     * URL: /v2/devices/{serialNumber}/workingStatus
     *
     * @param serialNumber String path parameter
     * @param serialNumberRequest {@link SerialNumberRequest} passed as request body.
     */
    @Put("/v2/devices/{serialNumber}/workingStatus")
    void turnOffDevice(@Path String serialNumber, @Body SerialNumberRequest serialNumberRequest);

    /**
     * Method: DELETE <br>
     * URL: /v2/devices/{serialNumber}
     * @param serialNumber String path parameter
     */
    @Delete("/v2/devices/{serialNumber}")
    void deactivateDevice(@Path String serialNumber);

    /**
     * Method: GET <br>
     * URL: /v2/devices/{serialNumber}/activation_status
     *
     * @param type enum {@link SensorType} path parameter
     * @return {@link DeviceStatusResponse}
     */
    @Get("/v3/devices/random_serial?type={type}")
    SerialDto getRandomSerial(@Path SensorType type);

    /**
     * Method: POST <br>
     * URL: /v2/devices/{serialNumber}
     *
     * @param serialNumber String path variable
     * @param bodyDTOs A list of {@link CreatePointBodyDTO}s request body
     */
    @Post("/v3/devices/{serialNumber}/config")
    List<CreatedPointDto> createPointWithThings(@Path String serialNumber, @Body List<CreatePointBodyDTO> bodyDTOs);

}
