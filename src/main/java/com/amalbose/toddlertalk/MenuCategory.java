package com.amalbose.toddlertalk;


import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.amalbose.toddlertalk.adapters.AdapterFactory;
import com.amalbose.toddlertalk.adapters.BaseAdapter;
import com.amalbose.toddlertalk.common.Common;
import com.amalbose.toddlertalk.common.MenuType;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class MenuCategory extends AppCompatActivity {

    private BaseAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    private AdView mAdView;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        mSectionsPagerAdapter = AdapterFactory.getAdapter((MenuType) getIntent().getExtras().get(Common.CATEGORY_TYPE), getSupportFragmentManager());

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(mSectionsPagerAdapter.getTitle());
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mAdView = findViewById(R.id.adViewItem);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-2908968619933777/9705798971");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }

    @Override
    public void onBackPressed() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }else{
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_category, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            return false;
        }
        return super.onOptionsItemSelected(item);
    }
}
