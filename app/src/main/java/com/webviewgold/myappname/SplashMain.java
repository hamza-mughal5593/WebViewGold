package com.webviewgold.myappname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_main);

        new Handler().postDelayed(new Runnable() {
            public void run() {

                Intent in = new Intent(SplashMain.this,MainActivity.class);
                startActivity(in);

                finish();
            }
        }, 3000);

    }
}