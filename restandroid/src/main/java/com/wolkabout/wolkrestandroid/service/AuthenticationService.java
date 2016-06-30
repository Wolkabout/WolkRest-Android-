package com.wolkabout.wolkrestandroid.service;

import com.wolkabout.wolkrestandroid.DefaultErrorHandler;
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

@Rest(rootUrl = Preferences.HOST,
        converters = MappingJackson2HttpMessageConverter.class,
        responseErrorHandler = DefaultErrorHandler.class)
public interface AuthenticationService {

    /**
     * Method: POST <br>
     * URL: /signUp
     *
     * @param signUpDto {@link SignUpDto} request body
     */
    @Post("/signUp")
    void signUp(@Body SignUpDto signUpDto);

    /**
     * Method: POST <br>
     * URL: /signIn
     *
     * @param signInDto {@link SignInDto} request body
     * @return {@link AuthenticationResponseDto}
     */
    @Post("/signIn")
    AuthenticationResponseDto signIn(@Body SignInDto signInDto);

    /**
     * Method: POST <br>
     * URL: /signOut
     */
    @Post("/signOut")
    void signOut();

    /**
     * Method: POST <br>
     * URL: /authenticate
     *
     * @param accessTokenDto {@link AccessTokenDto} request body
     * @return {@link AuthenticationResponseDto}
     */
    @Post("/authenticate")
    AuthenticationResponseDto authenticate(@Body AccessTokenDto accessTokenDto);

    /**
     * Method: POST <br>
     * URL: /refreshToken
     *
     * @param refreshTokenDto {@link RefreshTokenDto} request body
     * @return {@link AuthenticationResponseDto}
     */
    @Post("/refreshToken")
    AuthenticationResponseDto refreshToken(@Body RefreshTokenDto refreshTokenDto);

    /**
     * Method: POST <br>
     * URL: /change-password
     *
     * @param changePasswordRequest {@link ChangePasswordRequest} request body
     */
    @Post("/change-password")
    void changePassword(@Body ChangePasswordRequest changePasswordRequest);

    /**
     * Method: POST <br>
     * URL: /verify-email
     *
     * @param emailVerificationRequest {@link EmailVerificationRequest} request body
     */
    @Post("/verify-email")
    void verifyEmail(@Body EmailVerificationRequest emailVerificationRequest);

    /**
     * Method: POST <br>
     * URL: /reset-password
     *
     * @param resetPasswordRequest {@link ResetPasswordRequest} request body
     */
    @Post("/reset-password")
    void resetPassword(@Body ResetPasswordRequest resetPasswordRequest);

}
