package com.example.mascotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NivelAccesoEjemplo objeto= new NivelAccesoEjemplo();

        objeto.saludar2();

    }
}