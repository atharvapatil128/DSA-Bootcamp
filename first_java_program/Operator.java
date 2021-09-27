//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.company;
import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a,b;
        double c=0;
        char o;
        System.out.print("Enter first the number: ");
        a = in.nextDouble();
        System.out.print("Enter the second number: ");
        b = in.nextDouble();
        System.out.print("Enter the operator: ");
        o = in.next().charAt(0);
        if(o == '+'){
            System.out.print("The addition of the numbers is: "+(a+b));
        }
        else if(o == '-')
        {
            System.out.print("The subtraction of the numbers is: "+(a-b));
        }
        else if(o == '*'){
            System.out.print("The multiplication of the numbers is: "+(a*b));
        }
        else if(o == '/'){
            System.out.print("The divison of the numbers is: "+(a/b));
        }
        else{
            System.out.print("Wrong input! Please try again.");
        }
    }
}
