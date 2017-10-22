package com.travisway.shoppinghelp;

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
        else{
            return false;
        }
    }
}
