package com.example.subin.ma_20115659_kangminseung;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class select_wine_list extends AppCompatActivity {

    int dry;
    int light;
    int wine;
    TextView textview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_wine_list);

        Intent intent = getIntent();
        dry = intent.getExtras().getInt("dry");
        light = intent.getExtras().getInt("light");
        wine = intent.getExtras().getInt("wine");

        SQLiteDatabase database;
        String name = "wine_list.db";
        database = openOrCreateDatabase("/mnt/sdcard/" + name, MODE_PRIVATE, null);

    }




}