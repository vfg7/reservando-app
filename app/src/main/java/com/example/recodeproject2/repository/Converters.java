package com.example.recodeproject2.repository;

import androidx.room.TypeConverter;

import com.example.recodeproject2.model.Hotel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Converters {

    private static ObjectMapper objectMapper;

    @TypeConverter
    public static String listToJson(Hotel value) {
        objectMapper = new ObjectMapper();
        try {
            return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{'Error':'Convert error'}";
        }
        // Converter um tipo em uma string
    }

    @TypeConverter
    public static Hotel jsonToList(String value) {
        objectMapper = new ObjectMapper();
        Hotel hotel = new Hotel();
        try {
            hotel = objectMapper.readValue(value, Hotel.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hotel;
        //Converter uma string em um tipo
    }
}
