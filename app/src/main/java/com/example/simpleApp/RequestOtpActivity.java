package com.example.simpleApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RequestOtpActivity extends AppCompatActivity {
    Button get_otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_otp);

        get_otp = (Button) findViewById(R.id.send_otp);
        get_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fgt_pw();
            }
        });
    }
    private void fgt_pw(){
        Intent r_password = new Intent(RequestOtpActivity.this, ResetPasswordActivity.class);
        startActivity(r_password);
    }
}
