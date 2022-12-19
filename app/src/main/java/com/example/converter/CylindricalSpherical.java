package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CylindricalSpherical extends AppCompatActivity {
    private Button button8;
    private TextView textView19,textView20,textView21,textView22,textView23,textView24,textView25;
    private EditText editTextTextPersonName16, editTextTextPersonName17, editTextTextPersonName18;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylindrical_spherical);

    button8 = findViewById(R.id.button8);
    editTextTextPersonName16 = findViewById(R.id.editTextTextPersonName16);
    editTextTextPersonName17 = findViewById(R.id.editTextTextPersonName17);
    editTextTextPersonName18 = findViewById(R.id.editTextTextPersonName18);
    textView23= findViewById(R.id.textView23);
    textView24= findViewById(R.id.textView24);
    textView25= findViewById(R.id.textView25);
    button8.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s = editTextTextPersonName16.getText().toString();
            String a = editTextTextPersonName17.getText().toString();
            String b = editTextTextPersonName18.getText().toString();
            double rho = Float.parseFloat(s);
            double theta = 0.0174533 * Float.parseFloat(a);
            double z = Float.parseFloat(b);
            double r = Math.sqrt(Math.pow(rho,2) + Math.pow(z,2));
            textView23.setText(" r                   : " +df.format(r));
            double phi = Math.atan(rho/z);
            textView25.setText(" ϕ in degree : " +df.format(phi*57.2958));
            textView24.setText(" θ in degree : " +df.format(theta*57.2958));

        }
    });
}}