package com.wolkabout.wolkrestandroid.service;

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

@Rest(rootUrl = Preferences.HOST + "/v2/devices", converters = MappingJackson2HttpMessageConverter.class)
public interface DeviceService {

    @Get("/{serialNumber}/activation_status")
    DeviceStatusResponse getDeviceStatus(@Path String serialNumber);

    @Post("/{serialNumber}")
    void createPoint(@Path String serialNumber, @Body CreatePointBodyDTO createPointBodyDTO);

    @Put("/{serialNumber}/workingStatus")
    void turnOffDevice(@Path String serialNumber, @Body SerialNumberRequest serialNumberRequest);

    @Delete("/{serialNumber}")
    void deactivateDevice(@Path String serialNumber);

}
