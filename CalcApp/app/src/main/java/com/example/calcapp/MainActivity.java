package com.example.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void add (View v) {
        //Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types

        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());



        // add the two ints

        int sum = num1 + num2;

        // set the text for the answer

        ansTextView.setText("Answer: " + sum);


    }

    public void subt(View v) {


        //Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types

        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());



        // add the two ints

        int diff = num1 - num2;

        // set the text for the answer

        ansTextView.setText("Answer: " + diff);


    }


    public void mult(View v) {


        //Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types

        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());



        // add the two ints

        int prod = num1 * num2;

        // set the text for the answer

        ansTextView.setText("Answer: " + prod);




    }

    public void div(View v) {


        //Get references to all elements on app screen
        EditText num1EditText = (EditText) findViewById(R.id.num1EditText);
        EditText num2EditText = (EditText) findViewById(R.id.num2EditText);
        TextView ansTextView = (TextView) findViewById(R.id.ansTextView);

        // get the values from the EditText boxes and convert them to int data types

        int num1 = Integer.parseInt(num1EditText.getText().toString());
        int num2 = Integer.parseInt(num2EditText.getText().toString());



        // add the two ints

        int quot = num1 - num2;

        // set the text for the answer

        ansTextView.setText("Answer: " + quot);


    }
}