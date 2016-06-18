package com.devslopes.linh.yora.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.devslopes.linh.yora.infrastructure.YoraApplication;

/**
 * Created by Linh on 6/18/2016.
 */
public abstract class BaseFragment extends Fragment {

    protected YoraApplication application;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (YoraApplication) getActivity().getApplication();

    }
}
