package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void OpenActivityCartesian(View view){
        Intent intent = new Intent(this, Cartesian.class);
        startActivity(intent);
    }
    public void OpenActivitySpherical(View view){
        Intent intent = new Intent(this, spherical.class);
        startActivity(intent);
    }
    public void OpenActivityCylindrical(View view){
        Intent intent= new Intent(this, Cylindrical.class);
        startActivity(intent);
    }

}