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
        startMenuActivity(MenuType.ALPHABETS);
    }

    public void startNumbers(View v) {
        startMenuActivity(MenuType.NUMBERS);
    }

    public void startAnimals(View v) {
        startMenuActivity(MenuType.ANIMALS);
    }

    public void startBirds(View v) {
        startMenuActivity(MenuType.BIRDS);
    }

    public void startColors(View v) {
        startMenuActivity(MenuType.COLOR);
    }

    public void startShapes(View v) {
        startMenuActivity(MenuType.SHAPE);
    }

    private void startMenuActivity(MenuType type) {
        Intent intent = new Intent(this, MenuCategory.class);
        Bundle args = new Bundle();
        args.putSerializable(Common.CATEGORY_TYPE, type);
        intent.putExtras(args);
        startActivity(intent);
    }
}
