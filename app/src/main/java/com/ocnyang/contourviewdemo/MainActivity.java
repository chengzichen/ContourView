package com.ocnyang.contourviewdemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startLook(View view){
        startActivity(new Intent(this,ContourActivity.class));
    }

    public void openGithub(View view){
        Uri uri = Uri.parse("https://github.com/OCNYang/ContourView");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
