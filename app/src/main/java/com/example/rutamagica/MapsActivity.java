package com.example.rutamagica;

import android.location.Address;
import android.location.Geocoder;
import android.support.annotation.NonNull;
import android.support.design.bottomappbar.BottomAppBar;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;
import java.util.Locale;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;
    private  MarkerOptions marcadorInicial;
    private List<Address> addresses;
    private Geocoder geocoder;
    private BottomSheetBehavior bottomSheetBehavior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        initListeners();

    }

    private void initListeners(){
        bottomSheetBehavior = BottomSheetBehavior.from(findViewById(R.id.bottomSheetLayout));

        bottomSheetBehavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View view, int i) {
                if(i ==  BottomSheetBehavior.STATE_HIDDEN){
                    bottomSheetBehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }

            @Override
            public void onSlide(@NonNull View view, float v) {

            }
        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        mMap.setMaxZoomPreference(18);
        mMap.setMinZoomPreference(11);

        // Add a marker in tepozotlan and move the camera
        LatLng tepozotlan = new LatLng(19.714060, -99.223510);

        marcadorInicial = new MarkerOptions();
        marcadorInicial.position(tepozotlan);
        marcadorInicial.title("Marker Tepozotlan");
        marcadorInicial.draggable(true);

        mMap.addMarker(marcadorInicial);
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(tepozotlan)
                .zoom(13)
                .build();

        CreadorIconos("Hacienda El campanario",19.714574,-99.218876);
        CreadorIconos("Fuente del salto del agua",19.714391,-99.220058);

        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        geocoder = new Geocoder(this, Locale.getDefault());

        mMap.setOnMarkerDragListener(new GoogleMap.OnMarkerDragListener() {
            @Override
            public void onMarkerDragStart(Marker marker) {

            }

            @Override
            public void onMarkerDrag(Marker marker) {

            }

            @Override
            public void onMarkerDragEnd(Marker marker) {
                double lat = marker.getPosition().latitude;
                double lng = marker.getPosition().longitude;

                try {
                    addresses = geocoder.getFromLocation(lat,lng,1);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                String direccion = addresses.get(0).getAddressLine(0);

                marker.setTitle(direccion);
                marker.showInfoWindow();


            }
        });
    }

    @Override
    public void onClick(View v) {

    }

    public void CreadorIconos(String titulo, double lat, double lng){


        LatLng posicion = new LatLng(lat,lng);

        MarkerOptions marcador = new MarkerOptions();
        marcador.position(posicion);
        marcador.title(titulo);
        marcador.draggable(false);
        marcador.icon(BitmapDescriptorFactory.fromResource(android.R.drawable.star_on));

        mMap.addMarker(marcador);

    }
}
