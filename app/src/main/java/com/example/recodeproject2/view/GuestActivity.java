package com.example.recodeproject2.view;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recodeproject2.R;
import com.example.recodeproject2.model.Guest;

import java.time.LocalDate;

//classe em que o usuário se cadastra
public class GuestActivity extends AppCompatActivity {

    Button goHotel, back;

    @RequiresApi(api = Build.VERSION_CODES.O)
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

        EditText t1 = (EditText)findViewById(R.id.guestname);
        String username = t1.getText().toString();
        EditText t2= (EditText)findViewById(R.id.guestmail);
        String mail = t2.getText().toString();
        EditText t3= (EditText)findViewById(R.id.guestphone);
        String p = t3.getText().toString();
        Long phone = Long.parseLong(p);

        EditText t4= (EditText)findViewById(R.id.guestpassword);
        String pass = t4.getText().toString();
        EditText t5= (EditText)findViewById(R.id.guestbday);
        String bday = t5.getText().toString();

        RadioButton b = (RadioButton)findViewById(R.id.regular);
        boolean c = b.isChecked();


        Guest newGuest = new Guest();
        newGuest.setName(username);
        newGuest.setEmail(mail);
        newGuest.setBirthday(LocalDate.parse(bday));
        newGuest.setPhone(phone);
        newGuest.setPassword(pass);
        if(c){
            newGuest.setProfile(Guest.Profile.REGULAR);
        } else {
            newGuest.setProfile(Guest.Profile.FIDELITY);
        }


    }

}
