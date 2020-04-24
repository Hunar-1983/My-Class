package day14_StruingClass;

import java.util.Scanner;

/*
Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
 */
public class combineTwoString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first words");
        String firstword = input.next();

        System.out.println("Enter the second word");
        String secondWord = input.next();

        String result = firstword.concat(secondWord).concat(secondWord).concat(firstword);
        System.out.println(result);

    }
}
