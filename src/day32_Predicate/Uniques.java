package src.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// write a program that can return objects from arrayList of characters.
public class Uniques {
    public static void main(String[] args) {

        Character [] chars = {'A', 'A', 'B', 'C', 'D', 'D'};
        ArrayList<Character> charList = new ArrayList<>();
        charList.addAll(Arrays.asList(chars));
        System.out.println(charList);

        ArrayList<Character> result = new ArrayList<>(); // to store unique objects at the last

       /* for (Character each : charList) {
            int count = Collections.frequency(charList, each); // we used frequency method to count the unique element an it returns it int, their for we re-signed in the int variable.
            if (count == 1) { // if element comes in the arrayList one time.
                result.add(each); // add each unique characters to result ArrayLIst;
            }
        }
        System.out.println(result);
*/
        for (int i = 0; i < charList.size(); i++) {
            int count = Collections.frequency(charList, charList.get(i)); // we used frequency method to count the unique element an it returns it int, their for we re-signed in the int variable.
            if (count == 1) { // if element comes in the arrayList one time.
                result.add(charList.get(i)); // add each unique characters to result ArrayLIst;
            }
        }
        System.out.println(result);
    }
}
