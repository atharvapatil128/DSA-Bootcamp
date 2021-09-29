//Input a number and print all the factors of that number
package com.company;
import java.util.Scanner;
public class Factors {

    public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
    System.out.print("Enter the number: ");
    int num = in.nextInt();
    System.out.println("The factors of "+num+" are:");
    for(int i=1;i<=num;i++){
        if(num%i==0){
            System.out.println(i);
        }

    }

    }
}
