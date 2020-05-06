package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mBt01;
    private Button mBt02;
    private TextView mTv01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBt01 = findViewById(R.id.mBt01);
        mBt02 = findViewById(R.id.mBt02);
        mTv01 = findViewById(R.id.mTv01);
        mBt01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTv01.setText(mBt01.getText());
            }
        });
        mBt02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTv01.setText(mBt02.getText());
            }
        });
    }
}
