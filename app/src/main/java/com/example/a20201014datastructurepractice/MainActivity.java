package com.example.a20201014datastructurepractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;
    int temp = 0;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String[] lst = {"我們是第五組，組稱'資料解構'", "組員有40841107 劉宜欣", "組員有40841121 薛孟君", "組員有40841144 辛昌紘", "組員有40841145 林政佑", "組員有40841147 王禹翔"};
                textView.setText("");
                textView.setText(lst[(temp % 6)].toString());
                temp += 1;
            }
        });

    }
}