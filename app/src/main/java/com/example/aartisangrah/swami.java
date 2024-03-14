package com.example.aartisangrah;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class swami extends AppCompatActivity implements View.OnClickListener {
    Button bt17, bt18, bt19, bt20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swami);

        bt17 = findViewById(R.id.btn17);
        bt18 = findViewById(R.id.btn18);
        bt19 = findViewById(R.id.btn19);
        bt20 = findViewById(R.id.btn20);

        bt17.setOnClickListener(this);
        bt18.setOnClickListener(this);
        bt19.setOnClickListener(this);
        bt20.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn17) {
            i = new Intent(this, btn17.class);
        } else if (view.getId() == R.id.btn18) {
            i = new Intent(this, btn18.class);
        } else if (view.getId() == R.id.btn19) {
            i = new Intent(this, btn19.class);
        } else if (view.getId() == R.id.btn20) {
            i = new Intent(this, btn20.class);
        } else {
            i = null; // Handle other cases if needed
        }

        if (i != null) {
            startActivity(i);
        }
    }
}