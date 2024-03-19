package com.example.mdt;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class sensors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensors);

        // Find views
        TextView sensorsInfoTextView = findViewById(R.id.SensorsInfoAppBar);

        // Set text for sensors info
        String sensorsInfo = "Sensors Used: Fingerprint (under display, optical), accelerometer, gyro, proximity, compass";
        sensorsInfoTextView.setText(sensorsInfo);
    }
}
