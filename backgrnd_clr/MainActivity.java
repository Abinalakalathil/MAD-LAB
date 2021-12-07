package com.example.sjcet.background_clr;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        LinearLayout layout1;
        layout1 = findViewById(R.id.ll1);
        layout1.setBackgroundColor(Color.RED);
    }
}
