package com.amalbose.kidslearningapp.adapters;

import android.support.v4.app.FragmentManager;

import com.amalbose.kidslearningapp.common.MenuType;

/**
 * Created by amalbose on 30/12/17.
 */

public class AdapterFactory {

    public static BaseAdapter getAdapter(MenuType type, FragmentManager fm) {
        switch (type) {
            case ALPHABETS:
                return new AlphabetAdapter(fm);
            case NUMBERS:
                return new NumberAdapter(fm);
            case ANIMALS:
                return new AnimalAdapter(fm);
            case BIRDS:
                return new BirdAdapter(fm);
        }
        return null;
    }
}
