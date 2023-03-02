package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button; // we;ve to use this import so write it
import android.widget.EditText; // add import
import android.widget.TextView; // add import
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button; // write this
    private TextView textView2; // write this
    private EditText editText; // write this
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button3); // learn this
        textView2 = findViewById(R.id.textView2); // find id through xml code by clicking on that particular view
        editText = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() { // learn this 1:18:00
            @Override
            public void onClick(View view) {
          //      Toast.makeText(MainActivity.this, "Hii click listener worked!", Toast.LENGTH_SHORT).show(); //1:19:00 , write Toast
          String s =  editText.getText().toString(); // learn this and here we want value of edittext as a string , 1:21:10
                int kg = Integer.parseInt(s); // here we taken the edittext value in string format and change it into integer and stored it in the integer vatriable
                double pound = 2.205 * kg; // logic for kg to pound
                textView2.setText("The corresponding value in pounds is " + pound);

            }
        });
    }
}