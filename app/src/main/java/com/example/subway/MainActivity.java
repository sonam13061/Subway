package com.example.subway;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn);
        b2=findViewById(R.id.btn2);
    }
    public void  onclick(View v){
        int id=v.getId();
        v.setBackground(getResources().getDrawable(R.drawable.back));
        switch (id){
            case R.id.btn:
                            Intent intent2=new Intent(MainActivity.this,Signupactivity.class);
                            startActivity(intent2);
                            break;
            case R.id.btn2:
                Intent intent=new Intent(MainActivity.this,LoginActivity.class);
                startActivity(intent);
                break;
        }

    }
}
