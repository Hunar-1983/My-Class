package src.day22_Arrays_Loop;

import java.util.Arrays;

/*
    2. write a program that sort the array in descending order
 */
public class Descending {
    public static void main(String[] args) {
        int [] arr = {10, 78, 2, -1, 500, 70};
         Arrays.sort(arr); // sorts in ascening order
        System.out.println(Arrays.toString(arr));

        int [] reversearr = new int [arr.length];
        int j = arr.length-1;
        for (int i = 0; i <= arr.length-1; i++){
            reversearr[i] = arr[j];
            j--;
        }
        System.out.println(Arrays.toString(reversearr));
    }
}
