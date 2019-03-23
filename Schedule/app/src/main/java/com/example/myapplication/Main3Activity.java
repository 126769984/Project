package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Main3Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

    }

    public void clickbgBack3(View view)
    {
        Intent localIntent=new Intent(Main3Activity.this,MainActivity.class);//你要转向的Activity
        startActivity(localIntent);//执行
        finish();
    }

    public void clickBack3(View view)
    {
        Intent localIntent=new Intent(Main3Activity.this,Main2Activity.class);//你要转向的Activity
        startActivity(localIntent);//执行
        finish();
    }
}
