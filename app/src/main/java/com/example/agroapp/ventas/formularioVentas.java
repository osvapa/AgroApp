package com.example.agroapp.ventas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.agroapp.R;

public class formularioVentas extends AppCompatActivity {

    TextView txtRecibir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_ventas);

        txtRecibir = findViewById(R.id.txtProductoVenta);

        Bundle recibirDatos = getIntent().getExtras();
        String info = recibirDatos.getString("KeyDatos");

        txtRecibir.setText(info);

    }


}