package com.example.evanliu.ndkgooglecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static {
        System.loadLibrary("hello");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv_msg = (TextView) findViewById(R.id.tv_msg);
        tv_msg.setText(stringFromJNI());

    }
    //声明一个本地方法，用native关键字修饰
    public native String stringFromJNI();
}
