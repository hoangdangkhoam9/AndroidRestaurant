package com.project.dangkhoa.restaurantproject.function_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.project.dangkhoa.restaurantproject.R;
import com.project.dangkhoa.restaurantproject.function_recyclerView.HomeBookmarkRecyclerViewAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeBookmarkFragment extends Fragment {
    private RecyclerView recyclerView;

    public HomeBookmarkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home_bookmark, container, false);
        recyclerView = view.findViewById(R.id.recyclerViewContent);

        //recyclerView
        HomeBookmarkRecyclerViewAdapter adapter = new HomeBookmarkRecyclerViewAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

}
