package com.example.tourandtravelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    ImageView img,img2,img3,img4,img5,img6,img7;
    TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12,tv13,tv14,tv15;
    TextView t1,t2,t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        img=(ImageView)findViewById(R.id.desc_img);
        tv1=(TextView)findViewById(R.id.desc_header);
        tv2=(TextView)findViewById(R.id.desc_desc);
        tv3=(TextView)findViewById(R.id.details);
        img2 = (ImageView)findViewById(R.id.hotelimg);
        img3 = (ImageView)findViewById(R.id.hotelimg2);
        img4 = (ImageView)findViewById(R.id.restaurantimg);
        img5 = (ImageView)findViewById(R.id.restaurantimg2);
        img6 = (ImageView)findViewById(R.id.place1);
        img7 =  (ImageView)findViewById(R.id.place2);
        tv4 = (TextView)findViewById(R.id.hotelname);
        tv5 = (TextView)findViewById(R.id.hoteladdress);
        tv6 = (TextView)findViewById(R.id.hotelnumber);
        tv7 = (TextView)findViewById(R.id.hotelname2);
        tv8 = (TextView)findViewById(R.id.hoteladdress2);
        tv9 = (TextView)findViewById(R.id.hotelnumber2);
        tv10 = (TextView)findViewById(R.id.restaurantname);
        tv11 = (TextView)findViewById(R.id.restaurantaddress);
        tv12 = (TextView)findViewById(R.id.restaurantsite);
        tv13 = (TextView)findViewById(R.id.restaurantname2);
        tv14 = (TextView)findViewById(R.id.restaurantaddress2);
        tv15 = (TextView)findViewById(R.id.restaurantsite2);
        t1 = (TextView)findViewById(R.id.place1name);
        t2 = (TextView)findViewById(R.id.place1about);
        t3 = (TextView)findViewById(R.id.place2name);
        t4 = (TextView)findViewById(R.id.place2about);

        img.setImageResource(getIntent().getIntExtra("imagename",0));
        tv1.setText(getIntent().getStringExtra("header"));
        tv2.setText(getIntent().getStringExtra("desc"));
        tv3.setText(getIntent().getStringExtra("details"));
        tv4.setText(getIntent().getStringExtra("hotel_name"));
        tv5.setText(getIntent().getStringExtra("hotel_address"));
        img2.setImageResource(getIntent().getIntExtra("hotelimage",0));
        img3.setImageResource(getIntent().getIntExtra("hotelimage2",0));
        img4.setImageResource(getIntent().getIntExtra("restaurantimage",0));
        img5.setImageResource(getIntent().getIntExtra("restaurantimage2",0));
        img6.setImageResource(getIntent().getIntExtra("placeimg",0));
        img7.setImageResource(getIntent().getIntExtra("placeimg2",0));
        tv6.setText(getIntent().getStringExtra("hotel_number"));
        tv7.setText(getIntent().getStringExtra("hotel_name2"));
        tv8.setText(getIntent().getStringExtra("hotel_address2"));
        tv9.setText(getIntent().getStringExtra("hotel_number2"));
        tv10.setText(getIntent().getStringExtra("restaurantname"));
        tv11.setText(getIntent().getStringExtra("restaurantaddress"));
        tv12.setText(getIntent().getStringExtra("restaurantsite"));
        tv13.setText(getIntent().getStringExtra("restaurantname2"));
        tv14.setText(getIntent().getStringExtra("restaurantaddress2"));
        tv15.setText(getIntent().getStringExtra("restaurantsite2"));
        t1.setText(getIntent().getStringExtra("placename1"));
        t2.setText(getIntent().getStringExtra("placeabout1"));
        t3.setText(getIntent().getStringExtra("placename2"));
        t4.setText(getIntent().getStringExtra("placeabout2"));
    }
}