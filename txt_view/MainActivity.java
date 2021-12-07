package com.example.sjcet.text_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Click(View view) {
        EditText edit = (EditText)findViewById(R.id.et1);
        TextView tview = (TextView)findViewById(R.id.tv1);
        String result = edit.getText().toString();
        tview.setText(result);
    }
}
