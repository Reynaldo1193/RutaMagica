package com.example.rutamagica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class FoodActivity extends AppCompatActivity {

    Button btnFood1,btnFood2,btnFood3,btnFood4;
    Intent intent;
    double lat,lng;
    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        btnFood1 = (Button) findViewById(R.id.btnFood1);
        btnFood2 = (Button) findViewById(R.id.btnFood2);
        btnFood3 = (Button) findViewById(R.id.btnFood3);
        btnFood4 = (Button) findViewById(R.id.btnFood4);

        btnFood1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.714221;
                lng = -99.223292;
                titulo = "Restaurante 'Los Virreyes'";
                intent = new Intent(FoodActivity.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });

        btnFood2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.701466;
                lng = -99.248093;
                titulo = "Restaurante 'El Meson del Molino'";
                intent = new Intent(FoodActivity.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });
        btnFood3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.709548;
                lng = -99.230031;
                titulo = "Restaurante 'Esencia Café'";
                intent = new Intent(FoodActivity.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });
        btnFood4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.713975;
                lng = -99.222771;
                titulo = "Restaurante Bar 'Monte Carlo'";
                intent = new Intent(FoodActivity.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });


    }
}
