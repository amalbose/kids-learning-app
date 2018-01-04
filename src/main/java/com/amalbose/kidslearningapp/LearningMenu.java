package com.amalbose.kidslearningapp;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;

import com.amalbose.kidslearningapp.adapters.LearningMenuAdapter;
import com.amalbose.kidslearningapp.common.MenuType;

public class LearningMenu extends AppCompatActivity {

    private Context mContext;

    RelativeLayout mRelativeLayout;
    private RecyclerView mRecyclerView;

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mContext = getApplicationContext();
        // Get the widgets reference from XML layout
        mRelativeLayout = findViewById(R.id.rl);
        mRecyclerView = findViewById(R.id.recycler_view);

        // Define a layout for RecyclerView
        if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            mLayoutManager = new GridLayoutManager(mContext, 2);
        } else {
            mLayoutManager = new GridLayoutManager(mContext, 3);
        }
        mRecyclerView.setLayoutManager(mLayoutManager);

        // Initialize a new instance of RecyclerView Adapter instance
        mAdapter = new LearningMenuAdapter(mContext, getMenuItems());

        // Set the adapter for RecyclerView
        mRecyclerView.setAdapter(mAdapter);
    }

    public MenuType[] getMenuItems() {
        return MenuType.values();
    }
}
