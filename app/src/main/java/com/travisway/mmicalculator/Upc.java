package com.travisway.mmicalculator;

/**
 * Created by travisway on 10/1/17.
 */

public class Upc {
    public static double UPC1;
    public static double UPC2;

    public static int UnitPriceCalculator(double price1, double price2, double units1, double units2){

        UPC1 = price1/units1;
        UPC2 = price2/units2;
        if(UPC1<UPC2)
            {return 0;}
        else if(UPC2<UPC1)
            {return 1;}
        else
            {return 2;}


    }

}
