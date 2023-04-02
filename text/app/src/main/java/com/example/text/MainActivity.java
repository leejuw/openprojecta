package com.example.text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/* **********************************************
 * 프로젝트명 :  Edittext
 * 작성자 : 2020039098 이주원
 * 작성일 : 2023.04.02
 *프로그램 설명 :  에디트텍스트에 키가 눌릴 때마다, 바뀐 글자가 Toast 메시지로 나오도록함
 ************************************************/

public class MainActivity extends AppCompatActivity {
    EditText userInput;
    Button displayOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("연습문제 4-8");

        userInput = (EditText) findViewById(R.id.userInput);
        displayOutput = (Button) findViewById(R.id.displayOutput);
        String text = userInput.getText().toString();

        Toast.makeText(getApplication(), text, Toast.LENGTH_SHORT).show();

        userInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text = userInput.getText().toString();
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}