package src.My_Practice;

import src.Important.Array;

import java.util.Arrays;

public class wewe {
    public static String[] reverse(String[] arr) {
        String [] arr1 = new String[arr.length];
        int k = arr.length-1;

        for (int i = 0; i < arr.length; i++){
            arr1[k] = arr[i];
            k--;
        }
        return arr1;
    }
    public static void main(String[] args) {
    String [] arr = {"apple", "pear"};

    String [] str = reverse(arr);
        System.out.println(Arrays.toString(str));

    }
}