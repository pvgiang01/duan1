
package com.example.project1group3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class LoginAdminActivity extends AppCompatActivity {
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLoginAdmin);

        btnLogin.setOnClickListener(v ->{
            startActivity(new Intent(LoginAdminActivity.this, MainActivity.class));
            finish();
        });
    }
}