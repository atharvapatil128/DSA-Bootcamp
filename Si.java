//Write a program to input principle, time, and rate (P, T, R) from the user and find Simple Interest.
package com.company;
import java.util.Scanner;
public class Si {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double p,r,t;
        double si=0;
        System.out.print("Enter the Principle amount: ");
        p = in.nextDouble();
        System.out.print("Enter the Rate of Intrest: ");
        r = in.nextDouble();
        System.out.print("Enter the Time: ");
        t = in.nextDouble();
        si = (p*r*t)/100;
        System.out.print("The Simple Intrest is: "+si);
    }
}
