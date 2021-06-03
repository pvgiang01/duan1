package com.example.project1group3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {
    TextView tvLogo;
    TextView tvAppName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        tvLogo = findViewById(R.id.ivIconSplashScreen);
        tvAppName = findViewById(R.id.tvAppNameSplashScreen);


        new Handler().postDelayed(() -> {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(2000);
            alphaAnimation.setStartOffset(1000);
            alphaAnimation.setFillAfter(true);
            tvLogo.startAnimation(alphaAnimation);
            tvAppName.startAnimation(alphaAnimation);

            startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
            finish();
        }, 3000);
    }
}