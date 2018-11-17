package com.project.dangkhoa.restaurantproject.function_activity;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.project.dangkhoa.restaurantproject.R;
import com.project.dangkhoa.restaurantproject.function_fragment.LoginGlobalFragment;
import com.project.dangkhoa.restaurantproject.function_fragment.LoginLocalFragment;

public class LoginActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        fragmentManager = getSupportFragmentManager();
        showLoginGlobal();

    }



    public void showRegisterActivity()
    {
        Intent intent = new Intent(this,RegisterActivity.class);
        startActivity(intent);
    }
    public void showLoginGlobal()
    {
        // SET FRAGMENT FOR LAYOUT
        // STEP 1: CALL THE FRAGMENT SUPPORTER
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        // STEP 2: CREATE THE FRAGMENT WAS BUILT
        LoginGlobalFragment loginGlobalFragment = new LoginGlobalFragment();
        // STEP 3: PUT THE FRAGMENT INTO CONTAINER
        transaction.replace(R.id.container,loginGlobalFragment);
        // STEP 4: COMMIT
        transaction.commit();
    }

    public void showLoginLocal()
    {
            // SET FRAGMENT FOR LAYOUT
            // STEP 1: CALL THE FRAGMENT SUPPORTER
        FragmentTransaction transaction = fragmentManager.beginTransaction();
            // STEP 2: CREATE THE FRAGMENT WAS BUILT
        LoginLocalFragment loginLocalFragment = new LoginLocalFragment();
            // STEP 3: PUT THE FRAGMENT INTO CONTAINER
        transaction.replace(R.id.container,loginLocalFragment);
            // STEP 4: COMMIT
        transaction.commit();
    }
}
