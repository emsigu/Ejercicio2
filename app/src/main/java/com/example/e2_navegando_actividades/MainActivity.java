package com.example.e2_navegando_actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    //Metodo boton que te lleva al activity de Eladio
    public void Eladio(View view){
        Intent eladio = new Intent(this, EladioActivity.class);
        startActivity(eladio);


    }
    //Metodo boton que te lleva al activity de Edwin
    public void Edwin(View view){
        Intent edwin = new Intent(this, EdwinActivity.class);
        startActivity(edwin);

    }
    //Metodo boton que te lleva al activity de Emmanuel
    public void Emmanuel(View view){
        Intent emmanuel = new Intent(this, EmmanuelActivity.class);
        startActivity(emmanuel);

    }
    //Metodo boton que te lleva al activity de Configuracion
    public void Configuracion(View view){
        Intent configuracion = new Intent(this, ConfiguracionActivity.class);
        startActivity(configuracion);

    }


}
