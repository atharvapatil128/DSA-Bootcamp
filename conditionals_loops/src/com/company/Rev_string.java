//Reverse A String In Java
package com.company;
import java.util.Scanner;
public class Rev_string {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the string to be reversed: ");
        String word = in.nextLine();
        String rev = "";
        int len = word.length()-1;
        for(int i=0;i<=len;i++){
         char c = word.charAt(len-i);
         rev = rev.concat(Character.toString(c));
        }
        System.out.print("The reversed string is: "+rev);


    }
}
