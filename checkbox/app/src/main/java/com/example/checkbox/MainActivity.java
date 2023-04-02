package com.example.checkbox;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

/* **********************************************
 * 프로젝트명 :  Checkbox
 * 작성자 : 2020039098
 * 작성일 : 2023.04.02
 *프로그램 설명 :  체크박스를 선택할 때마다, 버튼의 속성이 설정됨
 ************************************************/

public class MainActivity extends AppCompatActivity {

    CheckBox enable;
    CheckBox clickable;
    CheckBox rotate;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("연습문제 4-7");

        enable = (CheckBox) findViewById(R.id.enable);
        clickable = (CheckBox) findViewById(R.id.clickable);
        rotate = (CheckBox) findViewById(R.id.rotate);
        btn = (Button) findViewById(R.id.btn);

        enable.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(enable.isChecked() == true)  {
                    btn.setEnabled(true);
                }
                else if(enable.isChecked() == false) {
                    btn.setEnabled(false);
                }
            }
        }));

        clickable.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(clickable.isChecked() == true) {
                    btn.setClickable(true);
                }
                else if(clickable.isChecked() == false) {
                    btn.setClickable(false);
                }
            }
        }));

        rotate.setOnCheckedChangeListener((new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(rotate.isChecked() == true)  {
                    btn.setRotation(45);
                }
                else if(rotate.isChecked() == false) {
                    btn.setRotation(0);
                }
            }
        }));
    }
}