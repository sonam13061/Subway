package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Signupactivity extends AppCompatActivity {
    EditText user,email,outlet,pwd,confirm;
    Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signupactivity);
        user=findViewById(R.id.user);
        email=findViewById(R.id.mail);
        outlet=findViewById(R.id.outlet);
        pwd=findViewById(R.id.pw);
        confirm=findViewById(R.id.confirm);
        signup=findViewById(R.id.sign);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackground(getResources().getDrawable(R.drawable.back));




                if(TextUtils.isEmpty(user.getText().toString())){
                    user.setError("Username field cannot be empty ");
                }
                if(TextUtils.isEmpty(email.getText().toString())){
                     email.setError("Email field cannot be empty ");
                }
                 if(TextUtils.isEmpty(outlet.getText().toString())){
                    outlet.setError("Please enter the outlet ");
                }
                 if(TextUtils.isEmpty(pwd.getText().toString())){
                    pwd.setError("password field cannot be empty ");
                }
                  if(TextUtils.isEmpty(confirm.getText().toString())){
                    confirm.setError("Please confirm the password ");
                }

                if(!TextUtils.isEmpty(user.getText().toString())&& !TextUtils.isEmpty(email.getText().toString())&& !TextUtils.isEmpty(outlet.getText().toString())&&!TextUtils.isEmpty(pwd.getText().toString())&&!TextUtils.isEmpty(confirm.getText().toString())){
                    if(pwd.getText().toString().equals(confirm.getText().toString())) {
                        Intent intent = new Intent(Signupactivity.this, WelcomeActivity.class);
                        startActivity(intent);
                        Toast.makeText(Signupactivity.this, "Welcome "+user.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                    else{
                        confirm.setError("Password doesn't match");
                    }
                }


            }
        });
    }
}
