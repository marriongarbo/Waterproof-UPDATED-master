package com.deluvio.garbo.waterproof;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // getSupportActionBar().hide();
        setContentView(R.layout.activity_tips);
        Intent i = new Intent(this, CustomService.class);
        startService(i);


    }
    public void process (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.evacuation) {
            i = new Intent(this, Evacuation.class);
            startActivity(i);}
        else if (v.getId() == R.id.emergencyhotline){
            i = new Intent(this, EmergencyHotline.class);
            startActivity(i);

        }  else if (v.getId() == R.id.home) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
    }
}


