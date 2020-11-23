package com.indogusmas.daggerretrofit;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public  abstract  class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract  MainActivity contributesMainActivity();


}
