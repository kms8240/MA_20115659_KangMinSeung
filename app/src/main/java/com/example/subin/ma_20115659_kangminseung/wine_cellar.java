package com.example.subin.ma_20115659_kangminseung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class wine_cellar extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wine_cellar);

    }

    public void onSaveButtonClicked(View v){

    }

    public void onListButtonClicked(View v){
        Intent intent = new Intent(getApplicationContext(), wine_list.class);
        startActivity(intent);
    }





}