package com.dixon.reader;

import android.app.Application;

import com.dixon.simple.router.core.SRouter;

public class ReaderApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SRouter.init(this);
    }
}
