package com.example.casper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewHelloWord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewHelloWord=findViewById(R.id.textViewHelloWord);
        textViewHelloWord.setText("你好，编程实现的Hello world！");
    }
}
