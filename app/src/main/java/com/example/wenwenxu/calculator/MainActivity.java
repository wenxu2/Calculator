package com.example.wenwenxu.calculator;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import com.example.wenwenxu.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    static ActivityMainBinding binding;
    static String firstnumber;
    static String secondNumber;
    static StringBuilder sb = new StringBuilder();
    static int calculateMethod = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);

        getFirst_number();


    }

    public String getFirst_number()
    {
        binding.oneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("1");
                binding.Total.setText(sb);
            }
        });

        binding.twoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("2");
                binding.Total.setText(sb);
            }
        });
        binding.threeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("3");
                binding.Total.setText(sb);
            }
        });
        binding.fourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("4");
                binding.Total.setText(sb);
            }
        });
        binding.fiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("5");
                binding.Total.setText(sb);
            }
        });
        binding.sixButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("6");
                binding.Total.setText(sb);
            }
        });
        binding.sevenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("7");
                binding.Total.setText(sb);
            }
        });
        binding.eightButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("8");
                binding.Total.setText(sb);
            }
        });
        binding.nineButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("9");
                binding.Total.setText(sb);
            }
        });
        binding.zeroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sb.append("0");
                binding.Total.setText(sb);
            }
        });

        binding.clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.Total.setText("0");
                sb = new StringBuilder();
            }
        });

        binding.divisonButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnumber = sb.toString();
                Log.d("first numebr: ",firstnumber);
                sb = new StringBuilder();
                Log.d("Sb",sb.toString());
                calculateMethod = 1;

            }
        });

        binding.timesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnumber = sb.toString();
                Log.d("first numebr: ",firstnumber);
                sb = new StringBuilder();
                Log.d("Sb",sb.toString());
                calculateMethod = 2;
            }
        });

        binding.minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnumber = sb.toString();
                Log.d("first numebr: ",firstnumber);
                sb = new StringBuilder();
                Log.d("Sb",sb.toString());
                calculateMethod = 3;
            }
        });

        binding.plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstnumber = sb.toString();
                //Log.d("first numebr: ",firstnumber);
                sb = new StringBuilder();
                Log.d("Sb",sb.toString());
                calculateMethod = 4;
            }
        });

        binding.equalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondNumber = sb.toString();
                Log.d("first numebr: ",firstnumber);
                Log.d("Second number: ",secondNumber);
                Log.d("calculte method"," "+calculateMethod);
                calculate(Integer.parseInt(firstnumber),Integer.parseInt(secondNumber));
                sb = new StringBuilder();
            }
        });

        binding.percentageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = binding.Total.getText().toString();
                int percentage = Integer.parseInt(number) / 10;
                binding.Total.setText("." + String.format("%03d", percentage).toString());
                sb = new StringBuilder();


            }
        });


        return firstnumber;
    }

    public void calculate(int number1, int number2)
    {
        int total = 0;

        if(calculateMethod == 1)
        {
            total = number1 / number2;
        }
        else if(calculateMethod == 2)
        {
            total = number1 * number2;
        }
        else if(calculateMethod == 3)
        {
            total = number1 - number2;
        }
        else if(calculateMethod == 4)
        {
            total = number1 + number2;
        }

        binding.Total.setText(Integer.toString(total));
    }


}
