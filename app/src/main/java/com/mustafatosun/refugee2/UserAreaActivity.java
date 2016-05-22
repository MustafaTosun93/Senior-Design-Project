package com.mustafatosun.refugee2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etMail= (EditText) findViewById(R.id.etMail);
        final TextView welcomeMessage=(TextView) findViewById(R.id.tvWelcomeMsg);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username= intent.getStringExtra("username");
        String mail= intent.getStringExtra("mail");

        String message = name + "Welcome to your user area ";
        welcomeMessage.setText(message);
        etUsername.setText(username);
        etMail.setText(mail);




    }
}
