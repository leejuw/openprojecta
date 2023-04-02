package com.example.button;

import androidx.appcompat.app.AppCompatActivity;
/* **********************************************
 * 프로젝트명 :  turn button
 * 작성자 : 2020039098 이주원
 * 작성일 : 2023.04.02
 *프로그램 설명 :  버튼에도 이미지가 들어가도록 할 수 있다. 다음과 같이 버튼을 클릭하면 이미지가 10도씩 회전되도록함
 ************************************************/
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imageView;
    float degree = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                degree = degree + 10;
                imageView.setRotation(degree);
            }
        });

    }
}