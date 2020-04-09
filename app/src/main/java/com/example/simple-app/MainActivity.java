package com.example.kola_task1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next= findViewById(R.id.imageView);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Next();
            }
        });

    }
    private void Next(){
        Intent welcome= new Intent(MainActivity.this, Action.class);
                startActivity(welcome);
    }
}
