package com.example.recodeproject2.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recodeproject2.R;

public class DateSelect  extends AppCompatActivity {

    DatePicker inpicker, outpicker;
    Button back, next, checkin, checkout;
    String in, out;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dateselect);

        //getDatas
        //set texts
        checkin = findViewById(R.id.getcheckin);
        checkin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                in = inpicker.getDayOfMonth()+"/"+ (inpicker.getMonth() + 1)+"/"+inpicker.getYear();
            }
        });

        checkout = findViewById(R.id.getcheckout);
        checkout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                out = outpicker.getDayOfMonth()+"/"+ (outpicker.getMonth() + 1)+"/"+outpicker.getYear();
            }
        });
        //setpickers
        inpicker = findViewById(R.id.checkin);
        outpicker = findViewById(R.id.checkout);

        //falta converter in e out para a reserva. Guarda os valores para quando o hotel for selecionado?

        //implementar idas e voltas

        //volta pra home
//        back = (Button) findViewById(R.id.tomain);
//        back.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent intent = new Intent();
//                setResult(RESULT_OK, intent);
//                finish();
//            }
//
//        });
//
//        //segue para escolha do hotel
//        next = (Button) findViewById(R.id.to3);
//        next.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View view) {
//                Intent myIntent = new Intent(view.getContext(), HotelActivity.class);
//                startActivityForResult(myIntent, 0);
//            }
//
//        });


    }//oncreate



}
