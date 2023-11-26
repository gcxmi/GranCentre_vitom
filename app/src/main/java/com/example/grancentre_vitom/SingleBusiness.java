package com.example.grancentre_vitom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SingleBusiness extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_business);
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new Fragment_navbar())
                    .commit();
        }
    }
}