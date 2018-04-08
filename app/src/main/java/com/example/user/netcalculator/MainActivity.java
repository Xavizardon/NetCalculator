package com.example.user.netcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    HashMap<Integer, String> equiv = new HashMap<Integer, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
