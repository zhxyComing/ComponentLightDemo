package com.dixon.componentstudy;

import android.app.Application;

import com.dixon.simple.router.core.SRouter;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SRouter.init(this);
    }
}
