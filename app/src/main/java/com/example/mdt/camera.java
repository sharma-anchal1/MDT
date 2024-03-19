package com.example.mdt;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class camera extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        // Find views
        TextView cameraInfoTextView = findViewById(R.id.CameraInfoAppBar);
        TextView cameraFeaturesTextView = findViewById(R.id.CameraInfoAppBar);
        TextView cameraVideoTextView = findViewById(R.id.CameraInfoAppBar);

        // Set camera info text
        String cameraInfo = "Dual: 64 MP, (wide), 1/1.97, 0.7µm, PDAF, OIS\n2 MP, f/2.4, (depth)";
        cameraInfoTextView.setText(cameraInfo);

        // Set camera features text
        String cameraFeatures = "Features: LED flash, HDR, panorama";
        cameraFeaturesTextView.setText(cameraFeatures);

        // Set camera video text
        String cameraVideo = "Video: 1080p@30fps";
        cameraVideoTextView.setText(cameraVideo);
    }
}
