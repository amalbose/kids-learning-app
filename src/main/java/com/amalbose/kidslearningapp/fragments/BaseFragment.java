package com.amalbose.kidslearningapp.fragments;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.v4.app.Fragment;

/**
 * Created by amalbose on 28/12/17.
 */

public class BaseFragment extends Fragment {

    protected int sectionNumber;
    private TextToSpeech toSpeech;

    protected static final String ARG_SECTION_NUMBER = "section_number";

    public void setTTS(Context context) {
        toSpeech = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
            }
        });
    }

    protected void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    protected void speak(String text) {
        toSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
    }

}
