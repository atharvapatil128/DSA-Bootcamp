//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package com.company;
import java.util.*;
public class Max_min_3nums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double a = in.nextDouble();
        System.out.print("Enter the second number: ");
        double b = in.nextDouble();
        System.out.print("Enter the third number: ");
        double c = in.nextDouble();
        if (a == b && b == c) {
            System.out.println("The three numbers are equal.");
        } else {
            max(a, b, c);
            min(a, b, c);
        }
    }
    static void max(double a,double b,double c){
        double max=a;
        if (b>a) {
            max = b;
            if (c > b) {
                max = c;
            } else {
                max = b;
            }
        }
        else if(c>a){
            max = c;
            }
        System.out.println("The greatest number is: "+max);

        }
    static void min(double a,double b,double c){
        double min=a;
            if (b<a) {
                min = b;
                if (c < b) {
                    min = c;
                } else {
                    min = b;
                }
            }
            else if(c<a){
                min = c;
            }
            System.out.println("The smallest number is: "+min);

        }

    }

