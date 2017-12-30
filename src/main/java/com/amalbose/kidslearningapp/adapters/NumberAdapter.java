package com.amalbose.kidslearningapp.adapters;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.amalbose.kidslearningapp.R;
import com.amalbose.kidslearningapp.common.MenuType;

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
            R.drawable.ballbearings,
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
            "Balls",
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
