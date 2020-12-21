package com.example.recodeproject2.repository;

public interface ResultEventInterface {

    <T> void onResult(T result);
    void onFail(String message);

}
