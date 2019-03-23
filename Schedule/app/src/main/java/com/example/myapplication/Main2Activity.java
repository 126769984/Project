package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

    }

    public void clickbgBack2(View view)
    {

        Intent intent=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void  clickNext2(View view)
    {

        Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(intent);
        finish();
    }
}
