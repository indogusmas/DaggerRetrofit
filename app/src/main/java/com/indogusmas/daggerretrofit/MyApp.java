package com.indogusmas.daggerretrofit;



import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApp extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return  DaggerAppComponent.builder().application(this).build();
    }
}
