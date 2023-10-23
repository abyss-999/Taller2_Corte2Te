package com.example.taller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mensaje;
    private EditText valor1;
    private EditText valor2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mensaje = findViewById(R.id.resultado);
        valor1 = findViewById(R.id.caja1);
        valor2 = findViewById(R.id.caja2);
    }

    public void suma(View view) {
        int sumas = Integer.parseInt(valor1.getText().toString()) + Integer.parseInt(valor2.getText().toString());
        mensaje.setText(sumas + "");
    }

    public void resta(View view) {
        int restas = Integer.parseInt(valor1.getText().toString()) - Integer.parseInt(valor2.getText().toString());
        mensaje.setText(restas + "");
    }

    public void multiplicacion(View view) {
        int multiplicaciones = Integer.parseInt(valor1.getText().toString()) * Integer.parseInt(valor2.getText().toString());
        mensaje.setText(multiplicaciones + "");
    }

    public void division(View view) {
        float divisiones = Float.parseFloat(valor1.getText().toString()) / Float.parseFloat(valor2.getText().toString());
        mensaje.setText(divisiones + "");
    }

    public void potencia(View view) {
        int base = Integer.parseInt(valor1.getText().toString());
        int exponente = Integer.parseInt(valor2.getText().toString());
        int p = 1;
        while (exponente > 0) {
            p = p * base;
            exponente--;
        }
        mensaje.setText("La potencia de " + valor1.getText().toString() +
                " elevado al " + valor2.getText().toString() + " es " + String.valueOf(p));
    }


    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public float division(float num1, float num2) {
        if (num2 == 0) {
            return 0.0f;
        } else {
            return num1 / num2;
        }
    }
}

