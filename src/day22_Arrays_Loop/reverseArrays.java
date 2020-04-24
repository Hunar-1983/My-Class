package src.day22_Arrays_Loop;

import java.util.Arrays;

/*
1. write a program that can reverse the array
 */
public class reverseArrays {
    public static void main(String[] args) {
    int [] arr = {1, 2, 3, 4, 5};

    for (int i = arr.length-1; i >= 0; i--){
        int num = arr [i];
        System.out.print(num+ " ");
    }
        System.out.println();

    int [] RevArr = new int [arr.length]; // [0, 0, 0, 0, 0]
   int j = arr.length-1;
    for (int i = 0; i <= arr.length-1; i++){
        RevArr [i] = arr[j];
        j--;
    }
        System.out.println(Arrays.toString(RevArr));



    }
}
