package com.project.dangkhoa.restaurantproject.function_fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.project.dangkhoa.restaurantproject.R;
import com.project.dangkhoa.restaurantproject.function_activity.LoginActivity;
import com.project.dangkhoa.restaurantproject.function_activity.RegisterActivity;

public class LoginLocalFragment extends Fragment {

    private TextView txtUserName;
    private TextView txtPassWord;
    private Button btnLogin;
    private Button btnSignUp;
    private ConstraintLayout constraintPolicy;

    public LoginLocalFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
            // MAKE SURE THAT YOU ALREADY HAVE LAYOUT FOR THIS FRAGMENT
            // STEP 1: GET CONTEXT
        Context context = getContext();
            // STEP 2: CREATE SUPPORTER TO ACCESS THE LAYOUT
        LayoutInflater layoutInflater= LayoutInflater.from(context);
            // STEP 3: ACCESS THE RESOURCE IN THE LAYOUT
        View view = layoutInflater.inflate(R.layout.fragment_login_local,container,false);

        txtUserName = view.findViewById(R.id.txtUserName);
        txtPassWord = view.findViewById(R.id.txtPassWord);
        btnLogin = view.findViewById(R.id.btnLogin);
        btnSignUp = view.findViewById(R.id.btnSignUp);
        constraintPolicy = view.findViewById(R.id.constraintPolicy);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginActivity loginActivity = (LoginActivity) getActivity();
                loginActivity.showRegisterActivity();
            }
        });

        return view;
    }

}
