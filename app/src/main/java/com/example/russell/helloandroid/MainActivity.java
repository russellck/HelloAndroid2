package com.example.russell.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
    public static String MA = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.w(MA, "View Resources: " + R.layout.activity_main);

        int count=0;
        for(int i=0; i<5; ++i)
            count++;

    }
}
