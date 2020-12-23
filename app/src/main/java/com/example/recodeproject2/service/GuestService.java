package com.example.recodeproject2.service;

import com.example.recodeproject2.model.Guest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GuestService {

    @GET("guest")
    Call<List<Guest>> getAllGuests();

    @GET("guest/{id}")
    //Call<Guest> getGuest(@Path(int id));
    Call<Guest> getGuest();

    @POST("guest")
    void insert(@Body Guest guest);

    @DELETE("guest")
    void delete();
}
