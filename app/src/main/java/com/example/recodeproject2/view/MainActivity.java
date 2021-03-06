package com.example.recodeproject2.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recodeproject2.R;
import com.example.recodeproject2.model.Hotel;
import com.squareup.picasso.Picasso;


//tela inicial
public class MainActivity extends AppCompatActivity {

    Context context;
    View itemView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        ImageView image = itemView.findViewById(R.id.image);
//        Picasso.get().load("https://github.com/vfg7/RESERVANDO/blob/main/Front-End-Interface/arcade.jpg").into(image);




        Button loginButton = (Button) findViewById(R.id.BotaoLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Login.class);
                startActivity(intent);
            }
        });

        Button cadastro = (Button) findViewById(R.id.BotaoCadastro);
        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, GuestActivity.class);
                startActivity(intent);
            }
        });




    }

}