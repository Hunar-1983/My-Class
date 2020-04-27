package My_Practice;

import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        // divide two number without using Division or Remainder
        int a = 10;
        int b = 3;
        int count = 0;
        while (a >= b) {
            a -= b;
            count++;
        }
        if (a == 0) System.out.println("result is " + count);
        else System.out.println("result is " + count + " with remainder " + a);

        System.out.println("++++++++++++++++++++++++++++");                   // Reverse

        String str = "Hunar Hama Rashid Mohammad";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println(rev);
        System.out.println("++++++++++++++++++++++++++++");         // Palindrome

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (str.equalsIgnoreCase(reverse)) System.out.println("palindrome");
        else System.out.println("is not palindrome");

        System.out.println("++++++++++++++++++++++++++++");                 // remove Duplicate

        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains(str.charAt(i) + "")) {
                nonDup += str.charAt(i);
            }
        }
        System.out.println(nonDup);
        System.out.println("++++++++++++++++++++++++++++");                 // Frequency

        String nondup = "";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!nondup.contains(str.charAt(i) + "")) {
                nondup += str.charAt(i);
            }
        }
        for (int i = 0; i < nondup.length(); i++) {
            int count2 = 0;
            for (int k = 0; k < str.length(); k++) {
                if (nondup.charAt(i) == str.charAt(k)) {
                    count2++;
                }
            }
            result += nondup.charAt(i) + "" + count2;
        }
        System.out.println(result);

        System.out.println("++++++++++++++++++++++++++++");                 // Unique

        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            int count1 = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(i) == str.charAt(k)) {
                    count1++;
                }
            }
            if (count1 == 1) {
                unique += str.charAt(i);
            }
        }
        System.out.println(unique);

        System.out.println("++++++++++++++++++++++++++++");                 // Average  number in array

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int average = 0;
        int sum = 0;
        for (int each : array) {
            sum += each;
        }
        average = sum / array.length;
        System.out.println(average);

        System.out.println("++++++++++++++++++++++++++++");                 // Odd number or Even number
        int num =0;
        for (int i = 0; i < array.length; i++) {
            num = array[i];
            if (num % 2 == 0){
               // continue;
                System.out.print(num + " ");
            }else
               // System.out.print(num+" ");
             continue;
        }
        System.out.println();

        System.out.println("++++++++++++++++++++++++++++");                 // Shortest or Longest String

        String [] word = {"aple", "orange"};
        String longest = "";
        String shortest="";
        int ShortestNum =word[0].length();
        int LongestNum =word[0].length();

        for (int i =0; i < word.length; i++){

        if (word[i].length() <= ShortestNum){
            ShortestNum = word[i].length();
            shortest = word[i];
        }
        if (word[i].length() >= LongestNum) {
            LongestNum = word[i].length();
            longest = word[i];
        }

    }
        System.out.println(shortest);
        System.out.println(longest);

        System.out.println("++++++++++++++++++++++++++++");                 // descending number

        int[] arra = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] descen = new int[arra.length];
        Arrays.sort(arra);
        int k = arra.length-1;
        for (int i = 0; i <= arra.length-1; i++){
            descen[k] = arra[i];
            k--;
        }
        System.out.println(Arrays.toString(descen));

        System.out.println("++++++++++++++++++++++++++++");                 // count words in array

        String [] word1 = {"hunar", "roshna", "Hama rashid", "mahmod", "hasti"};
         int number = 0;
        for (String each : word1){
            if (each.contains("h"))
            number++;
        }
        System.out.println(number);

        System.out.println("++++++++++++++++++++++++++++");                 // reverse an array

        String [] word2 = {"hunar", "roshna", "Hama rashid", "mahmod", "hasti"};
        String [] reverse1 = new String[word2.length];
        int j = word2.length-1;
        for (int i=0; i < word2.length; i++){
        reverse1[j] = word2[i];
        j--;
        }
        System.out.println(Arrays.toString(reverse1));

        System.out.println("++++++++++++++++++++++++++++");                 // unique in array

        String ch [] = {"AAABBBCC", "ABBCC", "AAABBBCC"};
        String unique1 = "";
        for (String each : ch){
            int count1 = 0;
        for (String each1: ch) {
            if (each == each1) {
                count1++;
            }
        }
            if (count1 == 1) {
                unique1 += each;
            }

        }
        System.out.println(unique1);

    }
}