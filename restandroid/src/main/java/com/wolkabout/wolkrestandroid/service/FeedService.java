package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.Preferences;
import com.wolkabout.wolkrestandroid.dto.FeedSettingsRequest;
import com.wolkabout.wolkrestandroid.dto.ReadingResponse;
import com.wolkabout.wolkrestandroid.enumeration.AggregationLevel;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

@Rest(rootUrl = Preferences.HOST + "/v2/feeds", converters = MappingJackson2HttpMessageConverter.class)
public interface FeedService {

    @Put("/settings")
    void updateFeedSettings(@Body FeedSettingsRequest feedSettingsRequest);

    @Get("/{feedId}/readings?from={from}&to={to}&aggregationLevel={aggregationLevel}")
    List<ReadingResponse> getReadingsForPoint(@Path int feedId, @Path long from, @Path long to, @Path AggregationLevel aggregationLevel);

}
