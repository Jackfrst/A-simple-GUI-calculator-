package com.Calculaterlab;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

import static com.Calculaterlab.Body.*;

public class Process {

    static void addition(int num1, int num2 ,String choice )
    {
        int result = num1 + num2;
        result1(num1,num2,result,choice);
    }

    static void subtraction(int num1, int num2,String choice)
    {
        int result = num1 - num2;
        result1(num1,num2,result,choice);
    }

    static void multiplication(int num1, int num2,String choice)
    {
        int result = num1 * num2;
        result1(num1,num2,result,choice);
    }

    static void division(int num1, int num2,String choice)
    {
        double result = (double) num1 / num2;
        result1(num1,num2,result,choice);

    }

    // result

    static void result1(int num1,int num2,double result,String choice)
    {
        showMessageDialog(null,"The 1st number you enter :  "+ num1 +"\n\nThe 2nd number you enter : "+ num2 +"\n\nThe Equation is : "+num1+" "+choice+" "+num2+" = "+result+ "\n\nThe result is :   " + result+"\n\n");
        int option =JOptionPane.showConfirmDialog(null,"Do you want to calculate again ??");

        switch (option)
        {
            case 0:Body();break;
            default:JOptionPane.showMessageDialog(null," !!!  Thank You For Using the services  !!!");
        }
    }
}
