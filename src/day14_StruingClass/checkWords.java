package day14_StruingClass;

import java.util.Scanner;

/*
Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"

 */
public class checkWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = input.next();

        System.out.println("Enter second word");
        String word2 = input.next();

        System.out.println("Enter third word");
        String word3 = input.next();

        boolean allSame = word1.length() == word2.length() && word1.length() == word3.length();
        boolean twoSame1 = word1.length() == word2.length() || word1.length() == word3.length();
        boolean twoSame2 = word2.length() == word3.length() || word2.length() == word1.length();


        if (allSame){
            System.out.println("All words are same length");
        } else  if (twoSame1){
            System.out.println("Not Same nor Different lengths");
        } else if (twoSame2){
            System.out.println("Not Same nor Different lengths");
        } else {
            System.out.println("All different length");
        }

    }
}
