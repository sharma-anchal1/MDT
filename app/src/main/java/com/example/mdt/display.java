package com.example.mdt;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        // Find views
        TextView displayInfoTextView = findViewById(R.id.DisplayInfoAppBar);
        TextView displayResolutionTextView = findViewById(R.id.DisplayInfoAppBar);
        TextView displayProtectionTextView = findViewById(R.id.DisplayInfoAppBar);

        // Set display info text
        String displayInfo = "AMOLED, 90Hz, 1300 nits (peak)";
        displayInfoTextView.setText(displayInfo);

        // Set display resolution text
        String displayResolution = "Resolution: 1080 x 2400 pixels, 20:9 ratio (~413 ppi density)";
        displayResolutionTextView.setText(displayResolution);

        // Set display protection text
        String displayProtection = "Protection: Schott Xensation glass";
        displayProtectionTextView.setText(displayProtection);
    }
}
