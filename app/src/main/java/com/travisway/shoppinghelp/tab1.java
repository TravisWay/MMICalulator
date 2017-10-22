package com.travisway.shoppinghelp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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

        cal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean emp = Empty.Emp((EditText) input);
                boolean emp1 = Empty.Emp((EditText) cusPer);
                if (emp) {
                    input.setText("Required");
                } else if (emp1) {
                    cusPer.setText("Required");
                } else {
                    double number = Double.parseDouble(input.getText().toString());
                    double per = Double.parseDouble(cusPer.getText().toString());
                    per = per / 100;
                    answer.setText(Percent.calcPercent(number, per) + "");
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                input.setText("");
                cusPer.setText("");
                answer.setText("");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            answer.setText(Percentage(input, .05)+"");
            }});
        ten.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .10)+"");
            }});
        fifteen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .15)+"");
            }});
        twenty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .20)+"");
            }});
        twentyfive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .25)+"");
            }});
        thirty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .30)+"");
            }});
        thirtyfive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .35)+"");
            }});
        forty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer.setText(Percentage(input, .40)+"");
            }});


        return InputFragmentView;
    }
    public static double Percentage (EditText givenAmount, double givenPercent){
        boolean emp = Empty.Emp((EditText) givenAmount);
        if (emp) {
            givenAmount.setText("Required");
            return 0;
        } else {
            double number = Double.parseDouble(givenAmount.getText().toString());
            return Percent.calcPercent(number, givenPercent);

        }
    }
}



