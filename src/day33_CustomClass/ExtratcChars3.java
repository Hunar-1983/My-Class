package src.day33_CustomClass;

import src.Important.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtratcChars3 {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";

                char [] arr  = str.toCharArray();
                Character [] ch = new Character [arr.length]; // we declared this array because we need to object not primitive
                for (int i = 0; i < arr.length; i++){
                    ch[i] = arr[i];
                }
        ArrayList<Character> letters = new ArrayList<>(Arrays.asList(ch));
        letters.removeIf( p -> !Character.isLetter(p)); // is
        System.out.println(letters);

        ArrayList<Character> digits = new ArrayList<>(Arrays.asList(ch));
            digits.removeIf( p -> !Character.isDigit(p));
        System.out.println(digits);

        ArrayList<Character> specialChars = new ArrayList<>(Arrays.asList(ch));
            specialChars.removeAll(letters);
            specialChars.removeAll(digits);
           // specialChars.removeIf( p -> !Character.isLetter(p) || !Character.isDigit(p)); we can do it in this way also;
        System.out.println(specialChars);

    }
}
