package com.booksnippetshub;

import android.content.SharedPreferences;

public class CONFIG {


    public static final int REQUEST_WRITE_EXTERNAL_STORAGE = 1;


    public static final String baseUrl = "http://10.0.2.2:8080";

    public static SharedPreferences accountSharedPreferences;
    public static SharedPreferences settingSharedPreferences;
    public static String token;

}
