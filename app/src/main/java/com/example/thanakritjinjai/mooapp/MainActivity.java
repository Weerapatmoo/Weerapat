package com.example.thanakritjinjai.mooapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button next = (Button)findViewById(R.id.a1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this ,a.class);
                startActivity(i);
            }
        });
        Button next1 = (Button)findViewById(R.id.b1);
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View y) {
                Intent j = new Intent(MainActivity.this ,b.class);
                startActivity(j);
            }
        });
        Button next2 = (Button)findViewById(R.id.c1);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View x) {
                Intent k = new Intent(MainActivity.this ,c.class);
                startActivity(k);
            }
        });
        Button next3 = (Button)findViewById(R.id.d1);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View z) {
                Intent l = new Intent(MainActivity.this ,d.class);
                startActivity(l);
            }
        });
    }
}
