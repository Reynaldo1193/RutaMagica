package com.example.rutamagica;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private TextView txtPrueba;
    private Button btnLogin;
    private EditText txtCorreo, txtContrasenia;
    private Usuario[] usuarios = new Usuario[2];
    int i = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        txtContrasenia = (EditText) findViewById(R.id.txtContrasenia);
        txtCorreo = (EditText) findViewById(R.id.txtCorreo);
        txtPrueba = (TextView) findViewById(R.id.txtPrueba);

        Usuario usuario;
        usuario = new Usuario("Manuel Unzueta","manuel.unzueta@outlook.com","Manu1404");
        usuarios[0] = usuario;
        usuario = new Usuario("Andrea Pliego Ruiz","andreapliego18@gmail.com","bruno1803");
        usuarios[1] = usuario;

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String correo = txtCorreo.getText().toString();
               String contrasenia = txtContrasenia.getText().toString();

               for(int i = 0; i<usuarios.length; i++){
                   if(correo.equals(usuarios[i].getCorreo())){
                       if(contrasenia.equals(usuarios[i].getContrasenia())){
                           Intent intent = new Intent(LoginActivity.this,MapsActivity.class);
                           startActivity(intent);
                           return;
                       }else{
                       }
                   }else {
                       Toast.makeText(LoginActivity.this,"Lo sentimos, ese usuario no existe",Toast.LENGTH_SHORT).show();
                   }
               }
            }
        });

    }
}
