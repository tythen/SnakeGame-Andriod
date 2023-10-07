package com.tythen.tysnake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {
    private TextView tv_score = null;
    private Button btn_del = null;
    private int total = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        tv_score = findViewById(R.id.tv_score);
        btn_del = findViewById(R.id.btn_del);
        SharedPreferences shared = getSharedPreferences("score", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = shared.edit();
        total = shared.getInt("total",-1);
        if(total == -1){
            editor.putInt("total",0);
            editor.apply();
            total = 0;//从未创建过文件
        }

        if(total == 0){
            tv_score.setText("暂时没有积分数据");
        }
        else {
            tv_score.setText("分数\t\t\t\t\t\t\t\t时间");
            for(int i=1;i<=total;i++){
                Score s = new Score(shared.getInt(i+"score",0),shared.getString(i+"date",""));
                int nowScore = s.getScore();
                String nowDate = s.getDate();
                tv_score.setText(tv_score.getText()+"\n"+s.getScore() + "\t\t\t\t"+s.getDate());
            }
        }

        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                total = 0;
                editor.putInt("total",0);
                editor.apply();
                tv_score.setText("暂时没有积分数据");
            }
        });
    }
}

