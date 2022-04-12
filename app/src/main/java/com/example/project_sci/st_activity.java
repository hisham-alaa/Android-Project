package com.example.project_sci;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class st_activity extends AppCompatActivity {
    private static int SPLASH_MAX_TIME=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st_activity);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent intent =new Intent(st_activity.this, MainActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        },SPLASH_MAX_TIME);
    }
}