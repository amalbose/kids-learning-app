package com.amalbose.kidslearningapp.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.kidslearningapp.R;
import com.amalbose.kidslearningapp.common.MenuType;

/**
 * Created by amalbose on 30/12/17.
 */

public class BirdAdapter extends BaseAdapter {

    public static int[] data = new int[]{
            R.drawable.bluebird,
            R.drawable.bullfinch,
            R.drawable.collareddove,
            R.drawable.dove,
            R.drawable.duck,
            R.drawable.hawk,
            R.drawable.hen,
            R.drawable.hummingbird,
            R.drawable.kingfisher,
            R.drawable.owl,
            R.drawable.parrot,
            R.drawable.penguin,
            R.drawable.pigeon,
            R.drawable.raven,
            R.drawable.seagull,
            R.drawable.stork
    };

    public static String[] dataTitle = new String[]{
            "Bluebird",
            "Bullfinch",
            "Collared Dove",
            "Dove",
            "Duck",
            "Hawk",
            "Hen",
            "Hummingbird",
            "Kingfisher",
            "Owl",
            "Parrot",
            "Penguin",
            "Pigeon",
            "Raven",
            "Seagull",
            "Stork"
    };

    public BirdAdapter(FragmentManager fm) {
        super(fm, MenuType.ANIMALS, data, dataTitle);
    }

    public String getLabel(int index){
        return "";
    }

    @Override
    public int getCount() {
        return data.length;
    }
}
