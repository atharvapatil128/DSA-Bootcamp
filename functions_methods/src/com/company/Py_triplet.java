//Write a function to check if a given triplet is a Pythagorean triplet or not.
package com.company;
import java.util.*;
import java.lang.Math;
public class Py_triplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        System.out.print("Enter the second number: ");
        int c = in.nextInt();
        System.out.print("It is a Pythagorean triplet: "+triplet(a,b,c));
    }
    static boolean triplet(int a,int b,int c){
        int a2 = (int)(Math.pow(a,2));
        int b2 = (int)(Math.pow(b,2));
        int c2 = (int)(Math.pow(c,2));
        int ab = a2+b2;
        int bc = b2+c2;
        int ac = a2+c2;
        return (ab == c2 || bc == a2 || ac == b2);
    }
}


