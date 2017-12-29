package com.amalbose.kidslearningapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.amalbose.kidslearningapp.fragments.AlphabetFragment;

/**
 * Created by amalbose on 27/12/17.
 */

public class AlphabetAdapter extends FragmentPagerAdapter {

    public AlphabetAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return AlphabetFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 26;
    }
}
