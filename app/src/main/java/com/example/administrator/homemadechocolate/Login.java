package com.example.administrator.homemadechocolate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login  extends AppCompatActivity {
    TextView signup;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signup = findViewById(R.id.link_signup);
        login = findViewById(R.id.btn_lo1111gin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i  = new Intent(getApplicationContext(),dashboard.class);
                startActivity(i);
            }
        });
signup.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i  = new Intent(getApplicationContext(),Signuppage.class);
        startActivity(i);
    }
});
    }
}