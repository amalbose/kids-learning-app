package com.amalbose.kidslearningapp.fragments;


import android.content.Context;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amalbose.kidslearningapp.R;
import com.amalbose.kidslearningapp.common.BaseModel;
import com.amalbose.kidslearningapp.common.MenuFragmentType;

/**
 * Created by amalbose on 27/12/17.
 */

public class CategoryFragment extends Fragment {

    protected int sectionNumber;
    private TextToSpeech toSpeech;
    protected BaseModel model;

    protected static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static CategoryFragment newInstance(int sectionNumber, BaseModel model) {
        CategoryFragment fragment = new CategoryFragment();
        fragment.setModel(model);
        fragment.setSectionNumber(sectionNumber);
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setTTS(this.getActivity().getApplicationContext());
        int id = getArguments().getInt(ARG_SECTION_NUMBER);
        View rootView = inflater.inflate(model.getFragment(), container, false);

        TextView indexLabelView = rootView.findViewById(R.id.index_label);
        indexLabelView.setText(model.getIndexLabel(id));

        if (model.getFragmentType() == MenuFragmentType.IMAGE) {
            TextView textView = rootView.findViewById(R.id.section_label);
            textView.setText(model.getLabel(id));
            ImageView imageView = rootView.findViewById(R.id.categoryImage);
            imageView.setImageResource(model.getImageResource(id));
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    speak(model.getSpeakText(sectionNumber));
                }
            });
        } else if (model.getFragmentType() == MenuFragmentType.SHAPE) {
            ConstraintLayout colorPanel = rootView.findViewById(R.id.colorPanel);
            colorPanel.setBackgroundColor(model.getColor(id));
            colorPanel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    speak(model.getSpeakText(sectionNumber));
                }
            });
        }


        return rootView;
    }

    public void setTTS(Context context) {
        toSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
            }
        });
    }

    private void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    private void speak(String text) {
        toSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

    private void setModel(BaseModel model) {
        this.model = model;
    }

}
