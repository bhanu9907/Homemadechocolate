package com.example.administrator.homemadechocolate;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.action_recents:
                        Intent intent = new Intent(getApplicationContext(),dashboard.class);
                        startActivity(intent);
                        break;
                    case R.id.action_favorites:
                        Intent i = new Intent(getApplicationContext(),MainActivity2.class);
                        startActivity(i);
                        break;
                }
                return true;
            }
        });
    }
}
