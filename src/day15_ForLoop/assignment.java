package day15_ForLoop;

import java.util.Scanner;

/*
 write a program to identify if a string is palindrome
 or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
 */
public class assignment {
    public static void main(String[] args) {
        Scanner inpute = new Scanner (System.in);
        System.out.println("Enter your word:");
        String word = inpute.nextLine();
        String nweWord= "";

        for (int i= word.length()-1; i >=0; i--){
            nweWord += word.charAt(i);
        }
        if (nweWord.equals(word)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }


    }
}
