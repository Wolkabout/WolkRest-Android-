package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.restandroid.BuildConfig;
import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
import com.wolkabout.wolkrestandroid.MessageConverter;
import com.wolkabout.wolkrestandroid.dto.FeedReportResponse;
import com.wolkabout.wolkrestandroid.dto.ReportDto;
import com.wolkabout.wolkrestandroid.dto.ReportIdDto;
import com.wolkabout.wolkrestandroid.dto.UpdatePointBodyDTO;
import com.wolkabout.wolkrestandroid.enumeration.Range;

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
public interface ReportService extends RestClientErrorHandling {

    /**
     * Method: GET <br>
     * URL: /v2/reports
     *
     * @return A list of {@link ReportDto}s
     */
    @Get("/v2/reports")
    List<ReportDto> getReports();

    /**
     * Method: POST <br>
     * URL: /v2/reports
     *
     * @param reportDto {@link ReportDto} request body
     * @return {@link ReportIdDto}
     */
    @Post("/v2/reports")
    ReportIdDto createReport(@Body ReportDto reportDto);

    /**
     * Method: PUT <br>
     * URL: /v2/reports/{id}
     *
     * @param id Integer path variable
     * @param updatePointBodyDTO {@link UpdatePointBodyDTO} request body
     */
    @Put("/v2/reports/{id}")
    void updateReport(@Path int id, @Body UpdatePointBodyDTO updatePointBodyDTO);

    /**
     * Method: DELETE <br>
     * URL: /v2/reports/{id}
     *
     * @param id Integer path variable
     */
    @Delete("/v2/reports/{id}")
    void deleteReport(@Path int id);

    /**
     * Method: GET <br>
     * URL: /v2/reports/{id}
     *
     * @param id Integer path variable
     * @return {@link ReportDto}
     */
    @Get("/v2/reports/{id}")
    ReportDto getReport(@Path int id);

    /**
     * Method: GET <br>
     * URL: /v2/reports/{id}/snapshot?from={from}&to={to}&range={range}
     *
     * @param id Integer path variable
     * @param from Long request parameter representing a date
     * @param to Long request parameter representing a date
     * @param range {@link Range} Enum String request parameter
     * @return A list of {@link FeedReportResponse}s
     */
    @Get("/v2/reports/{id}/snapshot?from={from}&to={to}&range={range}")
    List<FeedReportResponse> getExistingReportSnapshot(@Path int id, @Path long from, @Path long to, @Path Range range);

    /**
     * Method: GET <br>
     * URL: /v3/reports/snapshot?name={name}&from={from}&to={to}&range={range}&feeds={feeds}
     *
     * @param name String request parameter
     * @param settings String request parameter
     * @param from Long request parameter representing a date
     * @param to Long request parameter representing a date
     * @param range {@link Range} Enum String request parameter
     * @param feeds Integer request parameter
     * @return A list of {@link FeedReportResponse}s
     */
    @Get("/v3/reports/snapshot?name={name}&settings={settings}&from={from}&to={to}&range={range}&feeds={feeds}")
    List<FeedReportResponse> getReportSnapshot(@Path String name, @Path String settings, @Path long from, @Path long to, @Path Range range, @Path int feeds);

    /**
     * Method: GET <br>
     * URL: /v3/reports/snapshot?name={name}&from={from}&to={to}&range={range}&feeds={feeds}
     *
     * @param name String request parameter
     * @param settings String request parameter
     * @param from Long request parameter representing a date
     * @param to Long request parameter representing a date
     * @param range {@link Range} Enum String request parameter
     * @param feeds String pre constructed request parameter (ex. feeds=1&feeds=2&feeds=3...)
     * @return A list of {@link FeedReportResponse}s
     */
    @Get("/v3/reports/snapshot?name={name}&settings={settings}&from={from}&to={to}&range={range}&{feeds}")
    List<FeedReportResponse> getReportSnapshot(@Path String name, @Path String settings, @Path long from, @Path long to, @Path Range range, @Path String feeds);


}
