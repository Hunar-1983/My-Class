package src.day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class duplicate {
    public static void main(String[] args) {
 /*
  2. write a program that can return the duplicated objects from a an ArrayList of Integers
            Ex:
                list: {1,1,2,3,4,5,5}
                sout(list); ==> {1,1,5,5};
        Note: 1. DO NOT use any extra arrayList
              2. DO NOT use any loops
              3. DO NOT use any sort method
              4. Use predicate and collections methods only
   */

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        list1.removeIf(p ->  Collections.frequency(list1, p) == 1);
        System.out.println(list1);

    }
}
