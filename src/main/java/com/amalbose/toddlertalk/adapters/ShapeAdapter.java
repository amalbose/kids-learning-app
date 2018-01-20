package com.amalbose.toddlertalk.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.toddlertalk.R;
import com.amalbose.toddlertalk.common.MenuType;

/**
 * Created by amalbose on 27/12/17.
 */

public class ShapeAdapter extends BaseAdapter {

    private static int[] data = new int[]{
            R.drawable.circle,
            R.drawable.square,
            R.drawable.rectangle,
            R.drawable.triangle,
            R.drawable.oval,
            R.drawable.star,
            R.drawable.diamond,
            R.drawable.cross,
            R.drawable.pentagon,
            R.drawable.trapezium,
    };

    private static String[] dataTitle = new String[]{
            "Circle",
            "Square",
            "Rectangle",
            "Triangle",
            "Oval",
            "Star",
            "Diamond",
            "Cross",
            "Pentagon",
            "Trapezium"
    };

    public ShapeAdapter(FragmentManager fm) {
        super(fm, MenuType.SHAPE, data, dataTitle);
    }

    public String getLabel(int index){
        return "";
    }

    @Override
    public int getCount() {
        return data.length;
    }

}
