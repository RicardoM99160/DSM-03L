package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.*;

public class MainActivity extends AppCompatActivity {
    private EditText numero1;
    private EditText numero2;
    private TextView resultado;
    private Button comparar, limpiar;
    private int suma, diferencia, producto, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.num1);
        numero2 = (EditText) findViewById(R.id.num2);
        resultado = (TextView) findViewById(R.id.txtResultado);
        comparar = (Button) findViewById(R.id.btnComparar);
        limpiar = (Button) findViewById(R.id.btnLimpiar);

        suma = 0;
        diferencia = 0;
        producto = 0;
        division = 0;
    }

    public void compararDatos(View view){
        String valor1 = numero1.getText().toString();
        String valor2 = numero2.getText().toString();
        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if(num1 > num2){
            suma = num1 + num2;
            diferencia = num1 - num2;
            resultado.setText("Resultado: suma = " + suma + " resta = " + diferencia);
        }else{
            producto = num1 * num2;
            division = num2 / num1;
            resultado.setText("Resultado: producto = " + producto + " division = " + division);
        }


    }

    public void limpiarCampos(View view){
        numero1.setText("");
        numero2.setText("");
        resultado.setText("Resultado: ");
    }
}