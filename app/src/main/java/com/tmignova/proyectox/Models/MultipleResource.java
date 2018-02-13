package com.tmignova.proyectox.Models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by LENOVO on 8/1/2018.
 */

public class MultipleResource {
    @SerializedName("page")
    public Integer page;
    @SerializedName("per_page")
    public Integer perPage;
    @SerializedName("total")
    public Integer total;
    @SerializedName("total_pages")
    public Integer totalPages;
    @SerializedName("data")
    public List<Datum> data = null;
}
