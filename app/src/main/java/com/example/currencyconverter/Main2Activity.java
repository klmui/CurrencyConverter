package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent(); // MainActivity sent an intent here
        double dollars = intent.getDoubleExtra("dollars", 0);

        // Convert dollars to pounds
        double pounds = dollars * 0.77;

        textView2.setText("£" + pounds);
    }
}
