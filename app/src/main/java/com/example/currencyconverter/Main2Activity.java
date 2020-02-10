package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView myTextView = findViewById(R.id.myTextView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        double dollars = Double.parseDouble(str);
        double pounds = dollars*.77;
        myTextView.setText("£ "+pounds);
    }
}
