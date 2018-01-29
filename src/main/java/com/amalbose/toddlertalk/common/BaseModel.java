package com.amalbose.toddlertalk.common;

/**
 * Created by amalbose on 30/12/17.
 */

public interface BaseModel {

    int getFragment();

    MenuFragmentType getFragmentType();

    String getLabel(int index);

    String getIndexLabel(int index);

    int getImageResource(int index);

    String getSpeakText(int sectionNumber);

    int getColor(int index);
}
