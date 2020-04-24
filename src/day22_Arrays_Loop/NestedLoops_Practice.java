package src.day22_Arrays_Loop;

public class NestedLoops_Practice {
    public static void main(String[] args) {

        int [][] numbers = {  {1,2,3},
                              {4,5,6,7,8,9},
                              {10,11,12,13,14},
                              {15,16,17,18,19,20,21}};

        int oddNumber = 0;
        for (int k = 0; k <= numbers.length-1; k++) {
            for (int i = 0; i <= numbers[k].length - 1; i++) {
                int b = numbers[k][i];
                if (b % 2 == 0) {
                    System.out.print(b+" ");
                } else {
                       oddNumber++;
                }
            }
        }
        System.out.println();
        System.out.println(oddNumber);
    }
}
