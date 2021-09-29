//Take integer inputs till the user enters 0 and print the sum of all numbers
package com.company;

import java.util.Scanner;

public class Sum__of_allnums {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int num=-1;
        int sum=0;
        while(num!=0){
            System.out.print("Enter the number: ");
            num = in.nextInt();
            sum+=num;
        }
        System.out.print("The sum of all number is: "+sum);

    }
}
