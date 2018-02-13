package com.tmignova.proyectox.Api.Retrofit;

import android.support.annotation.RestrictTo;

import com.google.gson.Gson;

import java.net.HttpURLConnection;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LENOVO on 8/1/2018.
 */

public class ApiClient extends BaseApi {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        HttpLoggingInterceptor interceptors = new HttpLoggingInterceptor();
        interceptors.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient().newBuilder().addInterceptor(interceptors).build();

        retrofit = new Retrofit.Builder().baseUrl(ApiClient.GetURL())
                .addConverterFactory(GsonConverterFactory.create())
                .client(client).build();
        return retrofit ;
    }
}
