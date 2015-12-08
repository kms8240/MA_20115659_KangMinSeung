package com.example.subin.ma_20115659_kangminseung;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class wine_save extends AppCompatActivity {

    EditText edittext1;
    EditText edittext2;

    //Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wine_save);

        edittext1 = (EditText)findViewById(R.id.editText1);
        edittext2 = (EditText)findViewById(R.id.editText2);
        //button = (Button)findViewById(R.id.button7);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFF00BFFF));
    }

    public void onButton7Clicked(View v){
        String inPutText1 = edittext1.getText().toString();

        String inPutText2 = edittext2.getText().toString();

        SQLiteDatabase database;
        String wine_list_db = "wine_list.db";
        database = openOrCreateDatabase(wine_list_db, MODE_PRIVATE, null);

        database.execSQL("insert into customer_wine_list (name, taste, separator) values " +
                "('" + inPutText1 +"','"+ inPutText2 + "','kms' );");
        Toast.makeText(getApplicationContext(), "저장되었습니다.", Toast.LENGTH_LONG).show();
    }

    public void onBackButtonClicked(View v){
        Toast.makeText(getApplicationContext(),"back",Toast.LENGTH_LONG).show();
        finish();
    }
}