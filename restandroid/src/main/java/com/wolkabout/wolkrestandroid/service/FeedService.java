package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.restandroid.BuildConfig;
import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
import com.wolkabout.wolkrestandroid.MessageConverter;
import com.wolkabout.wolkrestandroid.dto.FeedSettingsRequest;
import com.wolkabout.wolkrestandroid.dto.ReadingResponse;
import com.wolkabout.wolkrestandroid.enumeration.AggregationLevel;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;

import java.util.List;

@Rest(rootUrl = BuildConfig.HOST + "/v2/feeds",
        converters = MessageConverter.class,
        interceptors = AuthenticationInterceptor.class,
        responseErrorHandler = DefaultErrorHandler.class)
public interface FeedService extends RestClientErrorHandling {

    /**
     * Method: PUT <br>
     * URL: /v2/feeds/settings
     *
     * @param feedSettingsRequest {@link FeedSettingsRequest} request body
     */
    @Put("/settings")
    void updateFeedSettings(@Body FeedSettingsRequest feedSettingsRequest);

    /**
     * Method: GET <br>
     * URL: /v2/feeds/{feedId}/readings?from={from}&to={to}&aggregationLevel={aggregationLevel}
     *
     * @param feedId Integer path variable
     * @param from Long request parameter representing a date
     * @param to Long request parameter representing a date
     * @param aggregationLevel {@link AggregationLevel} Enum String request parameter
     * @return A list of {@link ReadingResponse}s
     */
    @Get("/{feedId}/readings?from={from}&to={to}&aggregationLevel={aggregationLevel}")
    List<ReadingResponse> getReadingsForPoint(@Path int feedId, @Path long from, @Path long to, @Path AggregationLevel aggregationLevel);

}
