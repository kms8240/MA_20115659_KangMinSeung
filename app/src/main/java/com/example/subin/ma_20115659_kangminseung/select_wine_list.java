package com.example.subin.ma_20115659_kangminseung;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

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
        String wine_list_db = "wine_list.db";
        database = openOrCreateDatabase(wine_list_db, MODE_PRIVATE, null);


       //Cursor c1 = database.rawQuery("select * from wine_list", null);

       // while(c1.moveToNext()) {
         //   str += c1.getString(3);
      //  }

        database.execSQL("create table if not exists wine_list" + "("
                + "wine integer,"
                + "dry integer,"
                + "light integer,"
                + "name text,"
                + "color text,"
                + "smell text,"
                + "taste text);");

        Cursor c1 = database.rawQuery("select * from wine_list", null);
        String str = "";
        while(c1.moveToNext()) {
              str += c1.getString(3);
             }

        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_LONG).show();


        if(str.equals("")) {
            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste) values " +
                    "(10,0,1,'샤또 망비엘 화이트','빛나는 밝은 노란색','농축되고 복합적인 과일 아로마가 꽃 향기와 어우러짐'," +
                    "'약간의 산도와 끝까지 지속되는 아로마와 미네딸이 입안에서 여운을 남김');");


        }



    }






}