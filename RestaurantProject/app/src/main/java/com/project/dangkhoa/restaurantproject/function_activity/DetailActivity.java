package com.project.dangkhoa.restaurantproject.function_activity;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.dangkhoa.restaurantproject.R;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    private ViewPager viewPager;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPagerBody);

        tabLayout.setupWithViewPager(viewPager);
        DetailAdapter adapter = new DetailAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        for (int i = 0; i < tabLayout.getTabCount(); i++)
        {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setCustomView(R.layout.tablayout_detail_item);
            View customize = tab.getCustomView();
            TextView textView = customize.findViewById(R.id.txtDetailTablayoutItem);
            if(i==0)
                {
                    textView.setText("Overview");
                    textView.setTextColor(Color.parseColor("#52bc3d"));
                }
            if(i==1) textView.setText("Menu");
            if(i==2) textView.setText("Review");
        }
        // set selected background for onclick event
        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {

            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                View customize = tab.getCustomView();
                TextView textView = customize.findViewById(R.id.txtDetailTablayoutItem);
                if(position==0) textView.setTextColor(Color.parseColor("#52bc3d"));
                if(position==1) textView.setTextColor(Color.parseColor("#52bc3d"));
                if(position==2) textView.setTextColor(Color.parseColor("#52bc3d"));
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                View customize = tab.getCustomView();
                TextView textView = customize.findViewById(R.id.txtDetailTablayoutItem);
                if(position==0) textView.setTextColor(Color.parseColor("#000000"));
                if(position==1) textView.setTextColor(Color.parseColor("#000000"));
                if(position==2) textView.setTextColor(Color.parseColor("#000000"));
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}

