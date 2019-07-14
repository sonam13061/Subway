package com.example.subway;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Learn3Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn3);
        b1=findViewById(R.id.op1);
        b2=findViewById(R.id.op2);
        b3=findViewById(R.id.op3);
        back=findViewById(R.id.back);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                Intent intent=new Intent(Learn3Activity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        v.setBackground(getResources().getDrawable(R.drawable.back));
        Toast.makeText(this, "Response submitted.Thank You.", Toast.LENGTH_SHORT).show();
    }
}
