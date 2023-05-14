package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private EditText Num1;
    private EditText Num2;
    private Button button;

    private Button button2;

    private Button button3;

    private Button btn4;
    private TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Num1 = (EditText)findViewById(R.id.Num1);
        Num2 = (EditText)findViewById(R.id.Num2);
        button = (Button)findViewById(R.id.button);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        btn4 = (Button)findViewById(R.id.btn4);

        result = (TextView)findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(Num1.getText().toString());
                int number2 = Integer.parseInt(Num2.getText().toString());
                int sum = number1+number2;
                result.setText("Answer "+ String.valueOf(sum));


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(Num1.getText().toString());
                int number2 = Integer.parseInt(Num2.getText().toString());
                int sub = number1-number2;
                result.setText("Answer "+ String.valueOf(sub));


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(Num1.getText().toString());
                int number2 = Integer.parseInt(Num2.getText().toString());
                int mul = number1*number2;
                result.setText("Answer "+ String.valueOf(mul));


            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent);

            }
        });
    }
}