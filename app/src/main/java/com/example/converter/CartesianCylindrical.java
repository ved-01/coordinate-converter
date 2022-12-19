package com.example.converter;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CartesianCylindrical extends AppCompatActivity {
    private Button button5,reset;
    private EditText editTextTextPersonName10,editTextTextPersonName11,editTextTextPersonName12;
    private TextView textView,textView6,textView7,textView8,textView9,textView10,textView11;
    private static final DecimalFormat df = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cartesian_cylindrical);
        button5=findViewById(R.id.button5);
        editTextTextPersonName10=findViewById(R.id.editTextTextPersonName10);
        editTextTextPersonName11=findViewById(R.id.editTextTextPersonName11);
        editTextTextPersonName12=findViewById(R.id.editTextTextPersonName12);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = editTextTextPersonName10.getText().toString();
                String a = editTextTextPersonName11.getText().toString();
                String b = editTextTextPersonName12.getText().toString();
                double x = Float.parseFloat(s);
                double y = Float.parseFloat(a);
                double z = Float.parseFloat(b);
                double rho = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
                textView9.setText(" ρ                   : " + df.format(rho));
                double theta = Math.atan(y/x);
                textView10.setText(" ϕ in degree  : " +df.format(57.3*theta));
                textView11.setText(" z                   : " +z);


            }
        }

        );

        };
   }