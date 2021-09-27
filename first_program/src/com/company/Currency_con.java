//Input currency in rupees and output in USD.
package com.company;
import java.util.Scanner;
import java.lang.Math;
public class Currency_con {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");
        double inr = in.nextDouble();
        double usd = inr/73.81;
        System.out.print("Enter the amount in USD is: "+(Math.round(usd*100.0)/100.0)+"$");
    }
}
