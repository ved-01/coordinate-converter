package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class spherical extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spherical);
    }

    public void OpenActivitySphCart(View view) {
        Intent intent = new Intent(this, SphericalCartesian.class);
        startActivity(intent);
    }

    public void OpenActivitySphCyl(View view){
        Intent intent = new Intent(this, SphericalCylindrical.class);
        startActivity(intent);
    }
}