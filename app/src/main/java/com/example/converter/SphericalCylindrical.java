package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class SphericalCylindrical extends AppCompatActivity {
    private Button button10;
    private TextView textView33,textView34,textView35,textView36,textView37,textView38,textView39;
    private EditText editTextTextPersonName22, editTextTextPersonName23, editTextTextPersonName24;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spherical_cylindrical);
        button10 = findViewById(R.id.button10);
        editTextTextPersonName22 = findViewById(R.id.editTextTextPersonName22);
        editTextTextPersonName23 = findViewById(R.id.editTextTextPersonName23);
        editTextTextPersonName24 = findViewById(R.id.editTextTextPersonName24);
        textView37= findViewById(R.id.textView37);
        textView38= findViewById(R.id.textView38);
        textView39= findViewById(R.id.textView39);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextTextPersonName22.getText().toString();
                String a = editTextTextPersonName23.getText().toString();
                String b = editTextTextPersonName24.getText().toString();
                double r = Float.parseFloat(s);
                double theta = 0.0174533 * Float.parseFloat(a);
                double phi = 0.0174533 * Float.parseFloat(b);
                double rho = r * Math.sin(phi);
                textView37.setText(" ρ                  : " + df.format(rho));
                textView38.setText(" ϕ in degree : " +df.format(theta/0.0174533));
                double z = r * Math.cos(phi);
                textView39.setText(" z                  : " + df.format(z));
            }
        });
    }
}