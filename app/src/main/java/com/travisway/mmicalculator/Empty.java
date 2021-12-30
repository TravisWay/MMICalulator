package com.travisway.mmicalculator;

import android.widget.EditText;

/**
 * Created by travisway on 10/7/17.
 */

public class Empty {

    public static boolean Emp(EditText text){
        EditText myEditText = text;
        String texty = myEditText.getText().toString();
        if (texty.matches("")|| texty.matches("Required")) {
            return true;
        }
        try{
            Double test = Double.parseDouble(texty);
            return false;

        }
        catch(NumberFormatException e){
            return true;
        }
    }
}
