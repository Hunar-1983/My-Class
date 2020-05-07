package My_Practice;

import src.Important.Array;

import java.util.ArrayList;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {

       String str = "ABCD123$%#@&456EFG!";
       char [] arr = str.toCharArray();
        Character [] chars = new Character[arr.length];
        for (int i = 0; i < arr.length; i++){
            chars [i] = arr[i];
        }

        ArrayList<Character> letter = new ArrayList<>(Arrays.asList(chars));
        letter.removeIf( x -> !Character.isLetter(x));
        System.out.println(letter);

        ArrayList<Character> number = new ArrayList<>(Arrays.asList(chars));
        number.removeIf( p -> !Character.isDigit(p));
        System.out.println(number);

        ArrayList<Character> specialCharacter = new ArrayList<>(Arrays.asList(chars));
        specialCharacter.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(specialCharacter);
    }
}
