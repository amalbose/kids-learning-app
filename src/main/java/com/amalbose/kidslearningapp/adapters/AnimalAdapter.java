package com.amalbose.kidslearningapp.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.kidslearningapp.R;
import com.amalbose.kidslearningapp.common.MenuType;

/**
 * Created by amalbose on 30/12/17.
 */

public class AnimalAdapter extends BaseAdapter {

    public static int[] data = new int[]{
            R.drawable.bear,
            R.drawable.bengaltiger,
            R.drawable.blackpanther,
            R.drawable.cat,
            R.drawable.cow,
            R.drawable.deer,
            R.drawable.dog,
            R.drawable.elephant,
            R.drawable.fish,
            R.drawable.frog,
            R.drawable.giraffe,
            R.drawable.goat,
            R.drawable.hippopotamus,
            R.drawable.horse,
            R.drawable.leapord,
            R.drawable.monkey,
            R.drawable.rabbit,
            R.drawable.rhino,
            R.drawable.snail,
            R.drawable.spider,
            R.drawable.turtle,
            R.drawable.whitetiger,
            R.drawable.wolf,
            R.drawable.zebra
    };

    public static String[] dataTitle = new String[]{
            "Bear",
            "Bengal Tiger",
            "Black Panther",
            "Cat",
            "Cow",
            "Deer",
            "Dog",
            "Elephant",
            "Fish",
            "Frog",
            "Giraffe",
            "Goat",
            "Hippopotamus",
            "Horse",
            "Leopard",
            "Monkey",
            "Rabbit",
            "Rhino",
            "Snail",
            "Spider",
            "Turtle",
            "White Tiger",
            "Wolf",
            "Zebra"
    };

    public AnimalAdapter(FragmentManager fm) {
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
