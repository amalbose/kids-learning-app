package com.amalbose.kidslearningapp.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.kidslearningapp.R;
import com.amalbose.kidslearningapp.common.MenuType;

/**
 * Created by amalbose on 30/12/17.
 */

public class FlowerAdapter extends BaseAdapter {

    public static int[] data = new int[]{
            R.drawable.asters,
            R.drawable.camellia,
            R.drawable.camomile,
            R.drawable.daffodil,
            R.drawable.dahlias,
            R.drawable.daphne,
            R.drawable.gladiolus,
            R.drawable.lily,
            R.drawable.mauve,
            R.drawable.orchid,
            R.drawable.pansy,
            R.drawable.redrose,
            R.drawable.sunflower,
            R.drawable.tulips,
            R.drawable.whiterose
    };

    public static String[] dataTitle = new String[]{
            "Asters",
            "Camellia",
            "Camomile",
            "Daffodil",
            "Dahlias",
            "Daphne",
            "Gladiolus",
            "Lily",
            "Mauve",
            "Orchid",
            "Pansy",
            "Red Rose",
            "Sunflower",
            "Tulips",
            "White Rose"
    };

    public FlowerAdapter(FragmentManager fm) {
        super(fm, MenuType.FLOWER, data, dataTitle);
    }

    public String getLabel(int index){
        return "";
    }

    @Override
    public int getCount() {
        return data.length;
    }
}
