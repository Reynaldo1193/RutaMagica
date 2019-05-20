package com.example.rutamagica;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class DondeActivity extends AppCompatActivity {

    Button btnDonde1,btnDonde2,btnDonde3,btnDonde4;
    Intent intent;
    double lat,lng;
    String titulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donde);
        btnDonde1 = (Button) findViewById(R.id.btnDonde1);
        btnDonde2 = (Button) findViewById(R.id.btnDonde2);
        btnDonde3 = (Button) findViewById(R.id.btnDonde3);
        btnDonde4 = (Button) findViewById(R.id.btnDonde4);

        btnDonde1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.713251;
                lng = -99.221741;
                titulo = "Museo Nacional del Virreinato";
                intent = new Intent(DondeActivity.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });

        btnDonde2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.712892;
                lng = -99.222065;
                titulo = "Templo de San Francisco Javier";
                intent = new Intent(DondeActivity.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });

        btnDonde3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.766749;
                lng = -99.341215;
                titulo = "Arcos del Sitio";
                intent = new Intent(DondeActivity.this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });

        btnDonde4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lat = 19.713020;
                lng = -99.201073;
                titulo = "Xochitla Parque Ecológico";
                intent = new Intent(DondeActivity   .this,MapsActivity.class);
                intent.putExtra("Lat",lat);
                intent.putExtra("Lng",lng);
                intent.putExtra("Titulo",titulo);
                startActivity(intent);
            }
        });
    }
}
