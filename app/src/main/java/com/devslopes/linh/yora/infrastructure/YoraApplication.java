package com.devslopes.linh.yora.infrastructure;

import android.app.Application;

/**
 * Created by Linh on 6/18/2016.
 */
public class YoraApplication extends Application {
    private Auth auth;

    @Override
    public void onCreate() {
        super.onCreate();
        auth = new Auth(this);
    }

    public Auth getAuth() {
        return auth;
    }
}
