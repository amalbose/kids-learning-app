package com.amalbose.toddlertalk.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.toddlertalk.R;
import com.amalbose.toddlertalk.common.MenuType;

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
        super(fm, MenuType.BIRDS, data, dataTitle);
    }

    public String getLabel(int index){
        return "";
    }

    @Override
    public int getCount() {
        return data.length;
    }
}
