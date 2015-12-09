package com.example.subin.ma_20115659_kangminseung;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class select_wine extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinner;
    ArrayAdapter adapter;
    int result;

    Spinner spinner2;
    ArrayAdapter adapter2;
    int result2;

    int wine;
    Intent intent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.select_wine);

       spinner = (Spinner)findViewById(R.id.dry_spinner);
        adapter = ArrayAdapter.createFromResource(this, R.array.wine_dry,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setSelection(1);
        spinner.setOnItemSelectedListener(this);

        spinner2 = (Spinner)findViewById(R.id.light_spinner);
        adapter2 = ArrayAdapter.createFromResource(this,R.array.wine_light,android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter2);
        spinner2.setSelection(1);
        spinner2.setOnItemSelectedListener(this);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFF00BFFF));

        intent = getIntent();

        wine = intent.getExtras().getInt("wine");
        if(wine == 1)
        {
            ImageView imageView = (ImageView)findViewById(R.id.imageView4);
            imageView.setImageResource(R.drawable.white_wine);
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3)
    {
        switch(arg0.getId())
        {
            case R.id.dry_spinner:
                Log.d("44444",""+arg2);
                result = arg2;
                break;

            case R.id.light_spinner:
                result2 = arg2;
            default : break;
        }
    }

    public void onNothingSelected(AdapterView<?> arg0)
    {
        Toast.makeText(this, "onNothingSelected() Called", Toast.LENGTH_SHORT).show();
    }

    public void onBackButtonClicked(View v){
        finish();
    }


    public void onNextButtonClicked(View v){
        wine = intent.getExtras().getInt("wine");

        intent = new Intent(select_wine.this, select_wine_list.class);
        intent.putExtra("dry",result);
        intent.putExtra("light",result2);
        intent.putExtra("wine",wine);
        startActivity(intent);
        finish();
    }
}