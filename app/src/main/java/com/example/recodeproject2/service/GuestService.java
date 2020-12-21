package com.example.recodeproject2.service;

import com.example.recodeproject2.model.Guest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface GuestService {

    @GET("guest")
    Call<List<Guest>> getAllGuests();

    @GET("guest")
    Call<Guest> getGuest();

    @POST("guest")
    void insert();

    @DELETE("guest")
    void delete();
}
