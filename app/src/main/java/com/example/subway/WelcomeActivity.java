package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener {
    Button learn,pour,earn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        learn=findViewById(R.id.learn);
        pour=findViewById(R.id.pour);
        earn=findViewById(R.id.earn);
        learn.setOnClickListener(this);
        pour.setOnClickListener(this);
        earn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id=v.getId();
        v.setBackground(getResources().getDrawable(R.drawable.back));
        switch (id){
            case R.id.learn:
                Intent intent=new Intent(WelcomeActivity.this,LearnActivity.class);
                startActivity(intent);
                break;
            case R.id.pour:
                Intent intent1=new Intent(WelcomeActivity.this,PourActivity.class);
                startActivity(intent1);
                break;
            case R.id.earn:
                Intent intent2=new Intent(WelcomeActivity.this,EarnActivity.class);
                startActivity(intent2);
                break;
        }
    }
}
