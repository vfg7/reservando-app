package com.example.recodeproject2.view;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(layout, parent,false);
        }

        Hotel hotel = hotelList.get(position);
//        TextView tvHotelName = itemView.findViewById(R.id.hotelName); //setado na view, no xml
//        tvHotelName.setText(hotel.getName());

        Button bt = itemView.findViewById(R.id.bt_open_item);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Success.class);
                context.startActivity(intent);
            }
        });

        return itemView;
    }

}
