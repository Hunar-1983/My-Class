package src.My_Practice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class one {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int sum0 = 0;
        for (int i = 0; i < a[0].length; i++) {
            sum0 += a[0][i];
        }
        int sum1 = 0;
        for (int i = 0; i < a[1].length; i++) {
            sum1 += a[1][i];
        }
        int sum2 = 0;
        for (int i = 0; i < a[2].length; i++) {
            sum2 += a[2][i];
        }
        int sum3 = 0;
        for (int i = 0; i < a[3].length; i++) {
            sum3 += a[3][i];
        }
        int [] number = {sum0, sum1, sum2, sum3};
        
        System.out.println(Arrays.toString(number));

    }
}
