package com.example.recodeproject2.model;


import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Hotel {

    @PrimaryKey
    private long id;
    private String name;
    private String email;
    private long telephone;
    private long classification;
    private long weekdayRegular;
    private long weekdayFidelity;
    private long weekendRegular;
    private long weekendFidelity;


    public Hotel() {
        super();
    }

    @Ignore
    public Hotel(long id, String name, String email, long telephone, long classification, long weekdayRegular,
                 long weekdayFidelity, long weekendRegular, long weekendFidelity) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.telephone = telephone;
        this.classification = classification;
        this.weekdayRegular = weekdayRegular;
        this.weekdayFidelity = weekdayFidelity;
        this.weekendRegular = weekendRegular;
        this.weekendFidelity = weekendFidelity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public long getWeekdayRegular() {
        return weekdayRegular;
    }

    public void setWeekdayRegular(long weekdayRegular) {
        this.weekdayRegular = weekdayRegular;
    }

    public long getWeekdayFidelity() {
        return weekdayFidelity;
    }

    public void setWeekdayFidelity(long weekdayFidelity) {
        this.weekdayFidelity = weekdayFidelity;
    }

    public long getWeekendRegular() {
        return weekendRegular;
    }

    public void setWeekendRegular(long weekendRegular) {
        this.weekendRegular = weekendRegular;
    }

    public long getWeekendFidelity() {
        return weekendFidelity;
    }

    public void setWeekendFidelity(long weekendFidelity) {
        this.weekendFidelity = weekendFidelity;
    }
    public long getClassification() {
        return classification;
    }

    public void setClassification(long classification) {
        this.classification = classification;
    }

}
