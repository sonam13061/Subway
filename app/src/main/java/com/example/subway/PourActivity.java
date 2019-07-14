package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PourActivity extends AppCompatActivity {
    Button submit,menu;
    EditText count,sales;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pour);
        submit=findViewById(R.id.submit);
        menu=findViewById(R.id.menu);
        count=findViewById(R.id.count);
        sales=findViewById(R.id.sales);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackground(getResources().getDrawable(R.drawable.back));
                if(TextUtils.isEmpty(count.getText().toString())){
                    count.setError("This field cannot be empty");
                }
                if(TextUtils.isEmpty(sales.getText().toString())){
                    sales.setError("This field cannot be empty");
                }
                if(!TextUtils.isEmpty(sales.getText().toString())&&!TextUtils.isEmpty(count.getText().toString())){
                    Toast.makeText(PourActivity.this, "Response submitted", Toast.LENGTH_SHORT).show();
                }
            }
        });
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PourActivity.this,WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
