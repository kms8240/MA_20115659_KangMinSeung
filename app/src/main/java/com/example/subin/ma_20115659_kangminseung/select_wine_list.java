package com.example.subin.ma_20115659_kangminseung;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class select_wine_list extends AppCompatActivity {

    int dry;
    int light;
    int wine;
    ListView listView;

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

        database.execSQL("create table if not exists wine_list" + "("
                + "wine integer,"
                + "dry integer,"
                + "light integer,"
                + "name text,"
                + "color text,"
                + "smell text,"
                + "taste text,"
                + "separator text);");

        Cursor c1 = database.rawQuery("select * from wine_list", null);
        String str = "";
        while(c1.moveToNext()) {
              str += c1.getString(3);
             }

        c1.close();


        if(str.equals("")) {
            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,1,'샤또 망비엘 화이트','빛나는 밝은 노란색','농축되고 복합적인 과일 아로마가 꽃 향기와 어우러짐'," +
                    "'약간의 산도와 끝까지 지속되는 아로마와 미네딸이 입안에서 여운을 남김','a');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(0,0,1,'샤또 오 쏘시옹도','아름다운 루비 색','붉은 과일의 아로마가 강렬한 풍미를 선사함'," +
                    "'탄력적이며 균형 잡힌 구조감이 느껴짐','b');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(0,0,2,'샤또 라 크루아 보넬','아름다운 루비 색','붉은 과일의 풍부한 아로마가 특징임'," +
                    "'입안 가득 느껴지는 풍부한 풍미와 완벽한 바디감을 느낄 수 있음','c');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(0,0,2,'샤또 마스까르','짙은 루비 색','레드베리와 라즈베리 풍미와 진한 오크향을 느낄수 있음'," +
                    "'뛰어난 구조감. 벨벳과 같은 부드러운 여운과 피니시가 느껴짐','d');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(0,0,2,'샤또 드 프랑 - 레 쓰리지에르','짙은 루비 색','블랙커런트와 블랙베리의 아로마가 풍부함'," +
                    "'입안에서 조화롭게 퍼지는 알코올감과 적당한 타닌을 지닌 미디움 바디의 와인','e');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(0,0,1,'샤또 페레 - 슈브레이유','짙은 루비 색','붉은 과일, 특히 레드 체리의 풍부한 풍미'," +
                    "'붉은 과일의 풍미가 스파이시함으로 중화되었다가, 유혹적인 오크의 향미로 인해 부드러운 피니시감으로 마무리됨','f');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(0,0,1,'샤또 트리아농','석류 빛이 도는 짙은 루비색','신선한 레드 베리의 향이 느껴지며 시간이 지남에 따라 더 짙고 농익은 과일 향으로 발전함. 후반부에 느껴지는 스파이시한 아로마와 박하 향이 복합 미를 더해 줌'," +
                    "'가벼준 타닌감과 부드럽고 풍부한 과일 풍미가 잘 어리어짐. 단단한 느낌의 구조 감에 스파이시향이 어우러짐','g');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,2,1,'라 칼로프 그로 망상','강렬한 황금빛 컬러','파인애블, 머스크, 망고, 배, 황도의 강렬하고 풍부한 아로마'," +
                    "'늦게 수확한 포도로 만든 와인으로 달콤함이 특징. 강렬한 열대과일 풍미가 느껴지며, 상쾌한 산미가 매력적. 균형 잡힌 조화감과 오래 지속되는 피니시','h');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,1,'라 칼로프 소비뇽 블랑','옅은 은빛과 황금빛이 감도는 밝은 볏짚 빛','섬세한 꽃과 스파이시한 향이 올라오며, 신선한 시트로스와 자몽향이 이어짐'," +
                    "'신선하고 프루티한 풍미가 톡 쏘는 탄산과 어우러짐. 강렬한 시트러스와 이국적 과일의 풍미가 오래 지속됨','i');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,1,'라 칼로프 샤르도네','연한 황색 빛을 띤 진한 노랑','흰 꽃, 아카시아, 배의 신선한 아로마와 달콤한 아몬드 향'," +
                    "'밸런스가 좋고, 신선하고 매끄러우며, 살짝 꿀과 레몬을 곁들인 버터 맛이 감도는 와인으로 식전주로도 괜찮으며, 약한 조개류나 소스와 함께한 생선요리 그리고 흰 살 육류와 잘 어울림','j');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,1,1,'라 칼로프 로제','연한 핑크색','붉은 과일류의 아로마와 딸기, 라즈베리 향'," +
                    "'오래 지속되는 피니시. 신선하고 과실향이 풍부한 와인으로 식전주로도 괜찮으며 타파스 샐러드 그리고 그릴 요리한 흰 살 육류와 잘 어울림','k');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,1,1,'라 칼로프 스파클링 블랑 드 블랑','옅은 금빛이 도는 밝은 볏집 컬러. 섬세하고 가벼운 버블','패션프루트, 시트러스와 자몽 등 강렬하고 뛰어난 이국적 과일 향이 풍부함'," +
                    "'신선하고 화려한 풍미와 달콤함이 신맛과 균형 있게 어우러져 오래 지속되는 피니시로 이어짐','l');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,1,'샤블리','녹색 계열의 볏집 색','레몬, 복숭아, 살구'," +
                    "'혀를 감싸는 밸런스가 뛰어나며, 미네랄이 살아있는 샤블리의 전형성을 보여주는 와인임. 조개류, 생선, 연어, 참치 그리고 고트 치즈와 잘 어울림','m');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,1,'샤블리 비에유-빈뉴','연한 금색','레몬 등의 시트러스 향과 달콤한 아카시아 꽃 향기가 조화를 이룸'," +
                    "'우아하고 신선함이 조화를 이루는 밸런스 좋은 와인임. 식욕을 돋구는 아니스의 향을 가진 와인이며 버섯파이, 조개류, 생선 요리, 고트 치즈 그리고 푸아그라와 잘 어울림','n');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,1,'샤블리 프르미에르 크뤼 보-드-베이','연한 금색','미네랄과 섬세한 아니스, 감귤류의 향이 조화를 이룸'," +
                    "'입 속에서 아주 오랫동안 지속되는 미네랄과 우아하고 직관적인 와인으로 조개류가 고트 치즈를 곁들인 샐러드와 잘 어울림','o');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,2,'샤블리 프르미에르 크뤼 블로랑','녹색 빛이 감도는 금색','감귤류의 향과 미네랄 느낌의 바다 향'," +
                    "'우아한 구조감을 가지고 있으며 랍스터 같은 해산물과 크림 소스를 곁들인 흰살 육류와 잘 어울림','p');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,2,'샤블리 그랑 크뤼 레 끌로','녹색 빛이 감도는 선명한 금색','레몬 향'," +
                    "'강한 미네랄 그리고 섬세함을 갖춘 그랑크뤼 와인으로 스시나 참치 카르파쵸와 잘 어울림','q');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,1,'샤를로팽 부르고뉴 샤르도네','황금빛이 도는 노란색','꿀과 아카시아 풍미가 약간의 스파이시한 나무 향과 어우러짐'," +
                    "'입안 가득 느껴지는 엘레강스한 느낌의 긴 여운이 훌륭한 와인','r');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(0,0,1,'샤를로팽 부르고뉴 피노 누아','깊고 강렬한 루비색','체리 등의 붉은 과일의 아로마'," +
                    "'붉은 과일의 풍미가 실키한 나무 향과 균형 있게 어우러지며 긴 여운이 느껴짐','s');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,1,'부르고뉴 블랑','녹색을 띈 황금색','미네랄, 상큼한 감귤향'," +
                    "'매끄러운 느낌의 감귤향과 나무향이 풍부하고 섬세한 맛이 입안 가득 느껴지는 와인으로 식전주나 갓 잡아올린 해산물, 그리고 크림소스를 곁들인 닭고기 요리와 잘 어울림','t');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,1,'푸이-퓌쎄 비에유 빈뉴','선명하고 연한 금색','매우 풍부한 과일향을 지니고 있으며, 바닐라 향이 은은하게 전해짐'," +
                    "'강한 미네랄과 매끄러운 느낌을 가진 와인으로 구조감이 잘 짜인 와인이며 푸아그라. 바닷가재, 농어 등의 해산물과 크림소스를 입힌 닭고기 요리와도 잘 어울림','u');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,1,1,'쁘띠 리모레스끄 로제','연한 핑크색','신선한 복숭아, 멜론, 딸기 향'," +
                    "'전체적으로 우아한 느낌을 주며, 살짝 달콤함이 피니시를 장식하는 와인으로 언제 어디서나 식사 테이블이 올려 놓을 수 있는 와인','v');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,1,1,'리모레스끄 크뤼 클라쎄 로제','연어 살색 같은 고급스러운 핑크색','풍부한 꽃향, 특히 장미꽃 잎 향과 섬세한 감초, 레몬, 배 등 잘익은 과일, 그리고 머랭과 같은 살짝 달콤한 향까지 느낄 수 있는 와인'," +
                    "'풍성한 과일 향이 입안을 가득 채우며 향신료 느낌의 끝 맛이 특징임. 뛰어난 구조감을 바탕으로 오래 지속되는 피니시와 잘 다듬어진 균형 잡힌 맛의 와인. 바닷가재와 같은 갑각류의 요리. 해산물 샐러드와 잘 어울림','w');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(0,0,2,'리모레스끄 크뤼 클라쎄 루즈','진한 붉은 자주색','잘 익은 과일과 향신료 그리고 지중해 지역의 석회질토양의 미네랄 향과 뒤로 갈수록 점점 더 풍성한 과일 향 나타남'," +
                    "'부드럽고 균형이 잘 잡혀 있는 와인이며 잘 익은 과일의 맛과 입안에서 오래 지속되는 피니시가 인상적인 와인임. 붉은 육류나 바비큐, 그릴 요리와 함께 하면 좋은 와인임.','x');");

            database.execSQL("insert into wine_list (wine, dry, light, name, color, smell, taste, separator) values " +
                    "(1,0,2,'상세르 블랑 라 그라브리에르','밝고 투명하고 연한 초록 띠를 두른 금색','진한 꽃향과 과실 향이 아주 풍부함'," +
                    "'우아하고 밸런스가 뛰어나며 신선한 느낌의 와인으로 해산물, 조개류 그리고 고트 치즈와 잘 어울림','y');");
        }


        listView = (ListView)this.findViewById(R.id.listView2);

        ArrayList<String> items = new ArrayList<>();
        ArrayList<String> items2 = new ArrayList<>();

        c1 = database.rawQuery("select * from wine_list", null);

        while(c1.moveToNext()) {

            if(wine == 2) {
                str = "";
                str += "이름 : " + c1.getString(3) + "\n색 : " + c1.getString(4) + "\n향 : " + c1.getString(5) + "\n맛 : " + c1.getString(6);

                items.add(str);

                str = "";
                str += c1.getString(7);

                items2.add(str);
            }
            else if(wine == c1.getInt(0) && dry == c1.getInt(1) && light == c1.getInt(2)) {

                str = "";
                str += "이름 : " + c1.getString(3) + "\n색 : " + c1.getString(4) + "\n향 : " + c1.getString(5) + "\n맛 : " + c1.getString(6);

                items.add(str);

                str = "";
                str += c1.getString(7);

                items2.add(str);
            }

        }

        c1.close();

        CustomAdapter adapter = new CustomAdapter(this, 0, items, items2);
        listView.setAdapter(adapter);

    }

    private class CustomAdapter extends ArrayAdapter<String> {
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
                v = vi.inflate(R.layout.listview_item2, null);
            }

            ImageView imageView = (ImageView)v.findViewById(R.id.imageView2);


            TextView textView = (TextView)v.findViewById(R.id.text_name);
            textView.setText(items.get(position));

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

            return v;
        }
    }





}