package com.amalbose.toddlertalk.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.toddlertalk.R;
import com.amalbose.toddlertalk.common.MenuType;

/**
 * Created by amalbose on 30/12/17.
 */

public class VegetableAdapter extends BaseAdapter {

    public static int[] data = new int[]{
            R.drawable.bokchoy,
            R.drawable.broccoli,
            R.drawable.cabbage,
            R.drawable.carrot,
            R.drawable.cauliflower,
            R.drawable.cellery,
            R.drawable.corn,
            R.drawable.cucumbers,
            R.drawable.eggplant,
            R.drawable.garlic,
            R.drawable.lettuce,
            R.drawable.mushroom,
            R.drawable.onion,
            R.drawable.potato,
            R.drawable.pumpkin,
            R.drawable.redpepper,
            R.drawable.tomato
    };

    public static String[] dataTitle = new String[]{
            "Bokchoy",
            "Broccoli",
            "Cabbage",
            "Carrot",
            "Cauliflower",
            "Cellery",
            "Corn",
            "Cucumbers",
            "Eggplant",
            "Garlic",
            "Lettuce",
            "Mushroom",
            "Onion",
            "Potato",
            "Pumpkin",
            "Red Pepper",
            "Tomato"
    };

    public VegetableAdapter(FragmentManager fm) {
        super(fm, MenuType.VEGETABLE, data, dataTitle);
    }

    public String getLabel(int index){
        return "";
    }

    @Override
    public int getCount() {
        return data.length;
    }
}
