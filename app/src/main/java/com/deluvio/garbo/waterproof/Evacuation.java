package com.deluvio.garbo.waterproof;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Evacuation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evacuationcenter1);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
    }


    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.home) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        } else if (v.getId() == R.id.emergencyhotline) {
            i = new Intent(this, EmergencyHotline.class);
            startActivity(i);
        }   else if (v.getId() == R.id.tips){
            i = new Intent(this, Tips.class);
            startActivity(i);}
        else if (v.getId() == R.id.makatigm) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.563970 + "," + 121.055776));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        } else if (v.getId() == R.id.taguiggm) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.525519 + "," + 121.061551));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        } else if (v.getId() == R.id.paranquegm) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.470800 + "," + 121.022543));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        } else if (v.getId() == R.id.muntinlupagm) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.459207 + "," + 121.051963));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        } else if (v.getId() == R.id.pasiggm) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.578834 + "," + 121.066503));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        } else if (v.getId() == R.id.marikinagm) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.664841 + "," + 121.117867));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        } else if (v.getId() == R.id.manilagm) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.609814 + "," + 120.989834));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);
        } else if (v.getId() == R.id.quezongm) {
            i = new Intent(getIntent().ACTION_VIEW);
            i.setData(Uri.parse("http://maps.google.com/maps?q=loc:" + 14.655186 + "," + 121.067660));
            chooser = Intent.createChooser(i, "Choose A Map App");
            startActivity(chooser);


        }
    }
}
