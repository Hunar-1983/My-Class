package src.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        int max = Collections.max(list);
        System.out.println(max);

        int min = Collections.min(list);
        System.out.println(min);

        /*
        write a program that can return second maximum from ArrayList;
        EX : {1, 2, 3, 4, 5, 6, 7, 8,8}
        output: 7
        write a program that can return second minimum from ArrayList;
        EX : {1, 1, 2, 3, 4, 5, 6, 7, 8}
        output: 2
         */
    ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 5, 3, 4, 8, 7, 6, 8));
        Collections.sort(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        for (Integer each : list1){
            if (!list2.contains(each)){
                list2.addAll(Arrays.asList(each));
            }
        }
        int secondMax = list2.get(list2.size()-2);
        System.out.println(secondMax);

        int secondMin = list2.get(1);
        System.out.println(secondMin);

        System.out.println("================================="); // second way to solve
        ArrayList<Integer> numbers = new ArrayList<>( Arrays.asList(1,1,2,3,4,4));
        // second max: 3

        Integer maxNum = Collections.max(numbers);  //4

        numbers.removeAll( Arrays.asList(maxNum) );

        System.out.println(numbers);


        int secondMaxx= Collections.max(numbers) ;

        System.out.println(secondMaxx);

        System.out.println("========================================");
        ArrayList<Integer> liste2 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,7,8));
        Integer minNum = Collections.min(liste2); //1

        list2.removeAll( Arrays.asList( minNum ) );  // removes all the minimum number
        System.out.println(liste2);

        int secondMinn = Collections.min(liste2);
        System.out.println(secondMinn);

        System.out.println("+++++++++++++++++++++++++");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1, 2, 3, 4, 5)); // {1,2,3,4,5}
        System.out.println(list3);
        Collections.swap(list3, 0, 4);          // {5,2,3,4,1}
        System.out.println(list3);

        System.out.println("+++++++++++++++++++++++++");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1, 1, 1, 2, 3, 4, 5));
        System.out.println(list4);
        Collections.replaceAll(list4, 1, 10);
        System.out.println(list4);
        System.out.println("+++++++++++++++++++++++++");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("omer", "omer", "omer", "sha", "Fatih", "omer"));
        System.out.println(names);
        Collections.replaceAll(names, "omer", "hunar");
        System.out.println(names);

    }
}

