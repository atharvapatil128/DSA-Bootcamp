//Write a program to print whether a number is even or odd, also take input.
package com.company;
import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
    }
}