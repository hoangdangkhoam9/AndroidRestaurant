package com.project.dangkhoa.restaurantproject.function_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.dangkhoa.restaurantproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeMapFragment extends Fragment {


    public HomeMapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_map, container, false);
    }

}
