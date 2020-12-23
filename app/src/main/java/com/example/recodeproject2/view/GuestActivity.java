package com.example.recodeproject2.view;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recodeproject2.R;

//classe em que o usuário se cadastra
public class GuestActivity extends AppCompatActivity {

    Button goHotel, back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        //avança pra selecionar hoteis
        goHotel = (Button) findViewById(R.id.toHotel);
        goHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuestActivity.this, HotelActivity.class);
                startActivity(intent);
            }
        });


        //volta pra main
        back = (Button) findViewById(R.id.toMain);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GuestActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });




    }

}
