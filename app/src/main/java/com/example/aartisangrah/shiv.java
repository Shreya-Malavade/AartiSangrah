package com.example.aartisangrah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class shiv extends AppCompatActivity implements View.OnClickListener {
    Button bt5, bt6, bt7, bt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiv);

        bt5 = findViewById(R.id.btn5);
        bt6 = findViewById(R.id.btn6);
        bt7 = findViewById(R.id.btn7);
        bt8 = findViewById(R.id.btn8);

        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
        bt7.setOnClickListener(this);
        bt8.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn5) {
            i = new Intent(this, btn5.class);
        } else if (view.getId() == R.id.btn6) {
            i = new Intent(this, btn6.class);
        } else if (view.getId() == R.id.btn7) {
            i = new Intent(this, btn7.class);
        } else if (view.getId() == R.id.btn8) {
            i = new Intent(this, btn8.class);
        } else {
            i = null; // Handle other cases if needed
        }

        if (i != null) {
            startActivity(i);
        }
    }
}
