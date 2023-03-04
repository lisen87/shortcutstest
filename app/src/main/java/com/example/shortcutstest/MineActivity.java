package com.example.shortcutstest;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mine);
        Intent intent = getIntent();
        if (intent != null){
//            Log.e("TAG", "onCreate: "+intent.getData().toString() );
        }
    }
}
