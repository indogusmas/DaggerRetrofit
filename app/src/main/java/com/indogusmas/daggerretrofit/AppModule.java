package com.indogusmas.daggerretrofit;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    @Singleton
    @Provides
    static String providerString() {
        return "indo ganteng";
    }

    @Singleton
    @Provides
    static Context providerContent(Application application) {
        return application.getApplicationContext();
    }


    /**
     * https://jsonplaceholder.typicode.com/posts?userId=1
     * @return
     */
    @Singleton
    @Provides
    static Retrofit provideRetrofit() {
        return new Retrofit
                .Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Singleton
    @Provides
    static  ApiService provideService(Retrofit retrofit){
        return  retrofit.create(ApiService.class);
    }


}
