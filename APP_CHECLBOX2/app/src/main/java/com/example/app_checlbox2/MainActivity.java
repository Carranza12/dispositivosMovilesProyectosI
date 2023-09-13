package com.example.app_checlbox2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText n1, n2;
    CheckBox suma, resta, mult, div;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.num1);
        n2 = (EditText) findViewById(R.id.num2);

        suma = (CheckBox) findViewById((R.id.suma));
        resta = (CheckBox) findViewById((R.id.resta));
        mult = (CheckBox) findViewById((R.id.multiplicacion));
        div = (CheckBox) findViewById((R.id.division));

        res = (TextView) findViewById((R.id.res));

    }

    public void realizarOp(View v){
        double num1 = Double.parseDouble(n1.getText().toString());
        double num2 = Double.parseDouble(n2.getText().toString());

        String resultado = "";

        if(suma.isChecked()){
            resultado = "Suma = " + (num1 + num2) + "\n";
        }
        if(resta.isChecked()){
            resultado = "Resta = " + (num1 - num2) + "\n";
        }
        if(mult.isChecked()){
            resultado = "Multiplicacion = " + (num1 * num2) + "\n";
        }
        if(div.isChecked()){
            resultado = "Division = " + (num1 / num2) + "\n";
        }

        res.setText(resultado);
    }
}