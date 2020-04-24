package src.day20_ArraysContinue;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_Chart {
    public static void main(String[] args) {
        String  myName = "Hunar";
        char [] characters = myName.toCharArray();

        System.out.println(Arrays.toString(characters));

        System.out.println("=====================");
        String str1 = "Cybertek School";
        String str2 = "School Cybertek";

        char [] ch1 = str1.toCharArray();
        char [] ch2 = str2.toCharArray();

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean equalStr = Arrays.equals(ch1, ch2);

        System.out.println(equalStr);
    }
}
