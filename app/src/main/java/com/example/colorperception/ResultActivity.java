package com.example.colorperception;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener {
    ArrayList<String> arrayCorrect = new ArrayList<>();
    String s = "Your Score is:";
    String sel = "Selected order is: ";
    String cor = "Correct order is: ";
    ArrayList<String> arraySelect = new ArrayList<>();
    Button btShare;
    TextView tvTest;
    TextView tvSel1,tvSel2,tvSel3,tvSel4,tvSel5,tvSel6,tvSel7,tvSel8,tvSel9,tvSel10,tvSel11,tvSel12,tvSel13,tvSel14,tvSel15,tvSel16,tvSel17,tvSel18,tvSel19,tvSel20,tvSel21,tvSel22,tvSel23,tvSel24,tvSel25,tvSel26,tvSel27,tvSel28,tvSel29,tvSel30,tvSel31,tvSel32,tvSel33,tvSel34,tvSel35,tvSel36,tvSel37,tvSel38,tvSel39,tvSel40;
    TextView tvCor1,tvCor2,tvCor3,tvCor4,tvCor5,tvCor6,tvCor7,tvCor8,tvCor9,tvCor10,tvCor11,tvCor12,tvCor13,tvCor14,tvCor15,tvCor16,tvCor17,tvCor18,tvCor19,tvCor20,tvCor21,tvCor22,tvCor23,tvCor24,tvCor25,tvCor26,tvCor27,tvCor28,tvCor29,tvCor30,tvCor31,tvCor32,tvCor33,tvCor34,tvCor35,tvCor36,tvCor37,tvCor38,tvCor39,tvCor40;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        btShare = findViewById(R.id.btShare);
        btShare.setOnClickListener(this);
        tvTest = findViewById(R.id.tvTest);
        tvSel1 = findViewById(R.id.tvSel1);
        tvSel2 = findViewById(R.id.tvSel2);
        tvSel3 = findViewById(R.id.tvSel3);
        tvSel4 = findViewById(R.id.tvSel4);
        tvSel5 = findViewById(R.id.tvSel5);
        tvSel6 = findViewById(R.id.tvSel6);
        tvSel7 = findViewById(R.id.tvSel7);
        tvSel8 = findViewById(R.id.tvSel8);
        tvSel9 = findViewById(R.id.tvSel9);
        tvSel10 = findViewById(R.id.tvSel10);
        tvSel11 = findViewById(R.id.tvSel11);
        tvSel12 = findViewById(R.id.tvSel12);
        tvSel13 = findViewById(R.id.tvSel13);
        tvSel14 = findViewById(R.id.tvSel14);
        tvSel15 = findViewById(R.id.tvSel15);
        tvSel16 = findViewById(R.id.tvSel16);
        tvSel17 = findViewById(R.id.tvSel17);
        tvSel18 = findViewById(R.id.tvSel18);
        tvSel19 = findViewById(R.id.tvSel19);
        tvSel20 = findViewById(R.id.tvSel20);
        tvSel21 = findViewById(R.id.tvSel21);
        tvSel22 = findViewById(R.id.tvSel22);
        tvSel23 = findViewById(R.id.tvSel23);
        tvSel24 = findViewById(R.id.tvSel24);
        tvSel25 = findViewById(R.id.tvSel25);
        tvSel26 = findViewById(R.id.tvSel26);
        tvSel27 = findViewById(R.id.tvSel27);
        tvSel28 = findViewById(R.id.tvSel28);
        tvSel29 = findViewById(R.id.tvSel29);
        tvSel30 = findViewById(R.id.tvSel30);
        tvSel31 = findViewById(R.id.tvSel31);
        tvSel32 = findViewById(R.id.tvSel32);
        tvSel33 = findViewById(R.id.tvSel33);
        tvSel34 = findViewById(R.id.tvSel34);
        tvSel35 = findViewById(R.id.tvSel35);
        tvSel36 = findViewById(R.id.tvSel36);
        tvSel37 = findViewById(R.id.tvSel37);
        tvSel38 = findViewById(R.id.tvSel38);
        tvSel39 = findViewById(R.id.tvSel39);
        tvSel40 = findViewById(R.id.tvSel40);
        tvCor1 = findViewById(R.id.tvCor1);
        tvCor2 = findViewById(R.id.tvCor2);
        tvCor3 = findViewById(R.id.tvCor3);
        tvCor4 = findViewById(R.id.tvCor4);
        tvCor5 = findViewById(R.id.tvCor5);
        tvCor6 = findViewById(R.id.tvCor6);
        tvCor7 = findViewById(R.id.tvCor7);
        tvCor8 = findViewById(R.id.tvCor8);
        tvCor9 = findViewById(R.id.tvCor9);
        tvCor10 = findViewById(R.id.tvCor10);
        tvCor11 = findViewById(R.id.tvCor11);
        tvCor12 = findViewById(R.id.tvCor12);
        tvCor13 = findViewById(R.id.tvCor13);
        tvCor14 = findViewById(R.id.tvCor14);
        tvCor15 = findViewById(R.id.tvCor15);
        tvCor16 = findViewById(R.id.tvCor16);
        tvCor17 = findViewById(R.id.tvCor17);
        tvCor18 = findViewById(R.id.tvCor18);
        tvCor19 = findViewById(R.id.tvCor19);
        tvCor20 = findViewById(R.id.tvCor20);
        tvCor21 = findViewById(R.id.tvCor21);
        tvCor22 = findViewById(R.id.tvCor22);
        tvCor23 = findViewById(R.id.tvCor23);
        tvCor24 = findViewById(R.id.tvCor24);
        tvCor25 = findViewById(R.id.tvCor25);
        tvCor26 = findViewById(R.id.tvCor26);
        tvCor27 = findViewById(R.id.tvCor27);
        tvCor28 = findViewById(R.id.tvCor28);
        tvCor29 = findViewById(R.id.tvCor29);
        tvCor30 = findViewById(R.id.tvCor30);
        tvCor31 = findViewById(R.id.tvCor31);
        tvCor32 = findViewById(R.id.tvCor32);
        tvCor33 = findViewById(R.id.tvCor33);
        tvCor34 = findViewById(R.id.tvCor34);
        tvCor35 = findViewById(R.id.tvCor35);
        tvCor36 = findViewById(R.id.tvCor36);
        tvCor37 = findViewById(R.id.tvCor37);
        tvCor38 = findViewById(R.id.tvCor38);
        tvCor39 = findViewById(R.id.tvCor39);
        tvCor40 = findViewById(R.id.tvCor40);


        arrayCorrect = (ArrayList<String>) getIntent().getExtras().get("correct");
        arraySelect = (ArrayList<String>) getIntent().getExtras().get("select");

        tvSel1.setText(arraySelect.get(0));
        tvSel2.setText(arraySelect.get(1));
        tvSel3.setText(arraySelect.get(2));
        tvSel4.setText(arraySelect.get(3));
        tvSel5.setText(arraySelect.get(4));
        tvSel6.setText(arraySelect.get(5));
        tvSel7.setText(arraySelect.get(6));
        tvSel8.setText(arraySelect.get(7));
        tvSel9.setText(arraySelect.get(8));
        tvSel10.setText(arraySelect.get(9));
        tvSel11.setText(arraySelect.get(10));
        tvSel12.setText(arraySelect.get(11));
        tvSel13.setText(arraySelect.get(12));
        tvSel14.setText(arraySelect.get(13));
        tvSel15.setText(arraySelect.get(14));
        tvSel16.setText(arraySelect.get(15));
        tvSel17.setText(arraySelect.get(16));
        tvSel18.setText(arraySelect.get(17));
        tvSel19.setText(arraySelect.get(18));
        tvSel20.setText(arraySelect.get(19));
        tvSel21.setText(arraySelect.get(20));
        tvSel22.setText(arraySelect.get(21));
        tvSel23.setText(arraySelect.get(22));
        tvSel24.setText(arraySelect.get(23));
        tvSel25.setText(arraySelect.get(24));
        tvSel26.setText(arraySelect.get(25));
        tvSel27.setText(arraySelect.get(26));
        tvSel28.setText(arraySelect.get(27));
        tvSel29.setText(arraySelect.get(28));
        tvSel30.setText(arraySelect.get(29));
        tvSel31.setText(arraySelect.get(30));
        tvSel32.setText(arraySelect.get(31));
        tvSel33.setText(arraySelect.get(32));
        tvSel34.setText(arraySelect.get(33));
        tvSel35.setText(arraySelect.get(34));
        tvSel36.setText(arraySelect.get(35));
        tvSel37.setText(arraySelect.get(36));
        tvSel38.setText(arraySelect.get(37));
        tvSel39.setText(arraySelect.get(38));
        tvSel40.setText(arraySelect.get(39));

        tvCor1.setText(arrayCorrect.get(0));
        tvCor2.setText(arrayCorrect.get(1));
        tvCor3.setText(arrayCorrect.get(2));
        tvCor4.setText(arrayCorrect.get(3));
        tvCor5.setText(arrayCorrect.get(4));
        tvCor6.setText(arrayCorrect.get(5));
        tvCor7.setText(arrayCorrect.get(6));
        tvCor8.setText(arrayCorrect.get(7));
        tvCor9.setText(arrayCorrect.get(8));
        tvCor10.setText(arrayCorrect.get(9));
        tvCor11.setText(arrayCorrect.get(10));
        tvCor12.setText(arrayCorrect.get(11));
        tvCor13.setText(arrayCorrect.get(12));
        tvCor14.setText(arrayCorrect.get(13));
        tvCor15.setText(arrayCorrect.get(14));
        tvCor16.setText(arrayCorrect.get(15));
        tvCor17.setText(arrayCorrect.get(16));
        tvCor18.setText(arrayCorrect.get(17));
        tvCor19.setText(arrayCorrect.get(18));
        tvCor20.setText(arrayCorrect.get(19));
        tvCor21.setText(arrayCorrect.get(20));
        tvCor22.setText(arrayCorrect.get(21));
        tvCor23.setText(arrayCorrect.get(22));
        tvCor24.setText(arrayCorrect.get(23));
        tvCor25.setText(arrayCorrect.get(24));
        tvCor26.setText(arrayCorrect.get(25));
        tvCor27.setText(arrayCorrect.get(26));
        tvCor28.setText(arrayCorrect.get(27));
        tvCor29.setText(arrayCorrect.get(28));
        tvCor30.setText(arrayCorrect.get(29));
        tvCor31.setText(arrayCorrect.get(30));
        tvCor32.setText(arrayCorrect.get(31));
        tvCor33.setText(arrayCorrect.get(32));
        tvCor34.setText(arrayCorrect.get(33));
        tvCor35.setText(arrayCorrect.get(34));
        tvCor36.setText(arrayCorrect.get(35));
        tvCor37.setText(arrayCorrect.get(36));
        tvCor38.setText(arrayCorrect.get(37));
        tvCor39.setText(arrayCorrect.get(38));
        tvCor40.setText(arrayCorrect.get(39));
        int cnt  = 0;
        sel += '\n';
        cor += '\n';
        for(int i = 0;i<40;i++){
            if(Objects.equals(arraySelect.get(i), arrayCorrect.get(i)))cnt++;
            sel += arraySelect.get(i);
            sel += '\n';
            cor += arrayCorrect.get(i);
            cor += '\n';
        }

        String a = Integer.toString(cnt);
        s += a;
        s +="/40";
        tvTest.setText(s);


    }

    @Override
    public void onClick(View view) {
        Intent sendIntent  = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        s += '\n';
        s += sel;
        s += '\n';
        s += cor;
        sendIntent.putExtra(Intent.EXTRA_TEXT,s);
        sendIntent.setType("text/plain");

        Intent shareIntent = Intent.createChooser(sendIntent,null);
        startActivity(shareIntent);
    }
}