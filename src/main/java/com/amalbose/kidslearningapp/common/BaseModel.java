package com.amalbose.kidslearningapp.common;

/**
 * Created by amalbose on 30/12/17.
 */

public interface BaseModel {

    String getLabel(int index);

    String getIndexLabel(int index);

    int getImageResource(int index);

    String getSpeakText(int sectionNumber);
}
