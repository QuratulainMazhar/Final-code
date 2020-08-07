package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class option extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);
        getSupportActionBar().setTitle("Choice");
    }
    public void mainchoic(View v) {
        Intent g = new Intent(option.this, main.class);
        startActivity(g);

    }
    public void desserts(View v) {

        Intent g = new Intent(option.this, desserts.class);
        startActivity(g);
    }
    public void drinks(View v) {
        Intent g = new Intent(option.this, drinks.class);
        startActivity(g);

    }
}