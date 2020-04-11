package com.eevix.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.eevix.android.util.Logger;

public class MainActivity extends AppCompatActivity {
    private final String TAG = "MainActivity";
    private final Logger mLogger = Logger.get(TAG);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLogger.d("onCreate");
    }
}