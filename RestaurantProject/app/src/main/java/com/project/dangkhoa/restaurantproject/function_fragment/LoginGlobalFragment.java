package com.project.dangkhoa.restaurantproject.function_fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.project.dangkhoa.restaurantproject.R;
import com.project.dangkhoa.restaurantproject.function_activity.LoginActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginGlobalFragment extends Fragment {

    private Button btnAccount;
    private Button btnGoogle;
    private Button btnFacebook;
    private ConstraintLayout constraintPolicy;


    public LoginGlobalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

            // MAKE SURE THAT YOU ALREADY HAVE LAYOUT FOR THIS FRAGMENT
            // STEP 1: GET CONTEXT
        Context context = getContext();
            // STEP 2: CREATE SUPPORTER TO ACCESS THE LAYOUT
        LayoutInflater layoutInflater= LayoutInflater.from(context);
            // STEP 3: ACCESS THE RESOURCE IN THE LAYOUT
        View view = layoutInflater.inflate(R.layout.fragment_login_global,container,false);

        btnAccount = view.findViewById(R.id.btnAccount);
        btnGoogle = view.findViewById(R.id.btnGoogle);
        btnFacebook = view.findViewById(R.id.btnFacebook);
        constraintPolicy = view.findViewById(R.id.constraintPolicy);

        btnAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                LoginActivity loginActivity = (LoginActivity) getActivity();
                loginActivity.showLoginLocal();
            }
        });

        return view;


    }

}
