package com.project.dangkhoa.restaurantproject.function_activity;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.project.dangkhoa.restaurantproject.function_fragment.DetailMenuFragment;
import com.project.dangkhoa.restaurantproject.function_fragment.DetailOverviewFragment;
import com.project.dangkhoa.restaurantproject.function_fragment.DetailReviewFragment;

import java.util.ArrayList;
import java.util.List;

public class DetailAdapter extends FragmentStatePagerAdapter {
    List<Fragment> fragmentList = new ArrayList<>();

    public DetailAdapter(FragmentManager fm)
    {
        super(fm);
        fragmentList.add(new DetailOverviewFragment());
        fragmentList.add(new DetailMenuFragment());
        fragmentList.add(new DetailReviewFragment());

    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) return "Overview";
        if (position == 1) return "Menu";
        return "Review";
    }
}
