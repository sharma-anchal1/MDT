package com.example.mdt;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class networkSignals extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_networksignals);

        // Find views
        TextView technologyTextView = findViewById(R.id.NetworkInfoAppBar);
        TextView wlanTextView = findViewById(R.id.NetworkInfoAppBar);
        TextView bluetoothTextView = findViewById(R.id.NetworkInfoAppBar);
        TextView usbTextView = findViewById(R.id.NetworkInfoAppBar);
        TextView positioningTextView = findViewById(R.id.NetworkInfoAppBar);

        // Set text for technology
        String technologyInfo = "Technology: GSM / HSPA / LTE / 5G";
        technologyTextView.setText(technologyInfo);

        // Set text for WLAN
        String wlanInfo = "WLAN: Wi-Fi 802.11 a/b/g/n/ac, dual-band, Wi-Fi Direct";
        wlanTextView.setText(wlanInfo);

        // Set text for Bluetooth
        String bluetoothInfo = "Bluetooth: 5.1, A2DP, LE";
        bluetoothTextView.setText(bluetoothInfo);

        // Set text for USB
        String usbInfo = "USB: USB Type-C 2.0, OTG";
        usbTextView.setText(usbInfo);

        // Set text for Positioning
        String positioningInfo = "Positioning: GPS, GLONASS, GALILEO, BDS, QZSS";
        positioningTextView.setText(positioningInfo);
    }
}

