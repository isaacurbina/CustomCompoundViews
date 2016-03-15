package com.mobileappsco.training.customviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    MyCompoundView mcv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Set by code */
        //CustomImageView civ = new CustomImageView(this);
        //setContentView(civ);
        mcv = new MyCompoundView(this);
        setContentView(mcv);
        mcv.setCompoundView("Bad Toro", R.mipmap.badtoro);
    }
}
