package com.example.tourandtravelapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myadapter extends RecyclerView.Adapter<myviewholder>
{
    ArrayList<Model> data;
    Context context;
    public myadapter(ArrayList<Model> data, Context context)

    {
        this.data = data;
        this.context=context;


    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.likefragitem,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final myviewholder holder, int position)
    {
        final Model temp=data.get(position);

        holder.t1.setText(data.get(position).getHeader());
        holder.t2.setText(data.get(position).getDesc());
        holder.img.setImageResource(data.get(position).getImgname());


        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(context,Main2Activity.class);
                intent.putExtra("imagename",temp.getImgname());
                intent.putExtra("header",temp.getHeader());
                intent.putExtra("desc",temp.getDesc());
                intent.putExtra("details",temp.getDetails());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("hotelimage",temp.getHotelimg1());
                intent.putExtra("hotelimage2",temp.getHotelimg2());
                intent.putExtra("restaurantimage",temp.getRestaurantimg1());
                intent.putExtra("restaurantimage2",temp.getRestaurantimg2());
                intent.putExtra("hotel_name", temp.getHotel_names());
                intent.putExtra("hotel_address", temp.getHotel_details());
                intent.putExtra("hotel_number", temp.getHotel_numbers());
                intent.putExtra("hotel_name2", temp.getHotel_names2());
                intent.putExtra("hotel_address2", temp.getHotel_details2());
                intent.putExtra("hotel_number2", temp.getHotel_numbers2());
                intent.putExtra("restaurantname", temp.getRestaurantname());
                intent.putExtra("restaurantname2", temp.getRestaurantname2());
                intent.putExtra("restaurantaddress", temp.getRestaurantaddress());
                intent.putExtra("restaurantaddress2", temp.getRestaurantaddress2());
                intent.putExtra("restaurantsite", temp.getRestaurantsite());
                intent.putExtra("restaurantsite2", temp.getRestaurantsite2());
                intent.putExtra("placeimg", temp.getPlace1());
                intent.putExtra("placeimg2", temp.getPlace2());
                intent.putExtra("placename1", temp.getPlacename1());
                intent.putExtra("placename2", temp.getPlacename2());
                intent.putExtra("placeabout1", temp.getPlaceabout1());
                intent.putExtra("placeabout2", temp.getPlaceabout2());

                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount()
    {
        return data.size();
    }
}
