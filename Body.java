package com.Calculaterlab;

import javax.swing.*;
import java.util.Scanner;

import static com.Calculaterlab.Process.*;
import static com.Calculaterlab.Process.division;

public class Body {



    static public void Body() {

        JOptionPane.showMessageDialog(null, "What do you want to do ?\n\n"
                + "Press   +   for addition \n\n" + "Press   -   for subtraction \n\n" + "Press   *   for Multiplication \n\n" + "Press   /   for Division \n\n");

        String choice = JOptionPane.showInputDialog(null, "Press your choice ");

        JOptionPane.showMessageDialog(null, " Enter Two numbers ");
        int num1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The 1st Number : "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter The 2nd Number : "));


        switch (choice) {
            case "+":
                addition(num1, num2, choice );
                break;
            case "-":
                subtraction(num1, num2,choice);
                break;
            case "*":
                multiplication(num1, num2,choice);
                break;
            case "/":
                division(num1, num2,choice);
                break;
            default:
                System.out.println("Invalid Input Please  try again ");
        }

    }
}
