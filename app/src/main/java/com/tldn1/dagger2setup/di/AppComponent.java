package com.tldn1.dagger2setup.di;

import com.tldn1.dagger2setup.base.BuilderModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by tldn1 on 6/21/2018.
 */
@Singleton
@Component(modules = {BuilderModule.class,
        AndroidSupportInjectionModule.class,
        AppModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App app);

        AppComponent build();
    }

    void inject(App app);

}
