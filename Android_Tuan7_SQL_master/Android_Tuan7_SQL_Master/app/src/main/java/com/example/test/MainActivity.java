package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DataUser dateUser = new DataUser(this, "usernameDB.sqlite",
                null, 1);

        dateUser.addUser(new User( "Khoi 1"));
        dateUser.addUser(new User( "Khoi 2"));
        dateUser.addUser(new User( "Khoi 3"));
    }
}