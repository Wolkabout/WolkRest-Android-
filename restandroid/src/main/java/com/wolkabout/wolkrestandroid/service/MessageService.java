package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.AuthenticationInterceptor;
import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
import com.wolkabout.wolkrestandroid.MessageConverter;
import com.wolkabout.wolkrestandroid.Preferences;
import com.wolkabout.wolkrestandroid.dto.AcknowledgeMessageRequest;
import com.wolkabout.wolkrestandroid.dto.CountDto;
import com.wolkabout.wolkrestandroid.dto.MessageWithNameDto;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Path;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.androidannotations.rest.spring.api.RestClientErrorHandling;

import java.util.List;

@Rest(rootUrl = Preferences.HOST + "/v2/messages",
        converters = MessageConverter.class,
        interceptors = AuthenticationInterceptor.class,
        responseErrorHandler = DefaultErrorHandler.class)
public interface MessageService extends RestClientErrorHandling {

    /**
     * Method: PUT <br>
     * URL: /v2/messages/{id}
     *
     * @param id Integer path variable
     * @param request {@link AcknowledgeMessageRequest} request body
     */
    @Put("/{id}")
    void acknowledgeUnreadMessage(@Path int id, @Body AcknowledgeMessageRequest request);

    /**
     * Method: GET <br>
     * URL: /v2/messages/unread
     *
     * @return A list of {@link MessageWithNameDto}s
     */
    @Get("/unread")
    List<MessageWithNameDto> getAllUnreadMessages();

    /**
     * Method: GET <br>
     * URL: /v2/messages/unread/count
     *
     * @return {@link CountDto}
     */
    @Get("/unread/count")
    CountDto getAllUnreadMessageCount();

    /**
     * Method: PUT <br>
     * URL: /v2/messages/unread
     */
    @Put("/unread")
    void aknowledgeAllUnreadMessages();

    /**
     * Method: GET <br>
     * URL: /v2/messages?from={from}&pageSize={pageSize}
     *
     * @param from Long request parameter representing a date
     * @param pageSize Integer request parameter
     * @return A list of {@link MessageWithNameDto}s
     */
    @Get("?from={from}&pageSize={pageSize}")
    List<MessageWithNameDto> getMessagesForUserPaged(@Path long from, @Path int pageSize);

}
