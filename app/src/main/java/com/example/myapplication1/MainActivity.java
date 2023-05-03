package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public Button add;
private EditText text1;
private TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.text1);
        add=findViewById(R.id.btu);

        text2=findViewById(R.id.text2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str= String.valueOf(text1.getText());
                text2.setText(str);
            }
        });

    }
}