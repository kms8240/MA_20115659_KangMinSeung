package com.example.subin.ma_20115659_kangminseung;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class wine_search extends AppCompatActivity {

    EditText edittext;
   // Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wine_search);

        edittext = (EditText)findViewById(R.id.search_text);
       // button = (Button)findViewById(R.id.search_button);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFF00BFFF));
    }

    public void onSearchButtonClicked(View v){
        String inPutText = edittext.getText().toString();

        Intent intent = new Intent(getApplicationContext(), wine_search_list.class);
        intent.putExtra("wine_name", inPutText);
        startActivity(intent);
    }

    public void onBackButtonClicked(View v){
        finish();
    }
}