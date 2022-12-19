package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SphericalCartesian extends AppCompatActivity {
    private Button button9;
    private TextView textView26,textView27,textView28,textView29,textView30,textView31,textView32;
    private EditText editTextTextPersonName19, editTextTextPersonName20, editTextTextPersonName21;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spherical_cartesian);
        button9 = findViewById(R.id.button9);
        editTextTextPersonName19 = findViewById(R.id.editTextTextPersonName19);
        editTextTextPersonName20 = findViewById(R.id.editTextTextPersonName20);
        editTextTextPersonName21 = findViewById(R.id.editTextTextPersonName21);
        textView30= findViewById(R.id.textView30);
        textView31= findViewById(R.id.textView31);
        textView32= findViewById(R.id.textView32);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextTextPersonName19.getText().toString();
                String a = editTextTextPersonName20.getText().toString();
                String b = editTextTextPersonName21.getText().toString();
                double r = Float.parseFloat(s);
                double theta = 0.0174533 * Float.parseFloat(a);
                double phi = 0.0174533 * Float.parseFloat(b);
                double x = r * Math.sin(phi) * Math.cos(theta);
                textView30.setText(" x : " + df.format(x));
                double y = r * Math.sin(phi) * Math.sin(theta);
                textView31.setText(" y : " + df.format(y));
                double z = r * Math.cos(phi);
                textView32.setText(" z : " +df.format(z));
            }
        });
    }
}