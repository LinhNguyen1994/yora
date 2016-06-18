package com.devslopes.linh.yora.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.devslopes.linh.yora.R;

/**
 * Created by Linh on 6/18/2016.
 */
public class LoginFragment extends BaseFragment implements View.OnClickListener{
    private Button logginButton;
    private Callbacks callbacks;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup root, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_login, root,false);

        logginButton = (Button) view.findViewById(R.id.fragment_login_loginButton);
        logginButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == logginButton) {
            //notify parent Activity
            application.getAuth().getUser().setLoggedIn(true);
            callbacks.onLoggedIn();
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        callbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callbacks = null;
    }

    public interface Callbacks {
        void onLoggedIn();
    }
}
