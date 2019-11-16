package com.pax.wlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String aaa = paxCheck.GetpaxCheck("123456");
        System.out.print("wwc aaa == " + aaa);
    }
}
