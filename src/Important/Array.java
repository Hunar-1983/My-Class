package src.Important;

import java.util.Arrays;
/*
 ==> Descending an array;
 ==> count word in a String array;
 ==> reverse an int array ;
 */

public class Array {
    public static void main(String[] args) {
        int [] arr = {10, 78, 2, -1, 500, 70};  // Descending an array;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int [] descending = new int[arr.length];
        int k = arr.length-1;
        for (int i =0; i < arr.length; i++){
            descending[k] = arr[i];
            k--;
        }
        System.out.println(Arrays.toString(descending));

        System.out.println("++++++++++++++++++++++++++++");

        String sentence = "I like java and javascript and python"; // count word in a String array;
        String [] arr1 = sentence.split(" ");
        int count = 0;
        for (int i =0; i < arr.length; i++){
            if (arr1[i].contains("java")){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("++++++++++++++++++++++++++++");

        int [] arr2 = {1, 2, 3, 4, 5};   // reverse an int array ;
        int [] rev = new int[arr2.length];
        int h = arr2.length-1;
        for (int i =0; i < arr2.length; i++){
            rev [i] = arr2 [h];
            h--;
        }
        System.out.println(Arrays.toString(rev));

        System.out.println("++++++++++++++++++++++++++++");

        String [] arr3 = {"A", "A", "B", "C", "C"};
        String unique ="";

        for (String each : arr3){
            int count3 =0;
            for (String each2: arr3){
                if (each == each2){
                    count3++;
                }
            }
            if (count3 == 1){
                unique += each;
            }
        }
        System.out.println(unique);

    }
}
