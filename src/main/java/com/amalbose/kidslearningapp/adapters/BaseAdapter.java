package com.amalbose.kidslearningapp.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.amalbose.kidslearningapp.common.BaseModel;
import com.amalbose.kidslearningapp.common.MenuType;
import com.amalbose.kidslearningapp.fragments.CategoryFragment;

/**
 * Created by amalbose on 30/12/17.
 */

public abstract class BaseAdapter extends FragmentPagerAdapter implements BaseModel {

    private MenuType type;

    private int[] data;
    private String[] dataTitle;

    public BaseAdapter(FragmentManager fm, MenuType type, int[]  data, String[] dataTitle) {
        super(fm);
        this.type = type;
        this.data = data;
        this.dataTitle = dataTitle;
    }

    @Override
    public Fragment getItem(int position) {
        return CategoryFragment.newInstance(position, this);
    }

    public String getLabel(int index){
        return dataTitle[index];
    }

    public String getIndexLabel(int index){
        return String.valueOf(index + 1);
    }

    public int getImageResource(int index) {
        return data[index];
    }

    public String getSpeakText(int sectionNumber) {
        return dataTitle[sectionNumber];
    }
}
