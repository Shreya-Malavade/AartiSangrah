package com.example.aartisangrah;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    private CardView Ganesh, Shiv, Laxmi, Krishna, Swami, Hanuman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Ganesh = (CardView) findViewById(R.id.ganesh);
        Shiv = (CardView) findViewById(R.id.shiv);
        Laxmi = (CardView) findViewById(R.id.laxmi);
        Krishna = (CardView) findViewById(R.id.krishna);
        Swami = (CardView) findViewById(R.id.swami);
        Hanuman = (CardView) findViewById(R.id.hanuman);

        Ganesh.setOnClickListener(this);
        Shiv.setOnClickListener(this);
        Laxmi.setOnClickListener(this);
        Krishna.setOnClickListener(this);
        Swami.setOnClickListener(this);
        Hanuman.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        if (view.getId() == R.id.ganesh) {
            i = new Intent(this, ganesh.class);
            startActivity(i);
        } else if (view.getId() == R.id.shiv) {
            i = new Intent(this, shiv.class);
            startActivity(i);
        } else if (view.getId() == R.id.laxmi) {
            i = new Intent(this, laxmi.class);
            startActivity(i);
        } else if (view.getId() == R.id.krishna) {
            i = new Intent(this, krishna.class);
            startActivity(i);
        } else if (view.getId() == R.id.swami) {
            i = new Intent(this, swami.class);
            startActivity(i);
        } else if (view.getId() == R.id.hanuman) {
            i = new Intent(this, hanuman.class);
            startActivity(i);
        }
    }
}
