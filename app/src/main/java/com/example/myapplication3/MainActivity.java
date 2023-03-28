package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mConstraintLayout;
    private TextView mInfoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mConstraintLayout = findViewById(R.id.constraint_layout);
        mInfoTextView = findViewById(R.id.textView);
    }

    public void onRedButtonClick(View view) {
        mInfoTextView.setText(R.string.Aka);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.Aka));
    }

    public void onGreenButtonClick(View view) {
        mInfoTextView.setText(R.string.Midori);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.Midori));
    }

    public void onYellowButtonClick(View view) {
        mInfoTextView.setText(R.string.Kiiro);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.Kiiro));
    }



}