package src.OfficeHours.Practice_04_22_2020;

import src.Important.Array;

import java.util.Arrays;

public class return_Method2 {
    // write a return method that can return a second maximum number from an int array

    public static int secondNum (int [] str){
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
        int lasindex = str.length-1;

         return str[str.length-2];
    }


    public static void main(String[] args) {
        int [] arr = {100, 40, 500, 50, 30, 400, -5, -100};
        int n = secondNum(arr);
        System.out.println(n);

    }

}
