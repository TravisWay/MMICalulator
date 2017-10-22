package com.travisway.shoppinghelp;

/**
 * Created by travisway on 10/1/17.
 */

public class Upc {

    public static int UnitPriceCalculator(double price1, double price2, double units1, double units2){

        double total1 = price1/units1;
        double total2 = price2/units2;
        if(total1<total2)
            {return 0;}
        else if(total2<total1)
            {return 1;}
        else
            {return 2;}


    }

}
