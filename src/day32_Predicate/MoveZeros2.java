package src.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoveZeros2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
    // "Collections.frequency" is for finding zeros number in our list.
       int count = Collections.frequency(list, 0); // to finding zeros in the list and count it, then initialized in int variable.
        System.out.println(count);
        list.removeAll(Arrays.asList(0)); // to remove all zeros in the list

        for (int i =0; i < count; i++){
            list.add(0);
        }
        System.out.println(list);
    }
}
