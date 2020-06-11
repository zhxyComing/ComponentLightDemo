package com.dixon.me;

import android.app.Application;

import com.dixon.simple.router.core.SRouter;

public class MeApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SRouter.init(this);
    }
}
