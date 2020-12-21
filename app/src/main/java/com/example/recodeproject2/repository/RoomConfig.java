package com.example.recodeproject2.repository;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.recodeproject2.dao.HotelDao;
import com.example.recodeproject2.model.Hotel;

@Database(entities = {Hotel.class}, version = 3)
@TypeConverters(Converters.class)
public abstract class RoomConfig extends RoomDatabase {

    private static RoomConfig instance = null;

    public abstract HotelDao hotelDao();

    public static RoomConfig getInstance(Context context) {

        if (instance == null) {
            instance = Room.databaseBuilder(context,
                    RoomConfig.class,
                    "databaseName")
                    .allowMainThreadQueries() // Permite que o room rode na main principal
                    .fallbackToDestructiveMigration()  // recreate the database if necessary
                    .build();
        }
        return instance;
    }

}
