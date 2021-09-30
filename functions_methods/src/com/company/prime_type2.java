//Write a function that returns all prime numbers between two given numbers.
package com.company;
import java.util.Scanner;

public class prime_type2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int a = in.nextInt();
        System.out.print("Enter the ending number: ");
        int b = in.nextInt();
        prime_series(a,b);
    }
    static void prime_series(int a,int b){
        int c=2;
        int f=0;
        if(a<=1 || b<=1 || a>b){
            System.out.println("\nEnter the numbers correctly.");
        }
        else{
            System.out.print("The prime numbers are: \n");
            for(int i=a;i<b;i++){
            while(c*c<i){
                if (i%c==0){
                    f++;
                }
                c++;
            }
            c=2;
            if(f==0){
               System.out.println(i);
            }
            f=0;

        }
    }

    }
}
