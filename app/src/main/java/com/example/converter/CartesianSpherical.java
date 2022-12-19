package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CartesianSpherical extends AppCompatActivity {
private Button button;
private EditText editTextTextPersonName;
private EditText editTextTextPersonName2;
private EditText editTextTextPersonName5;
private TextView editTextTextPersonName8,editTextTextPersonName6,editTextTextPersonName9;
    private static final DecimalFormat df = new DecimalFormat("0.00");

   @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartesian_spherical);
        button = findViewById(R.id.button6);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextTextPersonName5 = findViewById(R.id.editTextTextPersonName5);
        editTextTextPersonName6 = findViewById((R.id.editTextTextPersonName6));
        editTextTextPersonName8 = findViewById((R.id.editTextTextPersonName8));
        editTextTextPersonName9 = findViewById((R.id.editTextTextPersonName9));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextTextPersonName.getText().toString();
                String a = editTextTextPersonName2.getText().toString();
                String b = editTextTextPersonName5.getText().toString();
                double x = Float.parseFloat(s);
                double y = Float.parseFloat(a);
                double z = Float.parseFloat(b);
                double r = Math.sqrt(Math.pow(x,2) + Math.pow(y,2) + Math.pow(z,2));
                editTextTextPersonName8.setText(" r                    : " + df.format(r));
                double theta = Math.atan(y/x);
                editTextTextPersonName6.setText(" θ in degree  : " + df.format(57.3*theta));
                double phi = Math.atan((Math.sqrt(Math.pow(x,2) + Math.pow(y,2)))/z);
                editTextTextPersonName9.setText(" ϕ in degree  : " + df.format(57.3*phi));
            }
        });

    }

}