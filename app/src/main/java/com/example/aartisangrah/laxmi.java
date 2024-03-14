package com.example.aartisangrah;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class laxmi extends AppCompatActivity implements View.OnClickListener {
    Button bt9, bt10, bt11, bt12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laxmi);

        bt9 = findViewById(R.id.btn9);
        bt10 = findViewById(R.id.btn10);
        bt11 = findViewById(R.id.btn11);
        bt12 = findViewById(R.id.btn12);

        bt9.setOnClickListener(this);
        bt10.setOnClickListener(this);
        bt11.setOnClickListener(this);
        bt12.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.btn9) {
            i = new Intent(this, btn9.class);
        } else if (view.getId() == R.id.btn10) {
            i = new Intent(this, btn10.class);
        } else if (view.getId() == R.id.btn11) {
            i = new Intent(this, btn11.class);
        } else if (view.getId() == R.id.btn12) {
            i = new Intent(this, btn12.class);
        } else {
            i = null; // Handle other cases if needed
        }

        if (i != null) {
            startActivity(i);
        }
    }
}