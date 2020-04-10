package com.example.simpleApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView forgot_password, sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        forgot_password = (TextView) findViewById(R.id.forgot_pw);

        forgot_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fgt_pw();
            }
        });

        sign_up=findViewById(R.id.sign_up);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUp();
            }
        });
    }
    private void fgt_pw(){
        Intent f_password = new Intent(LoginActivity.this, RequestOtpActivity.class);
        startActivity(f_password);
    }

    private void SignUp(){
        Intent signup = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(signup);
    }
}
