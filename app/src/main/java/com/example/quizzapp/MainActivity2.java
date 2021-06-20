package com.example.quizzapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.quizzapp.R;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    //Qiymatlarni elon qilyabman

    TextView savolSoni, savollar;

    //Card view da sacol clas da bossam ishlamadi shuning uchun textwiwni bosadon atjakman
    TextView textView1,textView2, textView3, textView4;


    CardView cardView1, cardView2, cardView3, cardView4;
    int a;

    // savollar uchun list

    ArrayList<SavollarClass> savolList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //id si bo'yicha qidirish

        savolSoni=findViewById(R.id.text_view);
        savollar=findViewById(R.id.text_view1);

        textView1=findViewById(R.id.text_a);
        textView2=findViewById(R.id.text_b);
        textView3=findViewById(R.id.text_c);
        textView4=findViewById(R.id.text_d);

        cardView1=findViewById(R.id.card_view1);
        cardView2=findViewById(R.id.card_view2);
        cardView3=findViewById(R.id.card_view3);
        cardView4=findViewById(R.id.card_view4);


        //savol qo'shish

        savolList.add(new SavollarClass("O'zbekistonning poytaxti qayer","Toshkent","Samarqand",
                "Urganch", "Xiva","Toshkent"));

        savolList.add(new SavollarClass("2+2=?","5","4",
                "7", "10","4"));

        savolList.add(new SavollarClass("2*3=?","2","3",
                "6", "22","6"));

        //init a
        a= 0;


        //
        savol(a);
    }

    public  void savol (int n){
        final SavollarClass savollarClass =savolList.get(n);

        // Savollar soni uchun
        savolSoni.setText((n+1) +"/"+savolList.size());

        //Savollar
        savollar.setText((n+1)+" ." + "" +savollarClass.getSav());
        textView1.setText("" + savollarClass.getJavob_a());
        textView2.setText("" + savollarClass.getJavob_b());
        textView3.setText("" + savollarClass.getJavob_c());
        textView4.setText("" + savollarClass.getJavon_d());

        //Javob a uchun
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView1.getText().equals(savollarClass.getTogriJavob())){

                    Toast.makeText(MainActivity2.this, "To'gri javob", Toast.LENGTH_SHORT).show();

                    if(a<(savolList.size()-1)){
                        a++;
                        savol(a);
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Xamma savollarga javob berildi", Toast.LENGTH_SHORT).show();
                    }



                }
                else {
                    Toast.makeText(MainActivity2.this, "Xato javob", Toast.LENGTH_SHORT).show();
                }


            }
        });

        //Javob b uchun
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView2.getText().equals(savollarClass.getTogriJavob())){
                    Toast.makeText(MainActivity2.this, "To'gri javob", Toast.LENGTH_SHORT).show();

                    if(a<(savolList.size()-1)){
                        a++;
                        savol(a);
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Xamma savollarga javob berildi", Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(MainActivity2.this, "Xato javob", Toast.LENGTH_SHORT).show();
                }


            }
        });

        //Javob c uchun
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView3.getText().equals(savollarClass.getTogriJavob())){
                    Toast.makeText(MainActivity2.this, "To'gri javob", Toast.LENGTH_SHORT).show();

                    if(a<(savolList.size()-1)){
                        a++;
                        savol(a);
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Xamma savollarga javob berildi", Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(MainActivity2.this, "Xato javob", Toast.LENGTH_SHORT).show();
                }


            }
        });

        //Javob d uchun
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView4.getText().equals(savollarClass.getTogriJavob())){
                    Toast.makeText(MainActivity2.this, "To'gri javob", Toast.LENGTH_SHORT).show();

                    if(a<(savolList.size()-1)){
                        a++;
                        savol(a);
                    }
                    else {
                        Toast.makeText(MainActivity2.this, "Xamma savollarga javob berildi", Toast.LENGTH_SHORT).show();
                    }

                }
                else {
                    Toast.makeText(MainActivity2.this, "Xato javob", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}