package com.example.e2_navegando_actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EladioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eladio);
    }
    //Metodo boton ir pantalla principal
    public void Principal(View view){
        Intent principal = new Intent(this, MainActivity.class);
        startActivity(principal);

    }
}
