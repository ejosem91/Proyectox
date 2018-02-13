package com.tmignova.proyectox.Models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LENOVO on 8/1/2018.
 */

public class Datum {
    @SerializedName("id")
    public Integer id;
    @SerializedName("name")
    public String name;
    @SerializedName("year")
    public Integer year;
    @SerializedName("pantone_value")
    public String pantoneValue;
}
