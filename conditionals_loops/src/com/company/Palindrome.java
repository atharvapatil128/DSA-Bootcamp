//Find if a number is palindrome or not
package com.company;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int n = num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev = rev*10+rem;
            num = num/10;
        }
        System.out.println("After computing: "+rev);
        if (n==rev){
            System.out.print("The number "+n+" is a palindrome.");
        }
        else{
            System.out.print("The number "+n+" is a not palindrome.");
        }
    }
}
