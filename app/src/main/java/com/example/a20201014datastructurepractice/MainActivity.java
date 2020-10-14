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
    EditText editText;
    int num;
    Random ran = new Random();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        button.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textView.setText("");
                num = Integer.parseInt(editText.getText().toString());
                int data[] = new int[num];
                for (int i = 0; i <= data.length - 1; i++) {
                    data[i] = ran.nextInt(49);
                    if (i != 0) {
                        textView.setText(textView.getText().toString() + ",");
                        textView.setText(textView.getText().toString() + Integer.toString(data[i]));
                    }
                }
            }
        });

    }
}