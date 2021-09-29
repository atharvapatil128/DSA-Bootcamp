package com.company;

import java.util.Scanner;

public class Vovel_cons {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a string: ");
        String word = in.nextLine();
        int l = word.length();
        int v =0;
        int c =0;
        for(int i=1;i<=l;i++){
            if (word.charAt(i-1)== 'a' || word.charAt(i-1)== 'e' || word.charAt(i-1) == 'i' || word.charAt(i-1)== 'o' || word.charAt(i-1) == 'u'){
                v++;
            }
            else {
                c++;
            }
        }
        System.out.print("The number of vovels: "+v+"\nThe number of consonants are: "+c);
    }
}
