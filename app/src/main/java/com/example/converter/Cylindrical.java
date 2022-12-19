package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cylindrical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylindrical);
    }
    public void OpenActivityCylCart(View view){
        Intent intent = new Intent(this, CylindricalCartesian.class);
        startActivity(intent);
    }
    public void OpenActivityCylSph(View view){
        Intent intent = new Intent(this,CylindricalSpherical.class);
        startActivity(intent);
    }
}