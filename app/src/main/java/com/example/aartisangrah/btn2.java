package com.example.aartisangrah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class btn2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn2);


        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);
        TextView text4 = findViewById(R.id.text4);

        ImageView Button1 = findViewById(R.id.Button1);
        ImageView Button2 = findViewById(R.id.Button2);
        ImageView Button3 = findViewById(R.id.Button3);
        ImageView Button4 = findViewById(R.id.Button4);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getVisibility() == View.GONE){
                    text1.setVisibility(view.VISIBLE);
                    Button1.setImageResource(R.drawable.keyboard_up_arrow);
                } else {
                    text1.setVisibility(view.GONE);
                    Button1.setImageResource(R.drawable.keyboard_down_arrow);
                }
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text2.getVisibility() == View.GONE){
                    text2.setVisibility(view.VISIBLE);
                    Button2.setImageResource(R.drawable.keyboard_up_arrow);
                } else {
                    text2.setVisibility(view.GONE);
                    Button2.setImageResource(R.drawable.keyboard_down_arrow);
                }
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text3.getVisibility() == View.GONE){
                    text3.setVisibility(view.VISIBLE);
                    Button3.setImageResource(R.drawable.keyboard_up_arrow);
                } else {
                    text3.setVisibility(view.GONE);
                    Button3.setImageResource(R.drawable.keyboard_down_arrow);
                }
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text4.getVisibility() == View.GONE){
                    text4.setVisibility(view.VISIBLE);
                    Button4.setImageResource(R.drawable.keyboard_up_arrow);
                } else {
                    text4.setVisibility(view.GONE);
                    Button4.setImageResource(R.drawable.keyboard_down_arrow);
                }
            }
        });


    }
}

