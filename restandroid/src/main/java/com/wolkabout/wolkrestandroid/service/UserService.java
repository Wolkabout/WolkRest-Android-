package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.Preferences;
import com.wolkabout.wolkrestandroid.dto.AccessTokenDto;
import com.wolkabout.wolkrestandroid.dto.AuthenticationResponseDto;
import com.wolkabout.wolkrestandroid.dto.ChangePasswordRequest;
import com.wolkabout.wolkrestandroid.dto.EmailVerificationRequest;
import com.wolkabout.wolkrestandroid.dto.RefreshTokenDto;
import com.wolkabout.wolkrestandroid.dto.ResetPasswordRequest;
import com.wolkabout.wolkrestandroid.dto.SignInDto;
import com.wolkabout.wolkrestandroid.dto.SignUpDto;
import com.wolkabout.wolkrestandroid.dto.UserSettingDto;

import org.androidannotations.rest.spring.annotations.Body;
import org.androidannotations.rest.spring.annotations.Get;
import org.androidannotations.rest.spring.annotations.Post;
import org.androidannotations.rest.spring.annotations.Put;
import org.androidannotations.rest.spring.annotations.Rest;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import java.util.List;

@Rest(rootUrl = Preferences.HOST, converters = MappingJackson2HttpMessageConverter.class)
public interface UserService {

    @Get("/v2/settings")
    List<UserSettingDto> getUserSettings();

    @Put("/v2/settings")
    void updateUserSettings(@Body UserSettingDto userSettingDto);

    @Post("/signUp")
    void signUp(@Body SignUpDto signUpDto);

    @Post("/signIn")
    AuthenticationResponseDto signIn(@Body SignInDto signInDto);

    @Post("/signOut")
    void signOut();

    @Post("/authenticate")
    AuthenticationResponseDto authenticate(@Body AccessTokenDto accessTokenDto);

    @Post("/refreshToken")
    AuthenticationResponseDto refreshToken(@Body RefreshTokenDto refreshTokenDto);

    @Post("/change-password")
    void changePassword(@Body ChangePasswordRequest changePasswordRequest);

    @Post("/verify-email")
    void verifyEmail(@Body EmailVerificationRequest emailVerificationRequest);

    @Post("/reset-password")
    void resetPassword(@Body ResetPasswordRequest resetPasswordRequest);

}
