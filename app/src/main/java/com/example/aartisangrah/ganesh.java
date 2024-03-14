package com.example.aartisangrah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ganesh extends AppCompatActivity implements View.OnClickListener {
    Button bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganesh);

        bt1 = findViewById(R.id.btn1);
        bt2 = findViewById(R.id.btn2);
        bt3 = findViewById(R.id.btn3);
        bt4 = findViewById(R.id.btn4);

        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn1) {
            i = new Intent(this, btn1.class);
        } else if (view.getId() == R.id.btn2) {
            i = new Intent(this, btn2.class);
        } else if (view.getId() == R.id.btn3) {
            i = new Intent(this, btn3.class);
        } else if (view.getId() == R.id.btn4) {
            i = new Intent(this, btn4.class);
        } else {
            i = null; // Handle other cases if needed
        }

        if (i != null) {
            startActivity(i);
        }
    }
}
