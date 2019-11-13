package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int addDigit0=0;
    private int addDigit1=1;
    private int addDigit2=2;
    private int addDigit3=3;
    private int addDigit4=4;
    private int addDigit5=5;
    private int addDigit6=6;
    private int addDigit7=7;
    private int addDigit8=8;
    private int addDigit9=9;
    private String inputOnScr="";
    private String inputOnScr2="";
    private double result=0;
    private double var1=0;
    private double var2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayInput(String input) {
        TextView scoreView = (TextView) findViewById(R.id.show_input);
        scoreView.setText(input);
    }

    public void displayResult(String result) {
        TextView scoreView = (TextView) findViewById(R.id.show_result);
        scoreView.setText(result);
    }

    public void addZero(View view) {
        inputOnScr=inputOnScr+addDigit0;
        displayInput(inputOnScr);
    }

    public void addOne(View view) {
        inputOnScr=inputOnScr+addDigit1;
        displayInput(inputOnScr);
    }

    public void addTwo(View view) {
        inputOnScr=inputOnScr+addDigit2;
        displayInput(inputOnScr);
    }

    public void addThree(View view) {
        inputOnScr=inputOnScr+addDigit3;
        displayInput(inputOnScr);
    }

    public void addFour(View view) {
        inputOnScr=inputOnScr+addDigit4;
        displayInput(inputOnScr);
    }

    public void addFive(View view) {
        inputOnScr=inputOnScr+addDigit5;
        displayInput(inputOnScr);
    }

    public void addSix(View view) {
        inputOnScr=inputOnScr+addDigit6;
        displayInput(inputOnScr);
    }

    public void addSeven(View view) {
        inputOnScr=inputOnScr+addDigit7;
        displayInput(inputOnScr);
    }

    public void addEight(View view) {
        inputOnScr=inputOnScr+addDigit8;
        displayInput(inputOnScr);
    }

    public void addNine(View view) {
        inputOnScr=inputOnScr+addDigit9;
        displayInput(inputOnScr);
    }

    public void addPlus(View view) {
        inputOnScr=inputOnScr+"+";
        displayInput(inputOnScr);
    }

    public void addMinus(View view) {
        inputOnScr=inputOnScr+"-";
        displayInput(inputOnScr);
    }

    public void addMul(View view) {
        inputOnScr=inputOnScr+"*";
        displayInput(inputOnScr);
    }

    public void addDiv(View view) {
        inputOnScr=inputOnScr+"/";
        displayInput(inputOnScr);
    }

    public void clear(View view) {
        this.var1=0;
        this.var2=0;
        inputOnScr="";
        displayInput(inputOnScr+"0");
        displayResult(inputOnScr);
    }


    public void addEql(View view) {
        displayResult(getResult()+"");
    }


    public double getResult() {
        String str[] = {"+", "-", "/", "*"};
        for (int i = 0; i < 4; i++) {
            if (inputOnScr.contains(str[i])) {
                int indexOfOpr = inputOnScr.indexOf(str[i]);
                this.var1 = Integer.parseInt(inputOnScr.substring(0, indexOfOpr));
                this.var2 = Integer.parseInt(inputOnScr.substring(indexOfOpr + 1));
            }
        }

        if (inputOnScr.contains("+")) {
            return result = var1 + var2;
        } else if (inputOnScr.contains("-")) {
            return result = var1 - var2;
        } else if (inputOnScr.contains("*")) {
            return result = var1 * var2;
        } else if (inputOnScr.contains("/")) {
            return result = var1 / var2;
        } else {

            return this.result;
        }
    }
}
