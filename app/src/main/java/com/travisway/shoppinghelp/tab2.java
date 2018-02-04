package com.travisway.shoppinghelp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;

import com.travisway.shoppinghelp1.R;

/**
 * Created by travisway on 10/8/17.
 */

public class tab2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View InputFragmentView = inflater.inflate(R.layout.upc, container, false);

        final EditText units1 = (EditText) InputFragmentView.findViewById(R.id.units1);
        final EditText units2 = (EditText) InputFragmentView.findViewById(R.id.units2);
        final EditText price1 = (EditText) InputFragmentView.findViewById(R.id.price1);
        final EditText price2 = (EditText) InputFragmentView.findViewById(R.id.price2);
        final TextView item1 = (TextView) InputFragmentView.findViewById(R.id.item1);
        final TextView item2= (TextView) InputFragmentView.findViewById(R.id.item2);
        final TextView UPC1=(TextView) InputFragmentView.findViewById(R.id.UPC1);
        final TextView UPC2=(TextView) InputFragmentView.findViewById(R.id.UPC2);
        final TextView asterisk1= (TextView) InputFragmentView.findViewById(R.id.asterisk1);
        final TextView asterisk2= (TextView) InputFragmentView.findViewById(R.id.asterisk2);
        final TextView asterisk3= (TextView) InputFragmentView.findViewById(R.id.asterisk3);
        final TextView asterisk4= (TextView) InputFragmentView.findViewById(R.id.asterisk4);


        final Button upc = (Button) InputFragmentView.findViewById(R.id.upc);
        Button clear = (Button) InputFragmentView.findViewById(R.id.clear);

        upc.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View view){
            String s = "Buy";
            boolean emp = Empty.Emp((EditText) units1);
            boolean emp1 = Empty.Emp((EditText) units2);
            boolean emp2 = Empty.Emp((EditText) price1);
            boolean emp3 = Empty.Emp((EditText) price2);
            if (emp) {
            asterisk1.setText("*");
        }else if (emp1) {
            asterisk3.setText("*");
        }else if (emp2) {
            asterisk2.setText("*");
        }else if (emp3) {
            asterisk4.setText("*");
        }else {
            double unitsOne = Double.parseDouble(units1.getText().toString());
            double unitsTwo = Double.parseDouble(units2.getText().toString());
            double priceOne = Double.parseDouble(price1.getText().toString());
            double priceTwo = Double.parseDouble(price2.getText().toString());
            int winner = Upc.UnitPriceCalculator(priceOne, priceTwo, unitsOne, unitsTwo);
            UPC1.setText(String.format("%.2f", Upc.UPC1));
            UPC2.setText(String.format("%.2f", Upc.UPC2));
            if (winner == 0) {
                item1.setText(s);
                item2.setText("");
                asterisk1.setText("");
                asterisk2.setText("");
                asterisk3.setText("");
                asterisk4.setText("");
            } else if (winner == 1) {
                item2.setText(s);
                item1.setText("");
                asterisk1.setText("");
                asterisk2.setText("");
                asterisk3.setText("");
                asterisk4.setText("");
            } else {
                item1.setText("Draw");
                item2.setText("Draw");
                asterisk1.setText("");
                asterisk2.setText("");
                asterisk3.setText("");
                asterisk4.setText("");
            }
        }
        }
    });

        clear.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {

                item1.setText("");
                item2.setText("");
                units2.setText("");
                units1.setText("");
                price1.setText("");
                price2.setText("");
                asterisk1.setText("");
                asterisk2.setText("");
                asterisk3.setText("");
                asterisk4.setText("");
                UPC1.setText("");
                UPC2.setText("");

            }
        });


        return InputFragmentView;

    }
}
