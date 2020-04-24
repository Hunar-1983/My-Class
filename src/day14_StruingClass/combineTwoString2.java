package day14_StruingClass;

import java.util.Scanner;

/*
Ask user to enter two words. Print first word without its first character then print the second word
without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana

 */
public class combineTwoString2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first word");
        String word1 = input.next();

        System.out.println("Enter your secnod word");
        String word2 = input.next();

        word1 = word1.substring(1);
         word2 = word2.substring(1);

         String result = word1.concat(word2);
        System.out.println(result);


    }
}
