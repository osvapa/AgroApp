package com.example.agroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.agroapp.ventas.formularioVentas;

public class Vendedor extends AppCompatActivity {

    ImageButton botonCarnes, botonGranos, botonHortalizas, botonLacteos;
    TextView txtImageCarnes, txtImageGranos, txtImageHortalizas, txtImageLacteos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendedor);

        botonCarnes = findViewById(R.id.btnCarnes);
        botonGranos = findViewById(R.id.btnGranos);
        botonHortalizas = findViewById(R.id.btnHortalizas);
        botonLacteos = findViewById(R.id.btnLacteos);

        txtImageCarnes = findViewById(R.id.txtImageCarne);
        txtImageGranos = findViewById(R.id.txtImageGranos);
        txtImageHortalizas = findViewById(R.id.txtImageHortaliza);
        txtImageLacteos = findViewById(R.id.txtImageLacteo);
    }

    public void siguienteImage(View view){
        Bundle enviaDatos = new Bundle();
        if(botonCarnes.isPressed()){
            enviaDatos.putString("KeyDatos", txtImageCarnes.getText().toString());
        }else if(botonGranos.isPressed()){
            enviaDatos.putString("KeyDatos", txtImageGranos.getText().toString());
        }else if(botonHortalizas.isPressed()){
            enviaDatos.putString("KeyDatos", txtImageHortalizas.getText().toString());
        }else if(botonLacteos.isPressed()){
            enviaDatos.putString("KeyDatos", txtImageLacteos.getText().toString());
        }

        Intent cambio = new Intent(this, formularioVentas.class);
        cambio.putExtras(enviaDatos);

        startActivity(cambio);

    }
}