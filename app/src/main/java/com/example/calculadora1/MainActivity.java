package com.example.calculadora1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText edit1, edit2; // declaracion de datos
    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.et1); // Busco el elemento grafico por id.
        edit2 = (EditText) findViewById(R.id.et2);
        texto = (TextView) findViewById(R.id.tv);
    }

    // Suma dos numeros
    public void Suma(View view) {
        int num1 = Integer.parseInt(edit1.getText().toString()); // Conversion de datos.
        int num2 = Integer.parseInt(edit2.getText().toString());
        int resultado = num1 + num2; // Hago la suma

        texto.setText("El resultado de la suma es: " + resultado);
    }

    public void Resta(View view) {
        int num1 = Integer.parseInt(edit1.getText().toString()); // Conversion de datos.
        int num2 = Integer.parseInt(edit2.getText().toString());
        int resultado = num1 - num2; // Hago la resta

        texto.setText("El resultado de la resta es: " + resultado);
    }

    public void Multiplicacion(View view) {
        int num1 = Integer.parseInt(edit1.getText().toString()); // Conversion de datos.
        int num2 = Integer.parseInt(edit2.getText().toString());
        int resultado = num1 * num2; // Hago la multiplicacion

        texto.setText("El resultado de la multiplicacion es: " + resultado);
    }

    public void Division(View view) {
        try // intento de codigo
        {
            int num1 = Integer.parseInt(edit1.getText().toString()); // Conversion de datos.
            int num2 = Integer.parseInt(edit2.getText().toString());
            int resultado = num1 / num2; // Hago la division

            texto.setText("El resultado de la division es: " + resultado);
        } catch (ArithmeticException exception) // Capturar el Error.
        {
            texto.setText("Ha dividido por 0 ");
        }
    }
}