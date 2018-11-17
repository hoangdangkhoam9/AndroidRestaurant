package com.project.dangkhoa.restaurantproject.function_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.dangkhoa.restaurantproject.R;
import com.project.dangkhoa.restaurantproject.function_recyclerView.HomeSearchRecyclerViewAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeSearchFragment extends Fragment {
    private RecyclerView recyclerView;

    public HomeSearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_search, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewContent);

        //recyclerView
        HomeSearchRecyclerViewAdapter adapter = new HomeSearchRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

}
