package com.example.administrator.homemadechocolate;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Signuppage extends AppCompatActivity {

    private ProgressDialog progressDialog;
     EditText nameofinstitute,name,address,email,password,contactno;
     Button loginButton;
     TextView loginupLink;
    InputStream is=null;
    String result=null;
    String line=null;

    int code;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signuppage);
       nameofinstitute = findViewById(R.id.nameofinstitute);
        name = findViewById(R.id.Name);
        progressDialog = new ProgressDialog(this);

        address = findViewById(R.id.Address);
        email = findViewById(R.id.Email);
        password = findViewById(R.id.password);
        contactno = findViewById(R.id.contactno);
        loginButton = findViewById(R.id.btn_signup);
        loginupLink = findViewById(R.id.link_login);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);

        loginupLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });

    }


}
