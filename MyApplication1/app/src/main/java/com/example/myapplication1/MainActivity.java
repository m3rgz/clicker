package com.example.myapplication1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer counter = 0;
    private static final String KEY_COUNTER = "COUNTER";

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER, counter);
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt(KEY_COUNTER);
        TextView counterV = findViewById(R.id.txt_counter);
        counterV.setText(counter.toString());
    }

    @SuppressLint("SetTextI18n")
    public void onClickBtnAdd1point(View view) {
        counter++;
        TextView counterView = findViewById(R.id.txtcounter);
        counterView.setText(counter.toString());
    }

    public void onClickBtnAddArtem(View view) {
    }

}