package com.wow.gpujni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.wow.video.gpuimage.util.NativeLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NativeLibrary.test();
    }
}
