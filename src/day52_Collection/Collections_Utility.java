package src.day52_Collection;

import java.util.*;

public class Collections_Utility {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10, 9, 8, 7, 6, 5, 4));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

        System.out.println("===============================");

//  1. write a program that can remove the duplicates and print out in sorted order.

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(5,5,5,6,6,6,7,7,7,7,4,3,2,2,1,1,1));
        TreeSet<Integer> sorted = new TreeSet<>(nums); // coz there is a is relation we can input nums here
        nums = new ArrayList<>(sorted);
        System.out.println(nums);

        // or we can do it with this way: this way is shorter..
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.addAll(Arrays.asList(5,5,5,6,6,6,7,7,7,7,4,3,2,2,1,1,1));
            nums1 = new ArrayList<>(new TreeSet<>(nums1));
        System.out.println(nums1);

        System.out.println("=================================");

    // write the program that can remove the duplicates from the an array list and donot change the order.

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(6,6,6,6,5,5,5,4,4,4,4));
        list = new ArrayList<>( new LinkedHashSet<>(list));
        System.out.println(list);

        System.out.println("=================================");

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("A", "B", "C", "B", "D"));

        boolean result = Collections.frequency(letters, "A") == 1;
        System.out.println(result);

    }
}
