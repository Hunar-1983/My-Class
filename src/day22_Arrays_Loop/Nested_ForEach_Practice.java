package src.day22_Arrays_Loop;
/*
int[][] numbers = {
                            {1,2,3},
                            {4,5,6,7,8,9},
                            {10,11,12,13,14},
                            {15,16,17,18,19,20,21}
                          };
        // 1. print all even numbers ina same line
        // 2. count odd numbers ==> return the total odd number
 */
public class Nested_ForEach_Practice {
    public static void main(String[] args) {

        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}       };
            int oddNumber = 0;
            int sumEven = 0;
            int sumOdd = 0;
            for (int [] each1 : numbers){
                for (int each2 : each1){
                    if (each2 % 2 == 0){
                        sumEven += each2;
                    } else {
                        sumOdd += each2;
                        oddNumber++;
                    }
                }
            }
        System.out.println("Sum of Even is: "+sumEven);
        System.out.println("Sum of Odd is: "+sumOdd);
        System.out.println(oddNumber);

    }
}
