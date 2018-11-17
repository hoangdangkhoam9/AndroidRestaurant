package com.project.dangkhoa.restaurantproject.function_activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.project.dangkhoa.restaurantproject.R;

public class HomeActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPagerBody);

        tabLayout.setupWithViewPager(viewPager);
        HomeAdapter adapter = new HomeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        // set background for every item
        for (int i = 0; i < tabLayout.getTabCount(); i++)
        {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(R.layout.tablayout_item);
            View customize = tab.getCustomView();
            ImageView background = customize.findViewById(R.id.imgTabLayoutItem);
            if(i==0) background.setImageResource(R.drawable.ic_home_browse_selected);
            if(i==1) background.setImageResource(R.drawable.ic_home_search);
            if(i==2) background.setImageResource(R.drawable.ic_home_map);
            if(i==3) background.setImageResource(R.drawable.ic_home_notification);
            if(i==4) background.setImageResource(R.drawable.ic_home_bookmark);
        }
        // set selected background for onclick event
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                View customize = tab.getCustomView();
                ImageView background = customize.findViewById(R.id.imgTabLayoutItem);
                if(position==0) background.setImageResource(R.drawable.ic_home_browse_selected);
                if(position==1) background.setImageResource(R.drawable.ic_home_search_selected);
                if(position==2) background.setImageResource(R.drawable.ic_home_map);
                if(position==3) background.setImageResource(R.drawable.ic_home_notification_selected);
                if(position==4) background.setImageResource(R.drawable.ic_home_bookmark_selected);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                View customize = tab.getCustomView();
                ImageView background = customize.findViewById(R.id.imgTabLayoutItem);
                if(position==0) background.setImageResource(R.drawable.ic_home_browse);
                if(position==1) background.setImageResource(R.drawable.ic_home_search);
                if(position==2) background.setImageResource(R.drawable.ic_home_map);
                if(position==3) background.setImageResource(R.drawable.ic_home_notification);
                if(position==4) background.setImageResource(R.drawable.ic_home_bookmark);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
