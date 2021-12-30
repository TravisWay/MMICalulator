package com.travisway.mmicalculator;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.travisway.mmicalculator1.R;

/**
 * Created by travisway on 10/8/17.
 */

public class tab1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View InputFragmentView = inflater.inflate(R.layout.percent, container, false);

        final Button five = (Button) InputFragmentView.findViewById(R.id.five);
        Button ten = (Button) InputFragmentView.findViewById(R.id.ten);
        Button fifteen = (Button) InputFragmentView.findViewById(R.id.fifteen);
        Button twenty = (Button) InputFragmentView.findViewById(R.id.twenty);
        Button twentyfive = (Button) InputFragmentView.findViewById(R.id.twentyfive);
        Button thirty = (Button) InputFragmentView.findViewById(R.id.thirty);
        Button thirtyfive = (Button) InputFragmentView.findViewById(R.id.thirtyfive);
        Button forty = (Button) InputFragmentView.findViewById(R.id.forty);
        Button clear = (Button) InputFragmentView.findViewById(R.id.clear);
        Button cal = (Button) InputFragmentView.findViewById(R.id.calculate);
        final EditText input = (EditText) InputFragmentView.findViewById(R.id.inputPercent);
        final EditText cusPer = (EditText) InputFragmentView.findViewById(R.id.cusPer);
        final TextView answer = (TextView) InputFragmentView.findViewById(R.id.answer);
        final TextView asterisk = (TextView) InputFragmentView.findViewById(R.id.asterisk);
        final TextView asterisk2 = (TextView) InputFragmentView.findViewById(R.id.asterisk2);


        cal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean emp = Empty.Emp((EditText) input);
                boolean emp1 = Empty.Emp((EditText) cusPer);
                if (emp) {
                    asterisk.setText("*");
                } else if (emp1) {
                    asterisk2.setText("*");
                } else {
                    double number = Double.parseDouble(input.getText().toString());
                    double per = Double.parseDouble(cusPer.getText().toString());
                    per = per / 100;
                    answer.setText(Percent.calcPercent(number, per)+ "");
                    asterisk2.setText("");
                    asterisk.setText("");
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                input.setText("");
                cusPer.setText("");
                answer.setText("");
                asterisk.setText("");
                asterisk2.setText("");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            answer.setText(Percentage(input, .05, asterisk, asterisk2));
            }});
        ten.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .10,asterisk, asterisk2));
            }});
        fifteen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .15,asterisk, asterisk2));
            }});
        twenty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .20,asterisk, asterisk2));
            }});
        twentyfive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .25,asterisk, asterisk2));
            }});
        thirty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .30,asterisk, asterisk2));
            }});
        thirtyfive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .35,asterisk, asterisk2));
            }});
        forty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .40,asterisk, asterisk2));
            }});


        return InputFragmentView;
    }
    public static String Percentage (EditText givenAmount, double givenPercent,TextView asterisk, TextView asterisk2){
        boolean emp = Empty.Emp((EditText) givenAmount);
        if (emp) {
            asterisk.setText("*");
            return "";
        } else {
            double number = Double.parseDouble(givenAmount.getText().toString());
            asterisk.setText("");
            asterisk2.setText("");
            return Double.toString(Percent.calcPercent(number, givenPercent));

        }
    }
}



