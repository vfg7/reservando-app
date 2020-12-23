package com.example.recodeproject2.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Guest {

    @PrimaryKey
    private long id;
    private String name;
    private String password;
    private String email;
    private long telephone;
    private String birthday;
    private Profile profile;
    private boolean fidelity;
    private boolean regular;

    public Guest() {
        super();
    }

    public Guest(long id, String name, String password, String email, long telephone,
                 String birthday, Profile profile, boolean fidelity, boolean regular) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.telephone = telephone;
        this.birthday = birthday;
        this.profile = profile;
        this.fidelity = fidelity;
        this.regular = regular;
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

    public long getTelephone() {
        return telephone;
    }

    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
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

    public boolean isFidelity() {
        return fidelity;
    }

    public void setFidelity(boolean fidelity) {
        this.fidelity = fidelity;
    }

    public boolean isRegular() {
        return regular;
    }

    public void setRegular(boolean regular) {
        this.regular = regular;
    }

}
