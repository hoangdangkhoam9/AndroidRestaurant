package com.project.dangkhoa.restaurantproject.function_recyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project.dangkhoa.restaurantproject.R;
import com.project.dangkhoa.restaurantproject.entity.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class HomeBrowseRecyclerViewApdapter extends RecyclerView.Adapter {
    List<Object> list = new ArrayList<>();

    // --------------------------------- Bonus Code ------------------------------------------------
    private class MyViewHolder extends RecyclerView.ViewHolder
    {
        public MyViewHolder(View itemView)
        {
            super(itemView);
        }
    }
    //----------------------------------------------------------------------------------------------

    public  HomeBrowseRecyclerViewApdapter()
    {
        Restaurant item = new Restaurant();
        item.Name= "Sublimotion";
        item.Category="restaurant";
        item.RatingPoints = 9.2;
        list.add(item);

        item = new Restaurant();
        item.Name= "HestonBlumenthal";
        item.Category="restaurant";
        item.RatingPoints = 8.5;
        list.add(item);

        item = new Restaurant();
        item.Name= "Le Meurice";
        item.Category="restaurant";
        item.RatingPoints = 9.0;
        list.add(item);

        item = new Restaurant();
        item.Name= "Ithaa Undersea";
        item.Category="restaurant";
        item.RatingPoints = 7;
        list.add(item);
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)  // khoi tao giao dien
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recyclerview_home_browse,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position)  //thiet lap gia tri len giao dien da khoi tao
    {
        View view = viewHolder.itemView;
        Object object = list.get(position);

            TextView txtRestaurantName = view.findViewById(R.id.txtRestaurantName);
            TextView txtCategory = view.findViewById(R.id.txtCategory);

            Restaurant temp = (Restaurant) object;
            txtRestaurantName.setText(temp.Name);
            txtCategory.setText(temp.Category);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
