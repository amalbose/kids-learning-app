package com.amalbose.toddlertalk.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.toddlertalk.R;
import com.amalbose.toddlertalk.common.MenuType;

/**
 * Created by amalbose on 30/12/17.
 */

public class FruitAdapter extends BaseAdapter {

    public static int[] data = new int[]{
            R.drawable.apple,
            R.drawable.apricot,
            R.drawable.avocado,
            R.drawable.banana,
            R.drawable.cherry,
            R.drawable.date,
            R.drawable.grapes,
            R.drawable.guava,
            R.drawable.kiwi,
            R.drawable.lemon,
            R.drawable.mango,
            R.drawable.orange,
            R.drawable.papaya,
            R.drawable.pear,
            R.drawable.pineapple,
            R.drawable.pomegranate,
            R.drawable.raspberry,
            R.drawable.watermelon
    };

    public static String[] dataTitle = new String[]{
            "Apple",
            "Apricot",
            "Avocado",
            "Banana",
            "Cherry",
            "Date",
            "Grapes",
            "Guava",
            "Kiwi",
            "Lemon",
            "Mango",
            "Orange",
            "Papaya",
            "Pear",
            "Pineapple",
            "Pomegranate",
            "Raspberry",
            "Watermelon"
    };

    public FruitAdapter(FragmentManager fm) {
        super(fm, MenuType.FRUIT, data, dataTitle);
    }

    public String getLabel(int index){
        return "";
    }

    @Override
    public int getCount() {
        return data.length;
    }
}
