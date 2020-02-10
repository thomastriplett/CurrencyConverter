package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v){
        EditText myText = findViewById(R.id.myText);
        String str = myText.getText().toString();
        goToActivity2(str);
    }

    public void goToActivity2(String s){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("message",s);
        startActivity(intent);
    }
}
