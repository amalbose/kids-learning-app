package com.amalbose.toddlertalk.common;

import com.amalbose.toddlertalk.R;

/**
 * Created by amalbose on 30/12/17.
 */

public enum MenuType {
    ALPHABETS("Alphabets", R.drawable.alphabet),
    ANIMALS("Animals", R.drawable.bear),
    BIRDS("Birds", R.drawable.bluebird),
    NUMBERS ("Numbers", R.drawable.number),
    COLOR("Colors", R.drawable.color),
    SHAPE("Shapes", R.drawable.diamond),
    VEGETABLE("Vegetables", R.drawable.vegetables),
    FLOWER("Flowers", R.drawable.flowers);

    private final String title;
    private final int resource;

    MenuType(String title, int resource){
        this.title = title;
        this.resource = resource;
    }

    public String getTitle(){
        return this.title;
    }

    public int getResource(){
        return this.resource;
    }
}
