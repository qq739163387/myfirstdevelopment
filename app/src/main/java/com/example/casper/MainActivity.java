package com.example.casper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
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

        textViewHelloWord.setText(R.string.hello_world);   //直接设置字符串资源id
        textViewHelloWord.setText(this.getString(R.string.hello_word));    //通过资源id获得字符串

        //通过资源名称获得字符串，如何通过“hello world”获得R.string.hello_world
        Context context=this.getApplicationContext();
        String resName="hello_world";
        int helloWorldId=context.getResources().getIdentifier(resName,"string",context.getPackageName());
        textViewHelloWord.setText(this.getString(helloWorldId));
    }
}
