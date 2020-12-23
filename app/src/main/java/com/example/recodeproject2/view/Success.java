package com.example.recodeproject2.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recodeproject2.R;

public class Success extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success);

        Button volta = (Button) findViewById(R.id.retorne);
        volta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Success.this, MainActivity.class);
                startActivity(intent);
            }
        });

        //preciso pegar daqui o usuário (novo ou gerado), datas, hotel e criar a reserva

    }
}
