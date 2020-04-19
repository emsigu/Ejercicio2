package com.example.e2_navegando_actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class ConfiguracionActivity extends AppCompatActivity {
    View view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        view = this.getWindow().getDecorView();


    }
    //Metodo boton color fondo blanco
    public void bBlanco(View v){

        view.setBackgroundResource(R.color.colorBlanco);


    }
    //Metodo boton color fondo verde
    public void bVerde(View v){

        view.setBackgroundResource(R.color.colorVerde);

    }
    //Metodo boton color fondo azul
    public void bAzul(View v){

        view.setBackgroundResource(R.color.colorAzul);
    }
    //Metodo boton color fondo rojo
    public void bRojo(View v){

        view.setBackgroundResource(R.color.colorRojo);
    }
}