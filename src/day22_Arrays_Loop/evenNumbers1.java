package src.day22_Arrays_Loop;

import java.util.Arrays;

/*
 Task01:
        1. create an int array called numbers that has length of 100
        2. assign 1~100 to the array' each indexes
        3. use for each loop to rpint out all the even numbers.
                MUst use continue statement
 */
public class evenNumbers1 {
    public static void main(String[] args) {
        int numbers [] = new int [100];
        for (int i = 0; i <= numbers.length-1; i++) {
            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));
        for ( int each : numbers){
            if (each % 2 != 0){
                continue;
            }
            System.out.print(each+" ");
        }




    }
}
