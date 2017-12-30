package com.amalbose.kidslearningapp.common;

/**
 * Created by amalbose on 30/12/17.
 */

public enum MenuType {
    ALPHABETS("Alphabets"),
    ANIMALS("Animals"),
    BIRDS("Birds"),
    NUMBERS ("Numbers");

    private final String title;

    private MenuType(String title){
        this.title = title;
    }

    public String getTitle(){
        return this.title;
    }
}
