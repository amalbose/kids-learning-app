package com.amalbose.kidslearningapp.fragments;


import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amalbose.kidslearningapp.R;

/**
 * Created by amalbose on 27/12/17.
 */

public class AlphabetFragment extends BaseFragment {

    private static int[] data = new int[]{
            R.drawable.apple,
            R.drawable.ball,
            R.drawable.cat,
            R.drawable.dog,
            R.drawable.elephant,
            R.drawable.fish,
            R.drawable.goat,
            R.drawable.hat,
            R.drawable.ice_cream,
            R.drawable.jar,
            R.drawable.kite,
            R.drawable.leaf,
            R.drawable.mango,
            R.drawable.nest,
            R.drawable.orange,
            R.drawable.parrot,
            R.drawable.queen,
            R.drawable.rabbit,
            R.drawable.sun_flower,
            R.drawable.teddy,
            R.drawable.umbrella,
            R.drawable.violin,
            R.drawable.watch,
            R.drawable.xylophone,
            R.drawable.yacht,
            R.drawable.zebra
    };

    private static String[] dataTitle = new String[]{
            "Apple",
            "Ball",
            "Cat",
            "Dog",
            "Elephant",
            "Fish",
            "Goat",
            "Hat",
            "Ice Cream",
            "Jar",
            "Kite",
            "Leaf",
            "Mango",
            "Nest",
            "Orange",
            "Parrot",
            "Queen",
            "Rabbit",
            "Sun Flower",
            "Teddy",
            "Umbrella",
            "Violin",
            "Watch",
            "Xylophone",
            "Yacht",
            "Zebra"
    };

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static AlphabetFragment newInstance(int sectionNumber) {
        AlphabetFragment fragment = new AlphabetFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_alphabets, container, false);
        TextView textView = rootView.findViewById(R.id.section_label);
        TextView alphabetView = rootView.findViewById(R.id.alphabet_label);
        alphabetView.setText(dataTitle[id].substring(0, 1));
        textView.setText(dataTitle[id]);
        ImageView imageView = rootView.findViewById(R.id.alphabetImage);
        imageView.setImageResource(data[id]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speak(dataTitle[sectionNumber]);
            }
        });
        return rootView;
    }
}
