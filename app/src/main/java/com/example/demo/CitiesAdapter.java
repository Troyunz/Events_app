package com.example.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class CitiesAdapter extends RecyclerView.Adapter<CitiesAdapter.MyViewHolder> {

    private final Context context;
    private final ArrayList<City> cities;

    public CitiesAdapter(Context context, ArrayList<City> cities) {
        this.context = context;
        this.cities = cities;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView cityImage;
        TextView cityName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            cityImage = itemView.findViewById(R.id.city_image);
            cityName = itemView.findViewById(R.id.city_name);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_list_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  CitiesAdapter.MyViewHolder holder, int position) {
        City city = cities.get(position);
        holder.cityName.setText(City.getText());
        holder.cityImage.setImageResource(City.getImage());
    }

    @Override
    public int getItemCount() {
        return cities.size();
    }
}
