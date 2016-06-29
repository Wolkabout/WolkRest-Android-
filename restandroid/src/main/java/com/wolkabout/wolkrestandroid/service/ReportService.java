package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.Preferences;
import com.wolkabout.wolkrestandroid.dto.FeedReportResponse;
import com.wolkabout.wolkrestandroid.dto.MobileDeviceRequest;
import com.wolkabout.wolkrestandroid.dto.ReportDto;
import com.wolkabout.wolkrestandroid.dto.ReportIdDto;
import com.wolkabout.wolkrestandroid.dto.UpdatePointBodyDTO;
import com.wolkabout.wolkrestandroid.enumeration.MobileDeviceType;
import com.wolkabout.wolkrestandroid.enumeration.Range;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Delete;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

@Rest(rootUrl = Preferences.HOST, converters = MappingJackson2HttpMessageConverter.class)
public interface ReportService {

    @Get("/v2/reports")
    List<ReportDto> getReports();

    @Post("/v2/reports")
    ReportIdDto createReport(@Body ReportDto reportDto);

    @Put("/v2/reports/{id}")
    void updateReport(@Path int id, @Body UpdatePointBodyDTO updatePointBodyDTO);

    @Delete("/v2/reports/{id}")
    void deleteReport(@Path int id);

    @Get("/v2/reports/{id}")
    ReportDto getReport(@Path int id);

    @Get("/v2/reports/{id}/snapshot?from={from}&to={to}&range={range}")
    List<FeedReportResponse> getExistingReportSnapshot(@Path int id, @Path long from, @Path long to, @Path Range range);

    @Post("/v2/mobile-devices")
    void registerMobileDevice(@Body MobileDeviceRequest request);

    @Delete("/v2/moobile-devices?deviceId={deviceId}&deviceType={deviceType}")
    void removeMobileDevice(@Path String deviceId, @Path MobileDeviceType deviceType);

}
