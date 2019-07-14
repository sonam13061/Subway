package com.example.subway;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    EditText usernme,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        usernme=findViewById(R.id.uname);
        password=findViewById(R.id.pass);
        login=findViewById(R.id.log);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.setBackground(getResources().getDrawable(R.drawable.back));
                String requser="sonam1306";
                String reqpass="sonamkhurana13";
                String uname = usernme.getText().toString();
                 String pass = password.getText().toString();


                if (uname.equals(requser)) {
                    if (pass.equals(reqpass)) {
                        //new Activity
                        Intent intent=new Intent(LoginActivity.this,WelcomeActivity.class);
                        startActivity(intent);
                        Toast.makeText(LoginActivity.this, "Welcome "+ uname, Toast.LENGTH_SHORT).show();
                    }
                    else if (TextUtils.isEmpty(pass)) {
                        password.setError("Password field cannot be empty");
                    }
                    else {
                        password.setError(" please enter a valid Password");

                    }

                }
                else {
                    if(TextUtils.isEmpty(uname)){
                        if(TextUtils.isEmpty(pass)) {
                            usernme.setError("Username field cannot be empty");
                            password.setError("password field cannot be empty");
                        }
                        else {
                            usernme.setError("Username field cannot be empty");

                        }

                    }
                    else{
                        usernme.setError("Please enter a valid Username");
                    }
                }
            }


        });

    }
}
