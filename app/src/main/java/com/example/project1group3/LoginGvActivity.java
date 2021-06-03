package com.example.project1group3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginGvActivity extends AppCompatActivity {
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_gv);

        btnLogin = findViewById(R.id.btnLoginGV);

        btnLogin.setOnClickListener(v ->{
            startActivity(new Intent(LoginGvActivity.this, MainActivity.class));
            finish();
        });
    }
}