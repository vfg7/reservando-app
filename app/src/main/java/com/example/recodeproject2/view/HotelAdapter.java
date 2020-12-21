package com.example.recodeproject2.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.recodeproject2.R;
import com.example.recodeproject2.model.Hotel;

import java.util.ArrayList;
import java.util.List;

public class HotelAdapter extends ArrayAdapter<Hotel> {

    private Context context;
    private ArrayList<Hotel> hotelList;
    private int layout;

    public HotelAdapter(@NonNull Context context, ArrayList<Hotel> hotelList, int layout) {
        super(context, layout, hotelList);
        this.context = context;
        this.hotelList = hotelList;
        this.layout = layout;
    }

    public View getView(int position, @NonNull ViewGroup parent, @Nullable View convertView){
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(layout, parent,false);
        }

        Hotel hotel = hotelList.get(position);
//        TextView tvHotelName = itemView.findViewById(R.id.hotelName); //setado na view, no xml
//        tvHotelName.setText(hotel.getName());

        return itemView;

    }



}
