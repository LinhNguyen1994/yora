package com.devslopes.linh.yora.activities;

import android.os.Bundle;

import com.devslopes.linh.yora.R;
import com.devslopes.linh.yora.fragments.LoginFragment;

/**
 * Created by Linh on 6/18/2016.
 */
public class LoginNarrowActivity extends BaseActivity implements LoginFragment.Callbacks{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_narrow);

    }

    @Override
    public void onLoggedIn() {
        setResult(RESULT_OK);
        finish();
    }
}
