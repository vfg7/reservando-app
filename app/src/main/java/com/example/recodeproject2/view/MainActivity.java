package com.example.recodeproject2.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.recodeproject2.R;
import com.example.recodeproject2.model.Hotel;
import com.example.recodeproject2.repository.RetroConfig;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


//tela inicial
public class MainActivity extends AppCompatActivity {

    ArrayList<Hotel> listaHotel;
    private ArrayAdapter gerenciador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ListView listView = findViewById(R.id.listView_cad);


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
                Toast.makeText(MainActivity.this, "Sua request falhou!", Toast.LENGTH_LONG).show();
            }
        });


    }
}