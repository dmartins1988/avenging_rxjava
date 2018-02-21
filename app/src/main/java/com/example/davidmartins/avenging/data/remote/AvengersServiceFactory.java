package com.example.davidmartins.avenging.data.remote;

import com.google.gson.Gson;

import com.example.davidmartins.avenging.BuildConfig;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Factory class containing methods to create instances and its related dependencies
 */

public class AvengersServiceFactory {

    public static AvengersService makeAvengersService() {
        OkHttpClient okHttpClient = makeOkHttpClient(makeLoggingInterceptor());
        return makeAvengersService(okHttpClient);
    }

    private static AvengersService makeAvengersService(final OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BuildConfig.BASE_URL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(new Gson()))
                .build();
        return retrofit.create(AvengersService.class);
    }

    private static OkHttpClient makeOkHttpClient(final HttpLoggingInterceptor httpLoggingInterceptor) {
        return new OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build();
    }

    private static HttpLoggingInterceptor makeLoggingInterceptor() {
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(BuildConfig.DEBUG ? HttpLoggingInterceptor.Level.BASIC : HttpLoggingInterceptor.Level.NONE);
        return httpLoggingInterceptor;
    }

}
