package com.example.rutamagica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Activity_hote extends AppCompatActivity {

    Button btnHotel1,btnHotel2,btnHotel3,btnHotel4,btnHotel5;
    Intent intent;
    double lat,lng;
    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hote);

        btnHotel1 = (Button) findViewById(R.id.btnHotel1);
        btnHotel2 = (Button) findViewById(R.id.btnHotel2);
        btnHotel3 = (Button) findViewById(R.id.btnHotel3);
        btnHotel4 = (Button) findViewById(R.id.btnHotel4);
        btnHotel5 = (Button) findViewById(R.id.btnHotel5);

        btnHotel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.702919;
                lng = -99.256243;
                titulo = "Hotel Resort & Spa Puerta al Virreinato";
                intent = new Intent(Activity_hote.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });

        btnHotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.717174;
                lng = -99.218012;
                titulo = "Hotel Mansión Tepotzotlán";
                intent = new Intent(Activity_hote.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });

        btnHotel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.712869;
                lng = -99.218580;
                titulo = "Posada del Fraile";
                intent = new Intent(Activity_hote.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });

        btnHotel4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.715198;
                lng = -99.211457;
                titulo = "Mesón del Rio Posada Mexiquenses";
                intent = new Intent(Activity_hote.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });

        btnHotel5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.710264;
                lng = -99.205872;
                titulo = "Hotel City Express Tepotzotlán.";
                intent = new Intent(Activity_hote.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });

    }
}
