package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.restandroid.BuildConfig;
import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
import com.wolkabout.wolkrestandroid.MessageConverter;
import com.wolkabout.wolkrestandroid.dto.MessageResponse;
import com.wolkabout.wolkrestandroid.dto.PointWithFeedsResponse;
import com.wolkabout.wolkrestandroid.dto.UpdatePointBodyDTO;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Delete;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;

import java.util.List;

@Rest(rootUrl = BuildConfig.HOST,
        converters = MessageConverter.class,
        interceptors = AuthenticationInterceptor.class,
        responseErrorHandler = DefaultErrorHandler.class)
public interface PointService extends RestClientErrorHandling {

    /**
     * Method: GET <br>
     * URL: /v4/points
     *
     * @return A list of {@link PointWithFeedsResponse}s
     */
    @Get("/v4/points")
    List<PointWithFeedsResponse> getPoints();

    /**
     * Method: GET <br>
     * URL: /v4/points/{id}
     *
     * @param id Integer path variable
     * @return {@link PointWithFeedsResponse}
     */
    @Get("/v4/points/{id}")
    PointWithFeedsResponse getPoint(@Path int id);


    /**
     * Method: GET <br>
     * URL: /v2/points/{id}/messages?from={from}&to={to}
     *
     * @param id Integer path variable
     * @param from Long request parameter representing a date
     * @param to Long request parameter representing a date
     * @return A list of {@link MessageResponse}s
     */
    @Get("/v2/points/{id}/messages?from={from}&to={to}")
    List<MessageResponse> getUnreadMessagesForPoint(@Path int id, @Path long from, @Path long to);

    /**
     * Method: PUT <br>
     * URL: /v2/points/{id}/messages
     *
     * @param id Integer path variable
     */
    @Put("/v2/points/{id}/messages")
    void acknowledgeUnreadMessagesForPoint(@Path int id);

    /**
     * Method: DELETE <br>
     * URL: /v2/points/{id}
     *
     * @param id Integer path variable
     */
    @Delete("/v2/points/{id}")
    void deletePoint(@Path int id);

    /**
     * Method: PUT <br>
     * URL: /v2/points/{id}
     *
     * @param id Integer path variable
     * @param updatePointBodyDTO {@link UpdatePointBodyDTO} request body
     */
    @Put("/v2/points/{id}")
    void updatePoint(@Path int id, @Body UpdatePointBodyDTO updatePointBodyDTO);

}
