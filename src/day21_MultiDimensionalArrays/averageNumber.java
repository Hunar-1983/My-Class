package src.day21_MultiDimensionalArrays;

public class averageNumber {
    public static void main(String[] args) {
/*
1. write a program that can return the average number from an array of integers
			ex:
				[1,2,3]
				average: 2
				[10, 15, 5, 6]
				average: 9
				[4, 5, 6, 7, 8, 10, 20, 30, 0]
				average: 10
 */
        double[] arr = {4, 5, 6, 7, 8, 10, 20, 30, 0};  //5, 10
        // average: sum of all numbers / length

        int length = arr.length; // total number of the elements
        double sum = 0;

        for(int i = 0; i < length; i++  ){
            double eachNum =  arr[i];
            sum +=  eachNum;
        }

        System.out.println(sum);

        double average = sum/length;

        System.out.println(average);

        /*
                [2,1,3] ==> 6
                [1,2,3] ==> 6
         */

/*
        int[] arr2 = {1,2,2}; // 5/3 =
        System.out.println( 5/3 );
        System.out.println( 5/(double)3);
*/
    }
}
