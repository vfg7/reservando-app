package com.example.recodeproject2.view;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recodeproject2.R;
import com.example.recodeproject2.model.Hotel;
import com.example.recodeproject2.repository.RetroConfig;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//busca e retorno de hoteis
public class HotelActivity extends AppCompatActivity {


    ArrayList<Hotel> listaHotel;
    private ArrayAdapter gerenciador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_activity);

        ListView listView = findViewById(R.id.listView);


        listaHotel = new ArrayList<>();
        gerenciador = new HotelAdapter(this, listaHotel, R.layout.item_view);

        listView.setAdapter(gerenciador);


        RetroConfig retrofitConfig = new RetroConfig();

        Call<List<Hotel>> call = retrofitConfig.getHotelService().getAllhotels();

        call.enqueue(new Callback<List<Hotel>>() {
            @Override
            public void onResponse(Call<List<Hotel>> call, Response<List<Hotel>> response) {
                List<Hotel> hotels = response.body();


                ArrayList<Hotel> novalista = new ArrayList<>(hotels);
                listaHotel.addAll(novalista);

                gerenciador.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Hotel>> call, Throwable t) {
                Toast.makeText(HotelActivity.this, "Sua request falhou!", Toast.LENGTH_LONG).show();
            }
        });



    }



}
