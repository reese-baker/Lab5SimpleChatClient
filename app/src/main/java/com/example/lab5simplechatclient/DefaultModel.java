package com.example.lab5simplechatclient;

import android.util.Log;

public class DefaultModel extends AbstractModel {

    public static final String TAG = "DefaultModel";

    private String outputText;

    public void initDefault() {

        setOutputText("Click the button to send an HTTP GET request ...");

    }

    public String getOutputText() {
        return outputText;
    }

    public void setOutputText(String newText) {

        String oldText = this.outputText;
        this.outputText = newText;

        Log.i(TAG, "Output Text Change: From " + oldText + " to " + newText);

        firePropertyChange(DefaultController.ELEMENT_OUTPUT_PROPERTY, oldText, newText);

    }

}
