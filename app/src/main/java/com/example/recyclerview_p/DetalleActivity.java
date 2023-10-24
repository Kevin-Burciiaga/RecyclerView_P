package com.example.recyclerview_p;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String nombre = bundle.getString("nombre");
            String liga = bundle.getString("liga");
            String estadio = bundle.getString("estadio");
            String descripcion = bundle.getString("descripcion");

            // Acceder a los elementos de la interfaz de usuario
            TextView nombreTextView = findViewById(R.id.nombreTV);
            TextView ligaTextView = findViewById(R.id.ligaTV);
            TextView estadioTextView = findViewById(R.id.estadioTV);
            TextView descripciont = findViewById(R.id.desTV);


            // Mostrar los datos en la interfaz de usuario
            nombreTextView.setText(nombre);
            ligaTextView.setText(liga);
            estadioTextView.setText(estadio);
            if (descripcion != null) {
                descripciont.setText(descripcion);
            } else {
                // Puedes mostrar un mensaje alternativo si no hay descripción
                descripciont.setText("Descripción no disponible");
            }

        }
    }
}