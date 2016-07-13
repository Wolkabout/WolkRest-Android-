package com.wolkabout.wolkrestandroid;


import android.util.Log;

import com.fasterxml.jackson.databind.JavaType;

import org.androidannotations.annotations.EBean;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;

@EBean
public class MessageConverter extends MappingJackson2HttpMessageConverter {

    private static final String TAG = MessageConverter.class.getSimpleName();

    @Override
    public Object read(Type type, Class<?> contextClass, HttpInputMessage inputMessage) throws IOException, HttpMessageNotReadableException {
        final JavaType javaType = getJavaType(type, contextClass);
        return readJavaType(javaType, inputMessage);
    }

    private Object readJavaType(JavaType javaType, HttpInputMessage inputMessage) {
        try {
            return getObjectMapper().readValue(inputMessage.getBody(), javaType);
        } catch (IOException ex) {
            Log.e(TAG, "Error while converting message to " + javaType);
            Log.e(TAG, "Error details", ex);
            if (javaType.isCollectionLikeType()) {
                return new ArrayList<>();
            } else if (javaType.isPrimitive()) {
                return 0;
            } else {
                return null;
            }
        }
    }

}
