package com.example.recodeproject2.view;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recodeproject2.R;

import java.util.Calendar;

public class DateSelect  extends AppCompatActivity {

    DatePickerDialog inpicker, outpicker;
    Button back, next, checkin, checkout;
    String in, out;
    EditText getIn, getOut;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dateselect);

        //getDatas
//        inpicker = (DatePicker)findViewById(R.id.checkin);
//        outpicker=(DatePicker)findViewById(R.id.checkout);

        getIn = (EditText) findViewById(R.id.checkinselect);
        getIn.setInputType(InputType.TYPE_NULL);
        getIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                inpicker = new DatePickerDialog(DateSelect.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                getIn.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                inpicker.show();
            }
        });


        //set texts
        checkin = findViewById(R.id.getcheckin);
        checkin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                in = getIn.getText().toString();
            }
        });


        getOut = (EditText) findViewById(R.id.checkoutselect);
        getOut.setInputType(InputType.TYPE_NULL);
        getOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                outpicker = new DatePickerDialog(DateSelect.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                getOut.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                outpicker.show();
            }
        });


        checkout = findViewById(R.id.getcheckout);
        checkout.setOnClickListener(new View.OnClickListener() {

            @Override
        public void onClick(View v) {
                out = getOut.getText().toString();
           }
         });
        //setpickers
//

        //falta converter in e out para a reserva. Guarda os valores para quando o hotel for selecionado?

        //implementar idas e voltas

        //volta pra home
        back = (Button) findViewById(R.id.tomain);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DateSelect.this, MainActivity.class);
                startActivity(intent);
            }

        });
//
//        //segue para escolha do hotel
        next = (Button) findViewById(R.id.tohotelist);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(DateSelect.this, HotelActivity.class);
               startActivity(intent);
            }

        });


    }//oncreate



}
