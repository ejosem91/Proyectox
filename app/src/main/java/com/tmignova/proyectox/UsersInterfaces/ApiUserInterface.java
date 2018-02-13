package com.tmignova.proyectox.UsersInterfaces;

import com.tmignova.proyectox.Models.CreateUserResponse;
import com.tmignova.proyectox.Models.MultipleResource;
import com.tmignova.proyectox.Models.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by LENOVO on 8/1/2018.
 */

public interface ApiUserInterface {
    @POST("/api/users")
    Call<User> CreateUser(@Body User user);
}
