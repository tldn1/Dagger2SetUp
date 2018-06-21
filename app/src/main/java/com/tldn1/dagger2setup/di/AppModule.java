package com.tldn1.dagger2setup.di;

import android.content.Context;

import com.tldn1.dagger2setup.base.MainActivityComponent;
import com.tldn1.dagger2setup.base.SayHiToGithub;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by tldn1 on 6/21/2018.
 */

@Module(subcomponents = {MainActivityComponent.class})
public class AppModule {

    @Provides
    Context provideContext(App application) {
        return application.getApplicationContext();
    }

    @Singleton
    @Provides
    SayHiToGithub provideHi() {
        return new SayHiToGithub();
    }

}
