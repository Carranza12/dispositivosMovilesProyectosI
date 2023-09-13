package com.example.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText n1,n2;
    private TextView r;
    private RadioButton r1,r2, r3, r4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText)findViewById(R.id.num1);
        n2 = (EditText)findViewById(R.id.num2);
        r = (TextView)findViewById(R.id.txtResultado);
        r1 = (RadioButton)findViewById(R.id.rb1);
        r2 = (RadioButton)findViewById(R.id.rb2);
        r3 = (RadioButton)findViewById(R.id.rb3);
        r4 = (RadioButton)findViewById(R.id.rb4);

    }
}