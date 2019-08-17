package com.example.administrator.homemadechocolate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class Seel extends AppCompatActivity {

    TextView tv;
    RatingBar rt;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seel);

        rt=(RatingBar)findViewById(R.id.aa);
        tv=(TextView)findViewById(R.id.ab);

        rt.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                tv.setText("Value is:"+v);
            }
        });

    }
}
