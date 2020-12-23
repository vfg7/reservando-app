package com.example.recodeproject2.dao;

import com.example.recodeproject2.model.Hotel;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

@Dao
public interface HotelDao {

    @Query("SELECT * FROM Hotel")
    public List<Hotel> getAll();

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    public void insertAll(List<Hotel> professors);
}
