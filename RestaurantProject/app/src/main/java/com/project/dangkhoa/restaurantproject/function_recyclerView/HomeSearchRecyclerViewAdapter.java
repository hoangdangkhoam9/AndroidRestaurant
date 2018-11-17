package com.project.dangkhoa.restaurantproject.function_recyclerView;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.project.dangkhoa.restaurantproject.R;
import com.project.dangkhoa.restaurantproject.entity.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class HomeSearchRecyclerViewAdapter extends RecyclerView.Adapter {
    List<Object> list = new ArrayList<>();

    private class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    public  HomeSearchRecyclerViewAdapter()
    {
        list.add("Recommended for you");

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

    @Override
    public int getItemViewType(int position) {
        if (list.get(position) instanceof String)
        {
            return 1; // string
        }
        return 2; // object
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view;
        if (viewType == 1) // string
        {
            view = inflater.inflate(R.layout.recyclerview_home_search_string,parent,false);
            return new MyViewHolder(view);
        }
        else // object
        {
            view = inflater.inflate(R.layout.recylcerview_home_search,parent,false);
            return new MyViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        View view = viewHolder.itemView;
        Object object = list.get(position);
        if (object instanceof Restaurant)
        {
            TextView txtRestaurantName = view.findViewById(R.id.txtRestaurantName);
            TextView txtCategory = view.findViewById(R.id.txtCategory);
            Button Rating = view.findViewById(R.id.btnRating);

            Restaurant temp = (Restaurant) object;
            txtRestaurantName.setText(temp.Name);
            txtCategory.setText(temp.Category);
            Rating.setText(Double.toString(temp.RatingPoints));

        }
        else
        {
            TextView txtRecomend = view.findViewById(R.id.txtRecomendString);
            txtRecomend.setText(object.toString());
        }

    }

    @Override
    public int getItemCount() {
        return list.size();
    }


}
