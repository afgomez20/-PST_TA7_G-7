package com.example.amst7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import java.time.Duration;

public class SplashActivity extends AppCompatActivity {

    private final int DURACION_SPLASH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            
            public void run() {
<<<<<<< HEAD
                Intent intent = new Intent(SplashActivity.this,inicio_sesion.class);
=======
                Intent intent = new Intent(SplashActivity.this,MenuActivity.class);
>>>>>>> ad25566319f0d9c493630e921636ff0fb1f4a935
                startActivity(intent);
                finish();

            }
        }, DURACION_SPLASH);

    }
}