package com.example.yousra.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void clickFunction (View view){

        EditText dollar = (EditText) findViewById(R.id.dollar);
        Double pounds=Double.parseDouble(dollar.getText().toString());
        Double poundsans =pounds * 0.75;
        Toast.makeText(MainActivity.this,  String.format("%.2f" , poundsans)+"pounds", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
