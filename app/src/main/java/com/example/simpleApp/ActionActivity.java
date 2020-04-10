package com.example.simpleApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActionActivity extends AppCompatActivity {

    Button login, sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        login=findViewById(R.id.login);
        sign_up=findViewById(R.id.sign_up);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SignUp();
            }
        });
    }
    private void Login(){
        Intent login=new Intent(ActionActivity.this, LoginActivity.class);
        startActivity(login);
    }
    private void SignUp(){
        Intent signup = new Intent(ActionActivity.this, SignUpActivity.class);
        startActivity(signup);
    }
}
