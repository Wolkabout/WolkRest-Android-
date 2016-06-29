package com.wolkabout.wolkrestandroid;

import org.androidannotations.annotations.sharedpreferences.SharedPref;

@SharedPref(SharedPref.Scope.UNIQUE)
public interface Credentials {

    String username();

    String accessToken();

    String refreshToken();

    String accessTokenExpires();

    String refreshTokenExpires();

}
