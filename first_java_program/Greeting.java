//Take name as input and print a greeting message for that name.
package com.company;
import java.util.Scanner;
public class Greeting{

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    System.out.print("Enter your name: ");
    System.out.println("Have a nice day "+ in.next()+"!");

    }
}
