package com.example.recodeproject2.view;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import com.example.recodeproject2.R;
import com.example.recodeproject2.model.Guest;
import com.example.recodeproject2.model.Hotel;
import com.squareup.picasso.Picasso;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotelAdapter extends ArrayAdapter<Hotel> {

    private Context context;
    private ArrayList<Hotel> hotelList;
    private int layout;

    @RequiresApi(api = Build.VERSION_CODES.O)

//    public void calculateValue(String checkin, String checkout, Guest guest, Hotel hotel, long value) {
//
//
//        LocalDate date = LocalDate.parse(checkin);
//        LocalDate date2 = LocalDate.parse(checkout);
//
//        if(date2.isBefore(date)) {
//            System.out.println("Checkout antes do checkin!");
//            return;
//        }
//
//        long stay = ChronoUnit.DAYS.between(date, date2);
//        long valor = 0L;
//        long weekday=0L;
//        long weekend =0L;
//
//        if(guest.isRegular()) {
//            weekday = hotel.getWeekdayRegular();
//            weekend = hotel.getWeekendRegular();
//        } else if (guest.isFidelity()) {
//            weekday = hotel.getWeekdayFidelity();
//            weekend = hotel.getWeekendFidelity();
//        }
//
//        for (int i=0;i<stay;i++) {
//            DayOfWeek dow = DayOfWeek.from(date);
//            if (dow.toString().equals("SATURDAY")||dow.toString().equals("SUNDAY")) {
//                valor += weekend;
//
//            } else {
//                valor += weekday;
//            }
//            date = date.plusDays(1);
//
//        }
//
//        value=valor;
//
//    }

    public HotelAdapter(@NonNull Context context, ArrayList<Hotel> hotelList, int layout) {
        super(context, layout, hotelList);
        this.context = context;
        this.hotelList = hotelList;
        this.layout = layout;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_view, parent,false);
        }

        Hotel hotel = hotelList.get(position);
        TextView tvHotelName = itemView.findViewById(R.id.hotelname); //setado na view, no xml
        tvHotelName.setText(hotel.getName());
//        ImageView image = itemView.findViewById(R.id.image);
//        Picasso.get().load("https://github.com/vfg7/RESERVANDO/blob/main/Front-End-Interface/arcade.jpg").into(image);
        TextView classif = itemView.findViewById(R.id.classification); //setado na view, no xml
        classif.setText(Objects.toString(hotel.getClassification()));

//        String checkin, checkout;
//        Guest guest = new Guest();
//        Long value;
//        calculateValue(checkin,checkout,guest,hotel,value);

        TextView valor = itemView.findViewById(R.id.value); //setado na view, no xml

        valor.setText("R$ 300,00");

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
