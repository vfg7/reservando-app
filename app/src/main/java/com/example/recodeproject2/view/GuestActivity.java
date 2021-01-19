package com.example.recodeproject2.view;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recodeproject2.R;
import com.example.recodeproject2.model.Guest;

import com.example.recodeproject2.repository.RetroConfig;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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

//        EditText t1 = (EditText)findViewById(R.id.guestname);
//        String username = t1.getText().toString();
//        EditText t2= (EditText)findViewById(R.id.guestmail);
//        String mail = t2.getText().toString();
//        EditText t3= (EditText)findViewById(R.id.guestphone);
//        String p = t3.getText().toString();
//        Long phone = Long.parseLong(p);
//
//        EditText t4= (EditText)findViewById(R.id.guestpassword);
//        String pass = t4.getText().toString();
//        EditText t5= (EditText)findViewById(R.id.guestbday);
//        String bday = t5.getText().toString();
//
//        RadioButton b = (RadioButton)findViewById(R.id.regular);
//        boolean c = b.isChecked();
//
//
//        Guest newGuest = new Guest();
//        newGuest.setId(0);
//        newGuest.setName(username);
//        newGuest.setEmail(mail);
//        newGuest.setBirthday(bday);
//        newGuest.setTelephone(phone);
//        newGuest.setPassword(pass);
//        if(c){
//            newGuest.setProfile(Guest.Profile.REGULAR);
//            newGuest.setFidelity(false);
//            newGuest.setRegular(true);
//
//        } else {
//            newGuest.setProfile(Guest.Profile.FIDELITY);
//            newGuest.setFidelity(true);
//            newGuest.setRegular(false);
//        }
//
//        RetroConfig retrofitConfig = new RetroConfig();
//       retrofitConfig.getGuestService().insert(newGuest);
//
//        Call<List<Guest>> call = retrofitConfig.getGuestService().getAllGuests();
//        ArrayList<Guest> listaGuest = new ArrayList<>();
//
//        call.enqueue(new Callback<List<Guest>>() {
//            @Override
//            public void onResponse(Call<List<Guest>> call, Response<List<Guest>> response) {
//                List<Guest> guests = response.body();
//
//                ArrayList<Guest> novalista = new ArrayList<>(guests);
//                listaGuest.addAll(novalista);
//            }
//
//            @Override
//            public void onFailure(Call<List<Guest>> call, Throwable t) {
//                Toast.makeText(GuestActivity.this, "Sua request falhou!", Toast.LENGTH_LONG).show();
//            }
//        });
//       boolean sucesso=false;
//
//        for (int i=0; i<listaGuest.size(); i++){
//            if(listaGuest.get(i).equals(newGuest)){
//                sucesso = true;
//            }
//        }
//
//        if(!sucesso){
//            Toast.makeText(GuestActivity.this, "Cadastro falhou!", Toast.LENGTH_LONG).show();
//        }
//
       


    }

}
