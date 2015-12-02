package com.example.subin.ma_20115659_kangminseung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class wine_cellar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wine_cellar);
    }

    public void onBackButtonClicked(View v){
        Toast.makeText(getApplicationContext(),"back",Toast.LENGTH_LONG).show();
        finish();
    }

    public void onWineSaveButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), wine_save.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "4", Toast.LENGTH_LONG).show();
    }
}