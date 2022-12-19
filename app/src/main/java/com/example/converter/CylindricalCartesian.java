package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CylindricalCartesian extends AppCompatActivity {
    private Button button7;
    private TextView textView12,textView13,textView14,textView15,textView16,textView17,textView18;
    private EditText editTextTextPersonName13, editTextTextPersonName14, editTextTextPersonName15;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylindrical_cartesian);
        button7 = findViewById(R.id.button7);
        editTextTextPersonName13 = findViewById(R.id.editTextTextPersonName13);
        editTextTextPersonName14 = findViewById(R.id.editTextTextPersonName14);
        editTextTextPersonName15 = findViewById(R.id.editTextTextPersonName15);
        textView16= findViewById(R.id.textView16);
        textView17= findViewById(R.id.textView17);
        textView18= findViewById(R.id.textView18);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextTextPersonName13.getText().toString();
                String a = editTextTextPersonName14.getText().toString();
                String b = editTextTextPersonName15.getText().toString();
                double rho = Float.parseFloat(s);
                double phi = 0.0174533 * Float.parseFloat(a);
                double z = Float.parseFloat(b);
                double x = rho * Math.cos(phi);
                textView16.setText("  x : " + df.format(x));
                double y = rho * Math.sin(phi);
                textView17.setText("  y : " +df.format(y));
                textView18.setText("z : " + df.format(z));

            }
        });



    }
}