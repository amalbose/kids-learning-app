package com.amalbose.kidslearningapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.amalbose.kidslearningapp.fragments.NumberFragment;

/**
 * Created by amalbose on 27/12/17.
 */

public class NumberAdapter extends FragmentPagerAdapter {

    public NumberAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return NumberFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return 10;
    }
}
