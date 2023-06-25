package com.example.primerdber;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btEnviar(View view) {
        EditText Nombre = findViewById(R.id.editTextNombre);
        EditText Apellido = findViewById(R.id.editTextApellido);
        EditText Ciudad = findViewById(R.id.editTextCiudad);
        EditText Email= findViewById(R.id.editTextCorreo);
        EditText Telefono = findViewById(R.id.editTextTelefono);
        RadioGroup Gen = findViewById(R.id.radioGroupGen);

        String nom;
        String ape;
        String ciu;
        String cor;
        String telf;
        String generoSelect = "";

        nom = Nombre.getText().toString();
        ape = Apellido.getText().toString();
       ciu = Ciudad.getText().toString();
        cor = Email.getText().toString();
        telf = Telefono.getText().toString();


        int selectedId = Gen.getCheckedRadioButtonId();
        if (selectedId != -1) {
            RadioButton radioButton = findViewById(selectedId);
            generoSelect = radioButton.getText().toString();
        }

        Bundle b = new Bundle();
        b.putString("Nombres", nom);
        b.putString("Apellidos", ape);
        b.putString("Ciudad", ciu);
        b.putString("Email", cor);
        b.putString("Telefono", telf);
        b.putString("Genero", generoSelect);


        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void btlimpiar(View view) {
        EditText Nombre = findViewById(R.id.editTextNombre);
        EditText Apellido = findViewById(R.id.editTextApellido);
        EditText Ciudad = findViewById(R.id.editTextCiudad);
        EditText Email = findViewById(R.id.editTextCorreo);
        EditText Telefono = findViewById(R.id.editTextTelefono);


        Nombre.setText("");
        Apellido.setText("");
        Ciudad.setText("");
        Email.setText("");
        Telefono.setText("");

    }
}