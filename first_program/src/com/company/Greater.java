//Take 2 numbers as input and print the largest number.
package com.company;
import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first the number: ");
        double a = in.nextDouble();
        System.out.print("Enter second the number: ");
        double b = in.nextDouble();
        if(a>b){
            System.out.print("The first number or "+a+" is greater.");
        }
        else if(b>a){
            System.out.print("The second number or "+b+" is greater.");
        }
        else{
            System.out.print("The numbers are equal.");
        }
    }
}
