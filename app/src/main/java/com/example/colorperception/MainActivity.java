package com.example.colorperception;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioGroup radioGroup;
    LinearLayout ll;
    Button btNext;
    Integer i = 0;
    ArrayList<String> arrayCorrect = new ArrayList<>();
    ArrayList<String> arraySelect = new ArrayList<>();
    ArrayList<String> op1 = new ArrayList<>();
    ArrayList<String> op2 = new ArrayList<>();
    ArrayList<String> op3 = new ArrayList<>();
    ArrayList<String> op4 = new ArrayList<>();
    ArrayList<Integer> colist = new ArrayList<>();
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ll = findViewById(R.id.ll);
        radioGroup = findViewById(R.id.radioGroup);
        radioButton1 = findViewById(R.id.radio1);
        radioButton2 = findViewById(R.id.radio2);
        radioButton3 = findViewById(R.id.radio3);
        radioButton4 = findViewById(R.id.radio4);
        btNext = findViewById(R.id.btNext);
        btNext.setOnClickListener(this);


        for(int j = 0;j<5;j++){
            arrayCorrect.add("Red");
            arrayCorrect.add("Black");
            arrayCorrect.add("White");
            arrayCorrect.add("Green");
            arrayCorrect.add("Blue");
            arrayCorrect.add("Brown");
            arrayCorrect.add("Pink");
            arrayCorrect.add("Grey");
        }

            op1.add("Red");op2.add("Pink");op3.add("Blue");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");
            op1.add("Grey");op2.add("Yellow");op3.add("White");op4.add("Green");
            op1.add("Green");op2.add("Yellow");op3.add("Blue");op4.add("Grey");
            op1.add("Blue");op2.add("Brown");op3.add("Green");op4.add("Black");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");
            op1.add("Red");op2.add("Pink");op3.add("Blue");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");

            op1.add("Pink");op2.add("Red");op3.add("Blue");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Black");op4.add("Grey");
            op1.add("Grey");op2.add("Yellow");op3.add("Green");op4.add("White");
            op1.add("Green");op2.add("Yellow");op3.add("Blue");op4.add("Grey");
            op1.add("Blue");op2.add("Brown");op3.add("Black");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");
            op1.add("Pink");op2.add("Red");op3.add("Blue");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");

            op1.add("Blue");op2.add("Pink");op3.add("Red");op4.add("Green");
            op1.add("Black");op2.add("Brown");op3.add("Blue");op4.add("Grey");
            op1.add("Grey");op2.add("Yellow");op3.add("White");op4.add("Green");
            op1.add("Green");op2.add("Yellow");op3.add("Blue");op4.add("Grey");
            op1.add("Blue");op2.add("Brown");op3.add("Black");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");
            op1.add("Blue");op2.add("Pink");op3.add("Red");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");

            op1.add("Green");op2.add("Pink");op3.add("Blue");op4.add("Red");
            op1.add("Blue");op2.add("Black");op3.add("Brown");op4.add("Grey");
            op1.add("White");op2.add("Yellow");op3.add("Grey");op4.add("Green");
            op1.add("Green");op2.add("Yellow");op3.add("Blue");op4.add("Grey");
            op1.add("Blue");op2.add("Black");op3.add("Brown");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");
            op1.add("Green");op2.add("Pink");op3.add("Blue");op4.add("Red");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");

            op1.add("Red");op2.add("Pink");op3.add("Blue");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");
            op1.add("Grey");op2.add("Yellow");op3.add("White");op4.add("Green");
            op1.add("Yellow");op2.add("Green");op3.add("Blue");op4.add("Grey");
            op1.add("Blue");op2.add("Brown");op3.add("Green");op4.add("Black");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");
            op1.add("Red");op2.add("Pink");op3.add("Blue");op4.add("Green");
            op1.add("Blue");op2.add("Brown");op3.add("Grey");op4.add("Black");

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            colist.add((Color.parseColor("#FF0800")));
            colist.add((Color.parseColor("#000000")));
            colist.add((Color.parseColor("#FFFFFF")));
            colist.add((Color.parseColor("#66FF00")));
            colist.add((Color.parseColor("#007FFF")));
            colist.add((Color.parseColor("#A0785A")));
            colist.add((Color.parseColor("#FF00FF")));
            colist.add((Color.parseColor("#BEBFC5")));

            colist.add((Color.parseColor("#FF080F")));
            colist.add((Color.parseColor("#00000F")));
            colist.add((Color.parseColor("#FFFFDF")));
            colist.add((Color.parseColor("#66FF0F")));
            colist.add((Color.parseColor("#007FF0")));
            colist.add((Color.parseColor("#A07855")));
            colist.add((Color.parseColor("#FF00F0")));
            colist.add((Color.parseColor("#BEBFCA")));

            colist.add((Color.parseColor("#FF0820")));
            colist.add((Color.parseColor("#000020")));
            colist.add((Color.parseColor("#FFFFBF")));
            colist.add((Color.parseColor("#66FF20")));
            colist.add((Color.parseColor("#007FDF")));
            colist.add((Color.parseColor("#A0787A")));
            colist.add((Color.parseColor("#FF00DF")));
            colist.add((Color.parseColor("#BEBFA5")));

            colist.add((Color.parseColor("#FF0840")));
            colist.add((Color.parseColor("#000040")));
            colist.add((Color.parseColor("#FFFF9F")));
            colist.add((Color.parseColor("#66FF40")));
            colist.add((Color.parseColor("#007FBF")));
            colist.add((Color.parseColor("#A0789A")));
            colist.add((Color.parseColor("#FF00BF")));
            colist.add((Color.parseColor("#BEBF85")));

            colist.add((Color.parseColor("#FF0860")));
            colist.add((Color.parseColor("#000060")));
            colist.add((Color.parseColor("#FFFFFF")));
            colist.add((Color.parseColor("#66FF60")));
            colist.add((Color.parseColor("#007F9F")));
            colist.add((Color.parseColor("#A078BA")));
            colist.add((Color.parseColor("#FF009F")));
            colist.add((Color.parseColor("#BEBF65")));
        }
        radioButton1.setText(op1.get(0));
        radioButton2.setText(op2.get(0));
        radioButton3.setText(op3.get(0));
        radioButton4.setText(op4.get(0));
        ll.setBackgroundColor(colist.get(0));

    }

    @Override
    public void onClick(View view) {
        i++;
        int a = radioGroup.getCheckedRadioButtonId();
        RadioButton rb = findViewById(a);
        arraySelect.add(rb.getText().toString());
        if(i==40){
            Intent intent = new Intent(MainActivity.this,ResultActivity.class);
            intent.putExtra("correct",arrayCorrect);
            intent.putExtra("select",arraySelect);
            startActivity(intent);
            finish();
        }else{
            radioButton1.setText(op1.get(i));
            radioButton2.setText(op2.get(i));
            radioButton3.setText(op3.get(i));
            radioButton4.setText(op4.get(i));
            ll.setBackgroundColor(colist.get(i));

        }
    }
}

//The 10 colors (FFFFFF = 16777215), 7FFFD4
//1. Red : FF0800,16713728 , FF080F,FF0820,FF0840,FF0860 (Red,Pink,Blue,Green)
//2. Black : 000000,0(FFFFFF,16777215) ,00000F,000020,000040,000060 (black,grey,blue,brown)
//3. White : FFFFFF, FFFFF0,FFFFDF,FFFFBF,FFFF9F (White,Yellow,Grey,Green)
//4. Green : 66FF00, 66FF0F,66FF20,66FF40,66FF60 (Yellow,Green,Blue,Grey)
//5. Blue : 007FFF, 007FFF,007FFF,007FFF,007FFF (Blue,Black,Brown,Green)
//6. Brown : A0785A, A07855,A0787A,A0789A,A078BA (Brown,Black,Blue,Grey)
//7. Pink : FF00FF, FF00F0,FF00DF,FF00BF,FF009F (Pink,Red,Green,Orange)
//8. Grey : BEBFC5, BEBFCA,BEBFA5,BEBF85,BEBF65 (Grey,Blue,Brown,Black)