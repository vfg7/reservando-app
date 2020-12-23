package com.example.recodeproject2.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.recodeproject2.R;
import com.example.recodeproject2.model.Guest;
import com.example.recodeproject2.model.Hotel;
import com.example.recodeproject2.repository.RetroConfig;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Login extends AppCompatActivity {

    boolean token;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button loginButton = (Button) findViewById(R.id.entrar);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, DateSelect.class);
                startActivity(intent);

//                if(token){
//                    startActivity(intent);
//                } else {
//                    Toast.makeText(Login.this, "Usuário não logado!", Toast.LENGTH_LONG).show();
//                }
            }
        });

        //essa classe precisa fazer uma requisição e buscar um usuário no banco. Como faço?


        ArrayList <Guest> users = new ArrayList<>();
        RetroConfig retrofitConfig = new RetroConfig();
        Call<List<Guest>> call = retrofitConfig.getGuestService().getAllGuests();

        call.enqueue(new Callback<List<Guest>>() {
            @Override
            public void onResponse(Call<List<Guest>> call, Response<List<Guest>> response) {
                List<Guest> guests = response.body();


                ArrayList<Guest> novalista = new ArrayList<>(guests);
                users.addAll(guests);

            }

            @Override
            public void onFailure(Call<List<Guest>> call, Throwable t) {
                Toast.makeText(Login.this, "Sua request falhou!", Toast.LENGTH_LONG).show();
            }
        });

        EditText text = (EditText)findViewById(R.id.username);
        String username = text.getText().toString();


        EditText text2 = (EditText)findViewById(R.id.password);
        String password = text2.getText().toString();

        //o loop tá retornando um erro e não entendo pq

//        int i;
//        for (i=0, i<users.size(),i++){
//            if(users.get(i).getEmail().equals(username)){
//                if(users.get(i).getPassword().equals(password)){
//                    Toast.makeText(Login.this, "login feito com sucesso!", Toast.LENGTH_LONG).show();
//                    token = true;
//                } else{
//                    Toast.makeText(Login.this, "senha errada!", Toast.LENGTH_LONG).show();
//                }
//            } else {
//                Toast.makeText(Login.this, "usuário inexistente!", Toast.LENGTH_LONG).show();
//            }
//        }



    }
}


