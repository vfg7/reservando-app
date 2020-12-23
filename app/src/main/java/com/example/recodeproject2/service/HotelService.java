package com.example.recodeproject2.service;

import com.example.recodeproject2.model.Hotel;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface HotelService {

    //http://10.0.2.2:8080/hotel
    @GET("hotel")
    Call<List<Hotel>> getAllhotels();

    @GET("hotel")
    Call<Hotel> gethotel();

    @POST("hotel")
    void insert();

    @DELETE("hotel")
    void delete();
}
