package com.example.tourandtravelapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder
{
    ImageView img;
    TextView t1,t2;
    public myviewholder(@NonNull View itemView)
    {
        super(itemView);
        img=(ImageView)itemView.findViewById(R.id.lvimage);
        t1=(TextView)itemView.findViewById(R.id.lvtitle);
        t2=(TextView)itemView.findViewById(R.id.lvsbtitle);

    }
}