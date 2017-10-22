package com.travisway.shoppinghelp;

import android.widget.EditText;

/**
 * Created by travisway on 10/1/17.
 */

public class Percent {

    public static double calcPercent(double amount, double percent){

        double total = amount -(amount * percent);
        total = Math.round(total * 100.00) / 100.00;
        return total;

    }

}
