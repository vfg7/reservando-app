package com.example.recodeproject2.model;

import java.time.LocalDate;

public class Guest {

    private long id;
    private String name;
    private String password;
    private String email;
    private long phone;
    private LocalDate birthday;
    private Profile profile;

    public Guest() {
        super();
    }

    public Guest(long id, String name, String email, String password, long phone, LocalDate birthday, Profile profile) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.birthday = birthday;
        this.profile = profile;
    }
     public enum Profile{
        FIDELITY, REGULAR
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
