package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView T1 = findViewById(R.id.T1);
       TextView T2 = findViewById(R.id.T2);
       EditText PT1 = findViewById(R.id.PT1);
       EditText PT2 = findViewById(R.id.PT2);
       EditText PT3 = findViewById(R.id.PT3);
       EditText PT4 = findViewById(R.id.PT4);
       Button B1 = findViewById(R.id.B1);
       CardView C1 = findViewById(R.id.C1);
       ImageView IMG1 = findViewById(R.id.IMG);

       B1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int num1 = Integer.parseInt(PT1.getText().toString());
               int num2 = Integer.parseInt(PT2.getText().toString());
               int num3 = Integer.parseInt(PT3.getText().toString());
               int num4 = Integer.parseInt(PT4.getText().toString());

               int  result = num1 + num2 + num3 + num4;

               T2.setText(String.valueOf(result));
           }
       });

        IMG1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    PT1.getText().clear();
                    PT2.getText().clear();
                    PT3.getText().clear();
                    PT4.getText().clear();
            }
        });
    }
}