package src.day19_Arrays;


/*
1. write a program that can return the unique characters from a string
		Ex:  "AABCC" ==> "B"
 */
public class Unique {
    public static void main(String[] args) {
        String word = "AABCC";
        String result = ""; // "B"
        int lastIndext = word.length()-1;

        for (int j = 0; j <= lastIndext; j++) {
            char ch2 = word.charAt(j);
            int count = 0;   //

            for (int i = 0; i <= lastIndext; i++) {
                char ch = word.charAt(i);
                if (ch == ch2) {
                    count++;
                }
            }
            if (count == 1) { // if the character at index j is occured in the string
                result += word.charAt(j);
            }

        }

        System.out.println(result);

    }
}
