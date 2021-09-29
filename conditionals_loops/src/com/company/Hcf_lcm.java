//HCF & LCM program
package com.company;

import java.util.Scanner;

public class Hcf_lcm {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int hcf=0;
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        for(int i = 1;i<=a || i<=b;i++)
        {
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        System.out.print("The HCF is "+hcf);
        System.out.print("\nThe LCM is "+(a*b/hcf));

    }
}
