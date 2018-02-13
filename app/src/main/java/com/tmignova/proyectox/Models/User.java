package com.tmignova.proyectox.Models;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by LENOVO on 8/1/2018.
 */

public class User {

    @SerializedName("name")
    public String name;
    @SerializedName("job")
    public String job;
    @SerializedName("id")
    public String id;
    @SerializedName("createdAt")
    public Timestamp createdAt;

    public User(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public User(String name, String job, String id, Timestamp createdAt) {
        this.name = name;
        this.job = job;
        this.id = id;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() throws ParseException {
        //DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
        //String date = df.format(createdAt);
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }


}
