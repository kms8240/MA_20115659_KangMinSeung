package com.example.subin.ma_20115659_kangminseung;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class red_wine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.red_wine);
    }

    public void onBackButtonClicked(View v){
        Toast.makeText(getApplicationContext(),"back",Toast.LENGTH_LONG).show();
        finish();
    }
}