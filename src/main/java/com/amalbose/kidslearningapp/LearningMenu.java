package com.amalbose.kidslearningapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.amalbose.kidslearningapp.common.Common;
import com.amalbose.kidslearningapp.common.MenuType;


public class LearningMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void startAlphabets(View v) {
        Intent intent = new Intent(this, MenuCategory.class);
        Bundle args = new Bundle();
        args.putSerializable(Common.CATEGORY_TYPE, MenuType.ALPHABETS);
        intent.putExtras(args);
        startActivity(intent);
    }

    public void startNumbers(View v) {
        Intent intent = new Intent(this, MenuCategory.class);
        Bundle args = new Bundle();
        args.putSerializable(Common.CATEGORY_TYPE, MenuType.NUMBERS);
        intent.putExtras(args);
        startActivity(intent);
    }
}
