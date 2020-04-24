package day23_methods;

import javax.swing.plaf.IconUIResource;

/*
1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class UniqueValues {
    public static void main(String[] args) {

        String [] arr = {"A", "A", "B", "C", "C"};
        String result ="";

       for (int k = 0; k <=arr.length-1; k++) {

           int count2 = 0;
           for (int i = 0; i <= arr.length - 1; i++) {
               if (arr[i].equals(arr[k])){
                   count2++;
               }
           }
           if (count2 == 1) {
               System.out.println(arr[k]);
           }
       }
        System.out.println("======================");



// solution 2
        for (String each2 : arr){
            int count = 0;
            for (String each : arr){
                if (each.equals(each2)){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(each2);
            }
        }

    }
}
