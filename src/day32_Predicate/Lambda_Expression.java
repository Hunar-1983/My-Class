package src.day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {

        Predicate<Integer> oddNumber = x -> x % 2 != 0; // our Predicate to remove odd number, and (x) is represented numbers and can be any letter;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2, 3, 4, 5, 6, 7,8, 9, 10));
        list.removeIf(oddNumber);
        System.out.println(list);

        System.out.println("+++++++++++++++++++++++++++++++++++++++");

        Predicate<Integer> lesThan5 = Y -> Y < 5;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list2.removeIf(lesThan5);
        System.out.println(list2);

        System.out.println("++++++++++++++++++++++++++++++++++++++");

        ArrayList<String > names = new ArrayList<>();
        names.addAll(Arrays.asList("Hunar", "Rahman", "Adil", "Barzi", "Hardi"));
        Predicate<String> startWH = x -> x.startsWith("H");
        names.removeIf(startWH);
        System.out.println(names);
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        ArrayList<String > nameList = new ArrayList<>();
        nameList.addAll(Arrays.asList("Muhtar", "Alex", "Asiya", "Dilnaz", "Radu"));
        Predicate<String> s = x -> x.startsWith("M") || x.startsWith("A");
        nameList.removeIf(s);

        System.out.println(nameList);

        System.out.println("+++++++++++++++++++++++++++++=");


        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('A', 'B', '3', '4', '5', '@', '&', 'Z'));
      //  Predicate<Character> digits = c -> c >= 48 && c <= 57; // depends on ascyTable
        Predicate<Character> digits = c -> Character.isDigit(c);

        chars.removeIf(digits);
        System.out.println(chars);

        System.out.println("++++++++++++++++++++++++++++++++++");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1, 2,3 , 4, 5, 6, 7, 8, 9));
        Predicate<Integer> a = x -> x > 5;
        // nums.removeIf(x -> x > 5);   it's also we can use it;

        nums.removeIf(a);
        System.out.println(nums);


    }
}
