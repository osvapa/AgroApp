package com.example.agroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormularioRegistro extends AppCompatActivity {
    Button agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_registro);

        agregar = findViewById(R.id.btnAgregarUsuario);
    }


    public void newVendedor(View view){
        Intent cambio = new Intent(this, Vendedor.class);
        startActivity(cambio);
    }
}