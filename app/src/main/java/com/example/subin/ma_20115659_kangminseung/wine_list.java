package com.example.subin.ma_20115659_kangminseung;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class wine_list extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wine_list);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(new ColorDrawable(0xFF00BFFF));

        listView = (ListView) this.findViewById(R.id.listView);
        SQLiteDatabase database;
        String wine_list_db = "wine_list.db";
        database = openOrCreateDatabase(wine_list_db, MODE_PRIVATE, null);

        ArrayList<String> items = new ArrayList<>();
        ArrayList<String> items2 = new ArrayList<>();

        Cursor c1 = database.rawQuery("select * from customer_wine_list", null);

        while (c1.moveToNext()) {

            String str = "";
            str += "이름 : " + c1.getString(0) + "\n맛 : " + c1.getString(1);

            items.add(str);

            str = "";
            str += c1.getString(2);

            items2.add(str);
            
            CustomAdapter adapter = new CustomAdapter(this, 0, items, items2);
            listView.setAdapter(adapter);
        }
    }
    private class CustomAdapter extends ArrayAdapter<String>{
        private ArrayList<String> items;
        private ArrayList<String> items2;

        public CustomAdapter(Context context, int textViewResourceId, ArrayList<String> objects, ArrayList<String> objects2){
            super(context, textViewResourceId, objects);
            this.items = objects;
            this.items2 = objects2;
        }

        public View getView(int position, View convertView, ViewGroup patent){
            View v = convertView;
            if(v==null){
                LayoutInflater vi = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                v = vi.inflate(R.layout.listview_item, null);
            }

            TextView textView = (TextView)v.findViewById(R.id.textView);

            textView.setText(items.get(position));

            ImageView imageView = (ImageView)v.findViewById(R.id.imageView);


            if("a".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.a);

            if("b".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.b);

            if("c".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.c);

            if("d".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.d);

            if("e".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.e);

            if("f".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.f);

            if("g".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.g);

            if("h".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.h);

            if("i".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.i);

            if("j".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.j);

            if("k".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.k);

            if("l".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.l);

            if("m".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.m);

            if("n".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.n);

            if("o".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.o);

            if("p".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.p);

            if("q".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.q);

            if("r".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.r);

            if("s".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.s);

            if("t".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.t);

            if("u".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.u);

            if("v".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.v);

            if("w".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.w);

            if("x".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.x);

            if("y".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.y);

            if("z".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.z);

            if("kms".equals(items2.get(position)))
                imageView.setImageResource(R.drawable.wine);




            return v;
        }
    }


}