package com.amalbose.toddlertalk.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.amalbose.toddlertalk.MenuCategory;
import com.amalbose.toddlertalk.R;
import com.amalbose.toddlertalk.common.Common;
import com.amalbose.toddlertalk.common.MenuType;

/**
 * Created by amalbose on 1/1/18.
 */

public class LearningMenuAdapter extends RecyclerView.Adapter<LearningMenuAdapter.ViewHolder> {

    private MenuType[] mDataSet;
    private Context mContext;

    public LearningMenuAdapter(Context context,MenuType[] dataSet){
        mDataSet = dataSet;
        mContext = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.learning_menu_item, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.mTextView.setText(mDataSet[position].getTitle());
        holder.mLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startMenuActivity(mDataSet[position]);
            }
        });
        holder.imageView.setImageResource(mDataSet[position].getResource());
    }

    @Override
    public int getItemCount() {
        return mDataSet.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public LinearLayout mLinearLayout;
        public ImageView imageView;
        public ViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.tv);
            mLinearLayout = v.findViewById(R.id.ll);
            imageView = v.findViewById(R.id.menuItemImage);
        }
    }

    private void startMenuActivity(MenuType type) {
        Intent intent = new Intent(mContext, MenuCategory.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Bundle args = new Bundle();
        args.putSerializable(Common.CATEGORY_TYPE, type);
        intent.putExtras(args);
        mContext.startActivity(intent);
    }
}
