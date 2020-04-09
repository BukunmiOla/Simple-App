package com.example.kola_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Request_otp extends AppCompatActivity {
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
        Intent r_password = new Intent(Request_otp.this, Reset_password.class);
        startActivity(r_password);
    }
}
