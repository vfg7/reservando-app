package com.example.recodeproject2.service;

import com.example.recodeproject2.model.Reservation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ReservationService {

    @GET("reservation")
    Call<List<Reservation>> getAllreservations();

    @GET("reservation")
    Call<Reservation> getreservation();

    @POST("reservation")
    void insert();

    @DELETE("reservation")
    void delete();
    
}
