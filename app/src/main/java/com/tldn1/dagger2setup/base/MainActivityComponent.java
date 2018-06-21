package com.tldn1.dagger2setup.base;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by tldn1 on 6/21/2018.
 */
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
