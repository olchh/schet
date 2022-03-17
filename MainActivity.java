package com.example.tablo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "Logs";
    Integer counter = 0;
    Integer counter2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick1(View view) {
        counter++;
        TextView counterView = (TextView) findViewById(R.id.textView);
        counterView.setText(counter.toString());

    }
    public void onClick2(View view) {
        counter2++;
        TextView counterView = (TextView) findViewById(R.id.textView2);
        counterView.setText(counter2.toString());
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("Count");
        Log.d(LOG_TAG, "onRestoreInstanceState");
        super.onRestoreInstanceState(savedInstanceState);
        counter2 = savedInstanceState.getInt("Count");
        Log.d(LOG_TAG, "onRestoreInstanceState");
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Count", counter);
        Log.d(LOG_TAG, "onSaveInstateState");
        super.onSaveInstanceState(outState);
        outState.putInt("Count", counter2);
        Log.d(LOG_TAG, "onSaveInstateState");
    }
    public void onClick3(View view) {
        counter=0;
        counter2=0;
        TextView counterView = (TextView) findViewById(R.id.textView);
        counterView.setText(counter.toString());
        counterView.setText(counter2.toString());

    }


}