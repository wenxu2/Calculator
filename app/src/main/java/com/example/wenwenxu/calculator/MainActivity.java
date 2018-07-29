package com.example.wenwenxu.calculator;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.wenwenxu.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    static ActivityMainBinding binding;
    static String firstnumber;
    static StringBuilder first_number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

    }

    public String getFirst_number()
    {

        return firstnumber;
    }



}
