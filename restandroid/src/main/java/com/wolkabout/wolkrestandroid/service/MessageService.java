package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.Preferences;
import com.wolkabout.wolkrestandroid.dto.AcknowledgeMessageRequest;
import com.wolkabout.wolkrestandroid.dto.CountDto;
import com.wolkabout.wolkrestandroid.dto.MessageWithNameDto;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

@Rest(rootUrl = Preferences.HOST + "/v2/messages", converters = MappingJackson2HttpMessageConverter.class)
public interface MessageService {

    @Put("/{id}")
    void acknowledgeUnreadMessage(@Path int id, @Body AcknowledgeMessageRequest request);

    @Get("/unread")
    List<MessageWithNameDto> getAllUnreadMessages();

    @Get("/unread/count")
    CountDto getAllUnreadMessageCount();

    @Put("/unread")
    void aknowledgeAllUnreadMessages();

    @Get("?from={from}&pageSize={pageSize}")
    List<MessageWithNameDto> getMessagesForUserPaged(@Path long from, @Path int pageSize);

}
