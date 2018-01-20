package com.amalbose.toddlertalk.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.amalbose.toddlertalk.R;
import com.amalbose.toddlertalk.common.BaseModel;
import com.amalbose.toddlertalk.common.MenuFragmentType;
import com.amalbose.toddlertalk.common.MenuType;
import com.amalbose.toddlertalk.fragments.CategoryFragment;

/**
 * Created by amalbose on 30/12/17.
 */

public abstract class BaseAdapter extends FragmentPagerAdapter implements BaseModel {

    private int[] data;
    private String[] dataTitle;
    private String title;
    private MenuFragmentType fragmentType;
    private int fragmentLayout;

    public BaseAdapter(FragmentManager fm, MenuType type, int[] data, String[] dataTitle) {
        super(fm);
        this.data = data;
        this.title = type.getTitle();
        this.dataTitle = dataTitle;
        this.setFragmentType(MenuFragmentType.IMAGE);
    }

    @Override
    public Fragment getItem(int position) {
        return CategoryFragment.newInstance(position, this);
    }

    public String getLabel(int index) {
        return dataTitle[index];
    }

    public String getIndexLabel(int index) {
        return dataTitle[index];
    }

    public int getImageResource(int index) {
        return data[index];
    }

    public String getSpeakText(int sectionNumber) {
        return dataTitle[sectionNumber];
    }

    public String getTitle() {
        return this.title;
    }

    public void setFragmentType(MenuFragmentType fragmentType) {
        this.fragmentType = fragmentType;
        switch (fragmentType) {
            case SHAPE:
                this.fragmentLayout = R.layout.fragment_color;
                break;
            default:
                this.fragmentLayout = R.layout.fragment_category;
        }
    }

    public MenuFragmentType getFragmentType(){
        return this.fragmentType;
    }

    public int getFragment() {
        return this.fragmentLayout;
    }

    public int getColor(int index){
        return 0xFFFFFFFF;
    }
}
