package com.example.aartisangrah;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hanuman extends AppCompatActivity implements View.OnClickListener {
    Button bt21, bt22, bt23, bt24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanuman);

        bt21 = findViewById(R.id.btn21);
        bt22 = findViewById(R.id.btn22);
        bt23 = findViewById(R.id.btn23);
        bt24 = findViewById(R.id.btn24);

        bt21.setOnClickListener(this);
        bt22.setOnClickListener(this);
        bt23.setOnClickListener(this);
        bt24.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn21) {
            i = new Intent(this, btn21.class);
        } else if (view.getId() == R.id.btn22) {
            i = new Intent(this, btn22.class);
        } else if (view.getId() == R.id.btn23) {
            i = new Intent(this, btn23.class);
        } else if (view.getId() == R.id.btn24) {
            i = new Intent(this, btn24.class);
        } else {
            i = null; // Handle other cases if needed
        }

        if (i != null) {
            startActivity(i);
        }
    }
}