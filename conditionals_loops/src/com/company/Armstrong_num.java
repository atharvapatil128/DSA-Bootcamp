//Armstrong Number In Java
package com.company;

import java.util.Scanner;
import java.lang.Math;
public class Armstrong_num {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int check = num;
        int n = num;
        int sum = 0;
        int rem = 0;
        int l = 0;
        while (n > 0) //loop to get the length
        {
            rem = n % 10;
            n = n / 10;
            l++;
        }
        while (num > 0) // to check if the number is an armstrong number or not
        {
            rem = num % 10;
            sum = sum + (int)(Math.pow(rem,l));
            num = num / 10;
        }
        System.out.println("After computing: "+sum);
        if(sum==check){
            System.out.print("The number is an Armstrong number.");
        }
        else{
            System.out.print("The number is not an Armstrong number.");
        }
    }
}