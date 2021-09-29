//Find Ncr & Npr
package com.company;
import java.util.Scanner;
public class Ncr_npr {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter N: ");
        int n=in.nextInt();
        System.out.print("Enter R: ");
        int r=in.nextInt();
        int diff = (n-r);
        int fact1=1,fact2=1,fact3=1;
        for(int i=1;i<=n;i++) //Factorial of N!
        {
            fact1 = fact1*i;
        }
        for(int i=1;i<=r;i++) //Factorial of R!
        {
            fact2 = fact2*i;
        }
        for(int i=1;i<=diff;i++) //Factorial of (N-R)!
        {
            fact3 = fact3*i;
        }
        System.out.println("nCr or Combinations = "+(fact1/(fact2*fact3)));
        System.out.println("nPr or Permutations = "+(fact1/fact3));

    }
}
