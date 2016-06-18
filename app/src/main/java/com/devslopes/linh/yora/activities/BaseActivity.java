package com.devslopes.linh.yora.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.devslopes.linh.yora.infrastructure.YoraApplication;

/**
 * Created by Linh on 6/18/2016.
 */
public abstract class BaseActivity extends AppCompatActivity{

    protected YoraApplication application;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (YoraApplication) getApplication();
    }
}
