package com.amalbose.toddlertalk.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.toddlertalk.R;
import com.amalbose.toddlertalk.common.MenuType;

/**
 * Created by amalbose on 27/12/17.
 */

public class NumberAdapter extends BaseAdapter {

    private static int[] data = new int[]{
            R.drawable.cake,
            R.drawable.rose,
            R.drawable.bag,
            R.drawable.bulb,
            R.drawable.pencil,
            R.drawable.egg,
            R.drawable.crayons,
            R.drawable.erasors,
            R.drawable.gems,
            R.drawable.balls,
    };

    private static String[] dataTitle = new String[]{
            "Cake",
            "Roses",
            "Bags",
            "Bulbs",
            "Pencils",
            "Eggs",
            "Crayons",
            "Erasors",
            "Gems",
            "Balls"
    };

    public NumberAdapter(FragmentManager fm) {
        super(fm, MenuType.NUMBERS, data, dataTitle);
    }

    public String getIndexLabel(int index){
        return String.valueOf(index + 1);
    }

    @Override
    public int getCount() {
        return data.length;
    }

    public String getSpeakText(int sectionNumber) {
        return String.valueOf(sectionNumber + 1);
    }
}
