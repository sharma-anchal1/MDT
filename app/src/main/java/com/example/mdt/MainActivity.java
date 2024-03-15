package com.example.mdt;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnMobile ,btnNetwork , btnDisplay , btnBattery , btnSensor ,btnCamera; // Add more buttons as needed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        // Reference buttons
        btnMobile = findViewById(R.id.button1);
        btnNetwork = findViewById(R.id.button2);
        btnDisplay = findViewById(R.id.button3);
        btnCamera = findViewById(R.id.button4);
        btnSensor = findViewById(R.id.button5);
        btnBattery = findViewById(R.id.button6);

        btnMobile.setOnClickListener(this);
        btnNetwork.setOnClickListener(this);
        btnBattery.setOnClickListener(this);
        btnDisplay.setOnClickListener(this);
        btnSensor.setOnClickListener(this);
        btnCamera.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.button1) {
            Intent mobileIntent = new Intent(this, MobileInfo.class);
            startActivity(mobileIntent);
        } else if (view.getId() == R.id.button2) {
            Intent anotherIntent = new Intent(this, networkSignals.class);
            startActivity(anotherIntent);
        }else if (view.getId() == R.id.button3) {
            Intent anotherIntent = new Intent(this, display.class);
            startActivity(anotherIntent);
        }else if (view.getId() == R.id.button4) {
            Intent anotherIntent = new Intent(this, sensors.class);
            startActivity(anotherIntent);
        }else if (view.getId() == R.id.button5) {
            Intent anotherIntent = new Intent(this, camera.class);
            startActivity(anotherIntent);
        }else if (view.getId() == R.id.button6) {
            Intent anotherIntent = new Intent(this, battery.class);
            startActivity(anotherIntent);
        }
    }
}