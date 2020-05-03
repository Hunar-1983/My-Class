package src.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class duplicates2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A", "B", "A", "C", "D"));
        System.out.println(list);

        ArrayList<String> result = new ArrayList<>(); // to store all duplicates

        for (String each : list){
            int count = Collections.frequency(list, each);
            if (count > 1 ){
                if (result.contains(each)){
                    continue;
                }
                result.add(each);
        }

      }
        System.out.println(result);




    }
}
