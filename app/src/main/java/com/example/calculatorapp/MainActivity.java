package com.example.calculatorapp;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static String TAG ="MainActivity";
    private static final String TV_KEY = "";
    private double values = 0.0;
    public ArrayList<String> numbers = new ArrayList<>();

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button0;
    Button buttonPlus;
    Button buttonMinus;
    Button buttonDevide;
    Button buttonRSet;
    Button buttonDot;
    Button buttonCalc;
    TextView textView;

    public static final String EXTRA_MESSAGE = "This is a message from beoynd";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate() called");
        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        button5 = findViewById(R.id.btn5);
        button6 = findViewById(R.id.btn6);
        button7 = findViewById(R.id.btn7);
        button8 = findViewById(R.id.btn8);
        button9 = findViewById(R.id.btn9);
        button0 = findViewById(R.id.btn0);
        buttonPlus = findViewById(R.id.btnPlus);
        buttonMinus = findViewById(R.id.btnMinus);
        buttonDevide = findViewById(R.id.btnDevide);
        buttonRSet = findViewById(R.id.btnRSet);
        buttonDot = findViewById(R.id.btnDot);
        buttonCalc = findViewById(R.id.btnCalculate);
        textView = findViewById(R.id.tvNumbers);




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 1;
                values += value;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn1 pressed," + values + textView.getText());
                //textView.setText(textView.getText() + Double.toString(value));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 2;
                values += 2;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn2 pressed," + values + textView.getText());
                //textView.setText((textView+Double.toString(value)));

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 3;
                values += 3;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn3 pressed," + values + textView.getText());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 4;
                values += 4;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn4 pressed," + values + textView.getText());
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 5;
                values += 5;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn5 pressed," + values + textView.getText());
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 6;
                values += 6;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn6 pressed," + values + textView.getText());
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 7;
                values += 7;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn7 pressed," + values + textView.getText());
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 8;
                values += 8;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn8 pressed," + values + textView.getText());
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 9;
                values += 9;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn9 pressed," + values + textView.getText());
            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int value = 0;
                values += 0;
                textView.append(Integer.toString(value));
                Log.d(TAG, "btn0 pressed, " + values + textView.getText());
            }
        });
        buttonRSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                numbers.clear();
                Log.d(TAG, "btnRSet Pressed, Setting textView to '' and clear on arrayList " + "\n" +
                                "Array is now: " + numbers);
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView.getText().toString().trim().isEmpty()){
                    Log.d(TAG, "ERR: Empty TextView");
                } else {
                    numbers.add(textView.getText().toString().trim());
                    Log.d(TAG, "OK: TextView Added to ArrayList");
                }
                if ("+".contains(numbers.get(numbers.size()-1))){
                    Log.d(TAG, "ERR: Double input of '+'. Press ignored ");
                } else {
                    numbers.add("+");
                    Log.d(TAG, "OK: Added '+' ");
                }
                textView.setText("");
                Log.d(TAG, "UPD: ArrayList Currently Holds: " + numbers.toString());
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Button Minus Clicked");

                //Checks if  the TextView is empty
                if (textView.getText().toString().trim().isEmpty()){
                    Log.d(TAG, "ERR: Empty TextView");
                } else {
                    numbers.add(textView.getText().toString().trim());
                    Log.d(TAG, "OK: TextView Added to ArrayList");
                }

                //Checks if the last value "-" added was the same
                if ("-".contains(numbers.get(numbers.size()-1))){
                    Log.d(TAG, "ERR: Double input of '-'. Press ignored ");
                } else {
                    numbers.add("-");
                    Log.d(TAG, "OK: Added '-' ");
                }
                textView.setText("");
                Log.d(TAG, "UPD: ArrayList Currently Holds: " + numbers.toString());
            }
        });
        buttonCalc.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View v) {
                Log.d(TAG, "Button Calculate Clicked");
                if (numbers.isEmpty()){
                    Log.d(TAG, "ERR: Array is Empty");
                } else {
                    numbers.add(textView.getText().toString().trim());
                    sendMessage();
                }

            }
        });
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void sendMessage(){
        Intent intent = new Intent(this, DisplayMessageActivity.class);

        String listString = String.join("", numbers);

       // String message = listString;
        intent.putExtra(EXTRA_MESSAGE, listString);
        startActivity(intent);

    }







/*
    public void init(){
        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);
        Button button7 = findViewById(R.id.btn7);
        Button button8 = findViewById(R.id.btn8);
        Button button9 = findViewById(R.id.btn9);
        Button button0 = findViewById(R.id.btn0);
        Button buttonPlus = findViewById(R.id.btnPlus);
        Button buttonMinus = findViewById(R.id.btnMinus);
        Button buttonDevide = findViewById(R.id.btnDevide);
        Button buttonDel = findViewById(R.id.btnDel);
        Button buttonDot = findViewById(R.id.btnDot);
        TextView textView = findViewById(R.id.tvNumbers);
        Log.d(TAG,"Init() called");
    }
    */
}
