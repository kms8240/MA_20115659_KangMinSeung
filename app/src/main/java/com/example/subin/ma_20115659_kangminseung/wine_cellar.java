package com.example.subin.ma_20115659_kangminseung;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class wine_cellar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wine_cellar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFF00BFFF));
    }

    public void onSaveButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), wine_save.class);
        startActivity(intent);
    }

    public void onListButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), wine_list.class);
        startActivity(intent);
    }





}