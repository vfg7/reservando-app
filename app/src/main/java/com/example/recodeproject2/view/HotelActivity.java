package com.example.recodeproject2.view;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recodeproject2.R;
import com.example.recodeproject2.model.Hotel;

import java.util.ArrayList;

//busca e retorno de hoteis
public class HotelActivity extends AppCompatActivity {
//
//    private RecyclerView recyclerView;
//    private RecyclerView.Adapter mAdapter;
//    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<Hotel> hotels; //precisa receber do servidor

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel_activity);

        ListView listView = findViewById(R.id.listView);
        HotelAdapter manager = new HotelAdapter(this, hotels, R.layout.item_view);
        //adaptador para tratar o objeto. analogo ao da aula

        listView.setAdapter(manager);


    }




}
