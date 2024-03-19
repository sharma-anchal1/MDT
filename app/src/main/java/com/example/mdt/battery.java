package com.example.mdt;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class battery extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battery);

        // Find views
        TextView batteryCapacityTextView = findViewById(R.id.BatteryInfoAppBar);
        TextView chargingInfoTextView = findViewById(R.id.BatteryInfoAppBar);

        // Set battery capacity text
        batteryCapacityTextView.setText("4500 mAh, non-removable");

        // Set charging info text
        String chargingInfo = "Charging: 44W wired, 1-50% in 24 min (advertised)\nWireless (Qi)";
        chargingInfoTextView.setText(chargingInfo);
    }
}
