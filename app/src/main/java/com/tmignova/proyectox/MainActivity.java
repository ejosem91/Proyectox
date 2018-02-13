package com.tmignova.proyectox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.tmignova.proyectox.Api.Retrofit.ApiClient;
import com.tmignova.proyectox.Models.User;
import com.tmignova.proyectox.UsersInterfaces.ApiUserInterface;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ApiUserInterface apiUserInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiUserInterface = ApiClient.getClient().create(ApiUserInterface.class);
        User user = new User("Jose","Leader");
        Call<User>  callUser = apiUserInterface.CreateUser(user);
        callUser.enqueue(new Callback<User>() {
            String date;
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if(response.isSuccessful()){
                    User user = response.body();
                    DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
                    try {
                        date = df.format(user.getCreatedAt());
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }


                    Toast.makeText(MainActivity.this,   date +"  " + user.getName(), Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {

            }
        });


    }
}
