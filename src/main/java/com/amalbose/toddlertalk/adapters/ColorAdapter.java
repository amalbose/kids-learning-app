package com.amalbose.toddlertalk.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.toddlertalk.common.MenuFragmentType;
import com.amalbose.toddlertalk.common.MenuType;

/**
 * Created by amalbose on 30/12/17.
 */

public class ColorAdapter extends BaseAdapter {

    public static int[] data = new int[]{
            0xFF000000,
            0xFFFFFFFF,
            0xFFFF0000,
            0xFF0000FF,
            0xFF00FF00,
            0xFFFFFF00,
            0xFF00FFFF,
            0xFFA52A2A,
            0xFF808080,
            0xFFFFA500,
            0xFFFFC0CB,
            0xFF800080,
            0xFFFF00FF
    };

    public static String[] dataTitle = new String[]{
            "Black",
            "White",
            "Red",
            "Blue",
            "Green",
            "Yellow",
            "Cyan",
            "Brown",
            "Grey",
            "Orange",
            "Pink",
            "Purple",
            "Magenta"
    };

    public ColorAdapter(FragmentManager fm) {
        super(fm, MenuType.COLOR, data, dataTitle);
        setFragmentType(MenuFragmentType.SHAPE);
    }

    public int getColor(int index){
        return data[index];
    }

    @Override
    public int getCount() {
        return data.length;
    }
}
