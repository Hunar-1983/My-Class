package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fuulNmae = input.nextLine();
        System.out.println("your full name is: "+ fuulNmae);

        System.out.println("Enter your sentence: ");
        String sentence = input.nextLine();
        System.out.println("your sentence is: "+ sentence);

    }
}
