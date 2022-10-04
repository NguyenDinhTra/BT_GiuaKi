package com.example.thutonghop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Frofile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frofile);
        Button btnBack= (Button)
                findViewById(R.id.buttonBack);
        btnBack.setOnClickListener(new
                                           View.OnClickListener() {
                                               public void onClick(View v) {
                                                   finish();
                                               }
                                           });
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_profile, menu);
        return true;
    }
}