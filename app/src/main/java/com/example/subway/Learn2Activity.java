package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Learn2Activity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn2);
        b1=findViewById(R.id.op1);
        b2=findViewById(R.id.op2);
        b3=findViewById(R.id.op3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        v.setBackground(getResources().getDrawable(R.drawable.back));
        Intent intent=new Intent(Learn2Activity.this,Learn3Activity.class);
        startActivity(intent);
    }
}
