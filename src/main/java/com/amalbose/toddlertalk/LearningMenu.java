package com.amalbose.toddlertalk;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.RelativeLayout;

import com.amalbose.toddlertalk.adapters.LearningMenuAdapter;
import com.amalbose.toddlertalk.common.MenuType;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class LearningMenu extends AppCompatActivity {

    private static final String ADMOB_ID = "ca-app-pub-2908968619933777~5323577122";

    //Banner AD : ca-app-pub-2908968619933777/3378750690

    private Context mContext;
    private AdView mAdView;

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
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        MobileAds.initialize(this, ADMOB_ID);
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


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
