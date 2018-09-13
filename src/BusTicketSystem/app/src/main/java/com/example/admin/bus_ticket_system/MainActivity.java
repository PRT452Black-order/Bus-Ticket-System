package com.example.admin.bus_ticket_system;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button buttonRoute2;
    Button buttonRoute3;
    Button buttonRoute4;
    Button buttonRoute9;
    Button buttonRoute12;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);

        // Locate the button in activity_main.xml
        buttonRoute2 = (Button) findViewById(R.id.route2);
        buttonRoute3 = (Button) findViewById(R.id.route3);
        buttonRoute4 = (Button) findViewById(R.id.route4);
        buttonRoute9 = (Button) findViewById(R.id.route9);
        buttonRoute12 = (Button) findViewById(R.id.route12);

        // Capture button clicks
        buttonRoute2.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        MapsActivity.class);
                startActivity(myIntent);
            }
        });
        buttonRoute3.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        MapsActivity.class);
                startActivity(myIntent);
            }
        });
        buttonRoute4.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        MapsActivity.class);
                startActivity(myIntent);
            }
        });
        buttonRoute9.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        MapsActivity.class);
                startActivity(myIntent);
            }
        });
        buttonRoute12.setOnClickListener(new OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(MainActivity.this,
                        MapsActivity.class);
                startActivity(myIntent);
            }
        });
    }

}
