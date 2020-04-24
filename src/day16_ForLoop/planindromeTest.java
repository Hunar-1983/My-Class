package src.day16_ForLoop;

import java.util.Scanner;

public class planindromeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        String reverseWord = "";
        for (int i = word.length()-1; i >=0; i--){
           reverseWord +=word.charAt(i);
        }
        System.out.println(reverseWord);
        if (word.equalsIgnoreCase(reverseWord)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
