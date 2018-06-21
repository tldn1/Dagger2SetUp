package com.tldn1.dagger2setup.base;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by tldn1 on 6/21/2018.
 */

@Module
public abstract class BuilderModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivityInjectorFactory(MainActivityComponent.Builder builder);

    //here you can add more bindings
}
