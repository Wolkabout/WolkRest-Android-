package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.Preferences;
import com.wolkabout.wolkrestandroid.dto.MessageResponse;
import com.wolkabout.wolkrestandroid.dto.PointWithFeedsResponse;
import com.wolkabout.wolkrestandroid.dto.UpdatePointBodyDTO;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Delete;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

@Rest(rootUrl = Preferences.HOST, converters = MappingJackson2HttpMessageConverter.class)
public interface PointService {

    @Get("/v3/points")
    List<PointWithFeedsResponse> getPoints();

    @Get("/v3/points/{id}")
    PointWithFeedsResponse getPoint(@Path int id);

    @Get("/v2/points/{id}/messages?from={from}&to={to}")
    List<MessageResponse> getUnreadMessagesForPoint(@Path int id, @Path long from, @Path long to);

    @Put("/v2/points/{id}/messages")
    void acknowledgeUnreadMessagesForPoint(@Path int id);

    @Delete("/v2/points/{id}")
    void deletePoint(@Path int id);

    @Put("/v2/points/{id}")
    void updatePoint(@Path int id, @Body UpdatePointBodyDTO updatePointBodyDTO);

}
