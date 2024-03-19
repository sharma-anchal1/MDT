package com.example.mdt;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.os.Bundle;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mobileInfoButton = findViewById(R.id.button);
        Button networkButton = findViewById(R.id.button);
        Button displayButton = findViewById(R.id.button);
        Button sensorButton = findViewById(R.id.button);
        Button cameraButton = findViewById(R.id.button);
        Button batteryInfoButton = findViewById(R.id.button);

        mobileInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, MobileInfo.class);
                startActivity(intent);
            }
        });

        networkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, networkSignals.class);
                startActivity(intent);
            }
        });

        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, display.class);
                startActivity(intent);
            }
        });

        sensorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, sensors.class);
                startActivity(intent);
            }
        });

        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, camera.class);
                startActivity(intent);
            }
        });

        batteryInfoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Homepage.this, battery.class);
                startActivity(intent);
            }
        });
    }
}

