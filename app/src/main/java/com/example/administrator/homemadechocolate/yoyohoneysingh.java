package com.example.administrator.homemadechocolate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yoyohoneysingh extends AppCompatActivity {
    Button bt1,bt2,bt3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoyohoneysingh);

        bt1=(Button)findViewById(R.id.bton1);
        bt2=(Button)findViewById(R.id.bton2);
        bt3=(Button)findViewById(R.id.bton3);
    }
    public void btn1(View view){
        bt1.setVisibility(View.INVISIBLE);
        bt2.setVisibility(View.VISIBLE);
        bt3.setVisibility(View.VISIBLE);
    }

    public void btn2(View view){
        bt1.setVisibility(View.VISIBLE);
        bt2.setVisibility(View.INVISIBLE);
        bt3.setVisibility(View.VISIBLE);
    }

    public void btn3(View view){
        bt1.setVisibility(View.VISIBLE);
        bt2.setVisibility(View.VISIBLE);
        bt3.setVisibility(View.INVISIBLE);
    }
}
