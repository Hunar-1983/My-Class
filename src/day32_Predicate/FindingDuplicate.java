package src.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

/*
write a program that can return the duplicated values from an ArrayList of String
		Ex:
			list: {"A", "B", "A", "C", "D"};
			output: ["A"]
			list: {"A", "B", "B", "C", "D", "D"};
			output: ["A", "C"]
 */
public class FindingDuplicate {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);

        ArrayList<String> duplicates = new ArrayList<>(); // to store our duplicate String

        for (int i =0 ; i < list.size(); i++){
            int count = 0;
            for (String each : list){
                if (each.equals(list.get(i))){ //
                    count++;
                }
            }
            if (count > 1 && !duplicates.contains(list.get(i))){ // if the frequency is greater than one, and it's not contained in duplicates yet, then we will add it to the duplicate.
                duplicates.add(  list.get(i)  );
            }
        }
        System.out.println(duplicates);

    }
}
