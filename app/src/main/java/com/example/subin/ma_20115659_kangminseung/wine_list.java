package com.example.subin.ma_20115659_kangminseung;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class wine_list extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wine_list);

        listView = (ListView) this.findViewById(R.id.listView);
        SQLiteDatabase database;
        String wine_list_db = "wine_list.db";
        database = openOrCreateDatabase(wine_list_db, MODE_PRIVATE, null);

        ArrayList<String> items = new ArrayList<>();

        Cursor c1 = database.rawQuery("select * from customer_wine_list", null);

        while (c1.moveToNext()) {

            String str = "";
            str += "이름 : " + c1.getString(0) + "\n맛 : " + c1.getString(1);

            items.add(str);
            CustomAdapter adapter = new CustomAdapter(this, 0, items);
            listView.setAdapter(adapter);
        }
    }
    private class CustomAdapter extends ArrayAdapter<String>{
        private ArrayList<String> items;

        public CustomAdapter(Context context, int textViewResourceId, ArrayList<String> objects){
            super(context, textViewResourceId, objects);
            this.items = objects;
        }

        public View getView(int position, View convertView, ViewGroup patent){
            View v = convertView;
            if(v==null){
                LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = vi.inflate(R.layout.listview_item, null);
            }

            TextView textView = (TextView)v.findViewById(R.id.textView);

            textView.setText(items.get(position));

            return v;
        }
    }


}