package com.example.mdt;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MobileInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobileinfo);

        // Find views
        TextView cardSlotTextView = findViewById(R.id.MobileInfoAppBar);
        TextView internalTextView = findViewById(R.id.MobileInfoAppBar);
        TextView bodyDimensionsTextView = findViewById(R.id.MobileInfoAppBar);
        TextView simTextView = findViewById(R.id.MobileInfoAppBar);

        // Set text for card slot
        String cardSlotInfo = "Card Slot: microSDXC (uses shared SIM slot)";
        cardSlotTextView.setText(cardSlotInfo);

        // Set text for internal storage
        String internalInfo = "Internal: 128GB 6GB RAM, 128GB 8GB RAM UFS 2.2";
        internalTextView.setText(internalInfo);

        // Set text for body dimensions
        String bodyDimensionsInfo = "Body Dimensions: 158.9 x 73.5 x 7.8 mm (6.26 x 2.89 x 0.31 in)";
        bodyDimensionsTextView.setText(bodyDimensionsInfo);

        // Set text for SIM details
        String simInfo = "Sim: Hybrid Dual SIM (Nano-SIM, dual stand-by) IP54, dust and splash resistant";
        simTextView.setText(simInfo);
    }
}
