package com.example.primerdber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txtSaludo = findViewById(R.id.textDatos);
        Bundle bundle = getIntent().getExtras();
        String genero = bundle.getString("Genero");
        String nombre = bundle.getString("Nombres");
        String saludo;
        if (genero.equals("Masculino")) {
            saludo = "¡Bienvenido, " + nombre + "!";
        } else if (genero.equals("Femenino")) {
            saludo = "¡Bienvenida, " + nombre + "!";
        } else {
            saludo = "¡Bienvenido(a), " + nombre + "!";
        }

        String mensaje = saludo + "\n" +
                "Género: " + genero + "\n"
               + bundle.getString("Ciudad") + "\n"
                + bundle.getString("Email") + "\n"
               + bundle.getString("Telefono") + "\n" ;
            ;
        txtSaludo.setText(mensaje);
    }
}