package com.example.aartisangrah;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class krishna extends AppCompatActivity implements View.OnClickListener {
    Button bt13, bt14, bt15, bt16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krishna);

        bt13 = findViewById(R.id.btn13);
        bt14 = findViewById(R.id.btn14);
        bt15 = findViewById(R.id.btn15);
        bt16 = findViewById(R.id.btn16);

        bt13.setOnClickListener(this);
        bt14.setOnClickListener(this);
        bt15.setOnClickListener(this);
        bt16.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn13) {
            i = new Intent(this, btn13.class);
        } else if (view.getId() == R.id.btn14) {
            i = new Intent(this, btn14.class);
        } else if (view.getId() == R.id.btn15) {
            i = new Intent(this, btn15.class);
        } else if (view.getId() == R.id.btn16) {
            i = new Intent(this, btn16.class);
        } else {
            i = null; // Handle other cases if needed
        }

        if (i != null) {
            startActivity(i);
        }
    }
}
