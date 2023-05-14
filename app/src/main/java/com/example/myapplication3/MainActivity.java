package com.example.myapplication3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView username =findViewById(R.id.username);
        TextView password =findViewById(R.id.password);

        MaterialButton loginbtn =(MaterialButton) findViewById(R.id.loginbtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Toast.makeText(MainActivity.this, "Login Successfull", Toast.LENGTH_SHORT).show();


                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }






                else

                // Intent intent =new Intent(MainActivity.this, SecondActiity.class);
                //startActivity(intent);
                Toast.makeText(MainActivity.this, "Login Fail!", Toast.LENGTH_SHORT).show();




            }
        });
    }
}