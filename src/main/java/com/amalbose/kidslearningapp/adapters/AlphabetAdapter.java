package com.amalbose.kidslearningapp.adapters;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import com.amalbose.kidslearningapp.R;
import com.amalbose.kidslearningapp.common.MenuType;

/**
 * Created by amalbose on 27/12/17.
 */

public class AlphabetAdapter extends BaseAdapter {

    public static int[] data = new int[]{
            R.drawable.apple,
            R.drawable.ball,
            R.drawable.cat,
            R.drawable.dog,
            R.drawable.elephant,
            R.drawable.fish,
            R.drawable.goat,
            R.drawable.hat,
            R.drawable.ice_cream,
            R.drawable.jar,
            R.drawable.kite,
            R.drawable.leaf,
            R.drawable.mango,
            R.drawable.nest,
            R.drawable.orange,
            R.drawable.parrot,
            R.drawable.queen,
            R.drawable.rabbit,
            R.drawable.sun_flower,
            R.drawable.teddy,
            R.drawable.umbrella,
            R.drawable.violin,
            R.drawable.watch,
            R.drawable.xylophone,
            R.drawable.yacht,
            R.drawable.zebra
    };

    public static String[] dataTitle = new String[]{
            "Apple",
            "Ball",
            "Cat",
            "Dog",
            "Elephant",
            "Fish",
            "Goat",
            "Hat",
            "Ice Cream",
            "Jar",
            "Kite",
            "Leaf",
            "Mango",
            "Nest",
            "Orange",
            "Parrot",
            "Queen",
            "Rabbit",
            "Sun Flower",
            "Teddy",
            "Umbrella",
            "Violin",
            "Watch",
            "Xylophone",
            "Yacht",
            "Zebra"
    };

    public AlphabetAdapter(FragmentManager fm) {
        super(fm, MenuType.ALPHABETS, data, dataTitle);
    }

    public String getIndexLabel(int index){
        return dataTitle[index].substring(0, 1);
    }

    @Override
    public int getCount() {
        return 26;
    }
}
