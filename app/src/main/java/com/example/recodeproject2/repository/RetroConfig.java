package com.example.recodeproject2.repository;

import com.example.recodeproject2.service.GuestService;
import com.example.recodeproject2.service.HotelService;
import com.example.recodeproject2.service.ReservationService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetroConfig {

    private Retrofit retrofit;

    public RetroConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.0.16:8080/") //lembrar de colocar o servidor aqui. Tirar dúvida do heroku.
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }

    //importar as classes .service
    public GuestService getGuestService(){

        return retrofit.create(GuestService.class);
    }

    public ReservationService getReservationService(){
        return retrofit.create(ReservationService.class);
    }
    public HotelService getHotelService(){

        return retrofit.create(HotelService.class);
    }


}
