package com.example.subin.ma_20115659_kangminseung;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int wine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void onButton1Clicked(View v){
        wine = 0;
        Intent intent = new Intent(getApplicationContext(), select_wine.class);
        intent.putExtra("wine", wine);
        startActivity(intent);
    }

    public void onButton2Clicked(View v){
        wine = 1;
        Intent intent = new Intent(getApplicationContext(), select_wine.class);
        intent.putExtra("wine",wine);
        startActivity(intent);
    }

    public void onButton6Clicked(View v){
        wine = 2;
        Intent intent = new Intent(getApplicationContext(), select_wine_list.class);
        intent.putExtra("wine",wine);
        startActivity(intent);
    }


    public void onButton3Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), wine_cellar.class);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_LONG).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
