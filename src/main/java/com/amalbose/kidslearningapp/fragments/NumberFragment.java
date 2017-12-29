package com.amalbose.kidslearningapp.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.amalbose.kidslearningapp.R;

import java.util.HashMap;

public class NumberFragment extends BaseFragment {

    private static int[] data = new int[]{
            R.drawable.cake,
            R.drawable.rose,
            R.drawable.bag,
            R.drawable.bulb,
            R.drawable.pencil,
            R.drawable.egg,
            R.drawable.crayons,
            R.drawable.ballbearings,
            R.drawable.gems,
            R.drawable.balls,
    };

    private static HashMap<Integer, String> dataTitle = new HashMap();

    static {
        dataTitle.put(1, "Cake");
        dataTitle.put(2, "Roses");
        dataTitle.put(3, "Bags");
        dataTitle.put(4, "Bulbs");
        dataTitle.put(5, "Pencils");
        dataTitle.put(6, "Eggs");
        dataTitle.put(7, "Crayons");
        dataTitle.put(8, "Balls");
        dataTitle.put(9, "Gems");
        dataTitle.put(10, "Balls");
    }

    public static NumberFragment newInstance(int sectionNumber) {
        NumberFragment fragment = new NumberFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_numbers, container, false);
        TextView numberLabel = rootView.findViewById(R.id.number_label);
        numberLabel.setText(String.valueOf(id));
        TextView numberTextView = rootView.findViewById(R.id.number_text);
        numberTextView.setText(dataTitle.get(id));
        ImageView imageView = rootView.findViewById(R.id.numberImage);
        imageView.setImageResource(data[id - 1]);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speak(sectionNumber + " " + dataTitle.get(sectionNumber));
            }
        });

        return rootView;
    }

}
