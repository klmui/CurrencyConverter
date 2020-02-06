package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        double dollars = 0;
        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        String dollarsString = myTextField.getText().toString();

        // Convert dollarsString to double
        try {
            dollars = Double.parseDouble(dollarsString);
            // Valid double
            goToActivity2(dollars);
        } catch(NumberFormatException e) {
            // Invalid double
            myTextField.setText("");
            Toast toast = Toast.makeText(MainActivity.this, "Invalid number of dollars", Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
            toast.show();
        }
    }

    public void goToActivity2(double dollars) {
        // Use intent to indicate where to send data
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("dollars", dollars);
        // Switch activity
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
