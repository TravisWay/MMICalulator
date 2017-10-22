package com.travisway.shoppinghelp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassification;
import android.widget.*;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;

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


        Button upc = (Button) InputFragmentView.findViewById(R.id.upc);
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
            units1.setText("Required");
        }else if (emp1) {
            units2.setText("Required");
        }else if (emp2) {
            price1.setText("Required");
        }else if (emp3) {
            price2.setText("Required");
        }else {
            double unitsOne = Double.parseDouble(units1.getText().toString());
            double unitsTwo = Double.parseDouble(units2.getText().toString());
            double priceOne = Double.parseDouble(price1.getText().toString());
            double priceTwo = Double.parseDouble(price2.getText().toString());
            int winner = Upc.UnitPriceCalculator(priceOne, priceTwo, unitsOne, unitsTwo);
            if (winner == 0) {
                item1.setText(s);
                item2.setText("");
            } else if (winner == 1) {
                item2.setText(s);
                item1.setText("");
            } else {
                item1.setText("Draw");
                item2.setText("Draw");
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

            }
        });


        return InputFragmentView;

    }
}
