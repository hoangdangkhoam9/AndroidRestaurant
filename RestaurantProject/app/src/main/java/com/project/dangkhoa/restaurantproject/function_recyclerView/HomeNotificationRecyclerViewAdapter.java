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

public class HomeNotificationRecyclerViewAdapter extends RecyclerView.Adapter {

    List<Object> list = new ArrayList<>();

    public HomeNotificationRecyclerViewAdapter()
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

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
    /*
    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }*/
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.recyclerview_home_notification,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position)
    {
        View view = viewHolder.itemView;
        Object object = list.get(position);

        TextView txtName = view.findViewById(R.id.txtName);
        TextView txtAction = view.findViewById(R.id.txtAction);

        Restaurant temp = (Restaurant) object;
        txtName.setText(temp.Name);
        txtAction.setText("discount 10%");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
