package com.dev.sdktest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.zeus.zcommon.ZCommonActivityTest;

public class Sdktest_TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sdktest_activity_test);
    }


    public void onClickStart(View view) {
        /*Intent intent = new Intent(Sdktest_TestActivity.this, ZCommonActivityTest.class);
        startActivity(intent);*/
        Toast.makeText(Sdktest_TestActivity.this, "OnClick", Toast.LENGTH_SHORT).show();
    }
}
