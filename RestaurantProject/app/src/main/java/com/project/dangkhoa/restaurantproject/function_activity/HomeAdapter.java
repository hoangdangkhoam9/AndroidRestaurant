package com.project.dangkhoa.restaurantproject.function_activity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.project.dangkhoa.restaurantproject.function_fragment.HomeBookmarkFragment;
import com.project.dangkhoa.restaurantproject.function_fragment.HomeBrowseFragment;
import com.project.dangkhoa.restaurantproject.function_fragment.HomeMapFragment;
import com.project.dangkhoa.restaurantproject.function_fragment.HomeNotificationFragment;
import com.project.dangkhoa.restaurantproject.function_fragment.HomeSearchFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragmentList = new ArrayList<>();
    public HomeAdapter(FragmentManager fm) {
        super(fm);
        fragmentList.add(new HomeBrowseFragment());
        fragmentList.add(new HomeSearchFragment());
        fragmentList.add(new HomeMapFragment());
        fragmentList.add(new HomeNotificationFragment());
        fragmentList.add(new HomeBookmarkFragment());
    }

    @Override
    public Fragment getItem(int position)
    {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        if (position == 0) return "Home";
        if (position == 1) return "Search";
        if (position == 2) return "Map";
        if (position == 3) return "Notification";
        return "Bookmark";
    }
}
