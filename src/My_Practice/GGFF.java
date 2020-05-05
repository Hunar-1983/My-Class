package src.My_Practice;
/*


4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
			ex:
				str = "ABCD123$%#@&456EFG!";
				list1: {$, %, #, @, &, !}
				list2: {A, B, C, D, E, F, G}
				list3: {1, 2, 3, 4, 5, 6}

 */

import java.util.*;
import java.util.function.Predicate;

public class GGFF {
    public static void main(String[] args) {
/*
. write a program that can return the unique objects from a anArray List of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {2,3,4};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. do not use any sort method
			  4. use predicate only and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency == 1)  can keep the unique objects in arrayList
 */
        ArrayList<Integer> list = new ArrayList<> ();
        list.addAll(Arrays.asList(1,1,2,3,4,5,5));

       Predicate <Integer> unique = x -> Collections.frequency(list, x) > 1;
       list.removeIf(unique);
        System.out.println(list);

        System.out.println("=================================");

        /*
        2. write a program that can return the duplicated objects from an ArrayList of Integers
			Ex:
				list: {1,1,2,3,4,5,5}
				sout(list); ==> {1,1,5,5};
		Note: 1. DO NOT use any extra arrayList
			  2. DO NOT use any loops
			  3. DO NOT use any sort method
			  4. Use predicate and collections methods only
		Hint:   Collections.frequency() // will return the frequency
				removeIf( frequency > 1)  can keep the duplicated objects in arrayList
         */

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,5));
        Predicate<Integer> dup = x -> Collections.frequency(list1, x) == 1;
        list1.removeIf(dup);
        System.out.println(list1);

        /*
        3. task:
			1. create an ArrayList of string called country names
			2. write a program that can remove all the country names that have length of 10 or greater
         */

        ArrayList<String> country = new ArrayList<>(Arrays.asList("Iraq", "United Kingdom", "United State", "Finland"));

        Predicate<String> remove = x -> x.length() >= 10 ;
        country.removeIf(remove);
        System.out.println(country);
    }

}