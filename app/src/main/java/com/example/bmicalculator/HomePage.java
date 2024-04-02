package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Intent iHome = new Intent(HomePage.this,MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {


                startActivity(iHome);
                finish();
            }
        },4000);
    }
}