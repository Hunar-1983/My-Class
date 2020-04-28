package src.day30_ArrayList;

import java.util.ArrayList;

public class ArraysList_Methods2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
                 list.add("A");
                 list.add("B");
                 list.add("C");

        //list.remove(1);
        String str = "F";
        boolean r1 = list.remove(str);  // true (because this method return it boolean)
        boolean r2 = list.remove("A");
        System.out.println(list);
        System.out.println(r1);
        System.out.println(r2);


        list.clear();
        System.out.println(list);
        System.out.println(list.size());

        ArrayList<Integer> list2 = new ArrayList<>();
                    list2.add(1);
                    list2.add(1);
                    list2.add(2);
                    list2.add(3);
                // {1, 1, 2, 3, }
        int num1 = list2.indexOf(1);  // autoboxing
        System.out.println(num1);

       int num2 = list2.indexOf(100); //
        System.out.println(num2); // result will be negative number because this object is not exit inthe ArrayList

        int num3 = list2.indexOf(3);  // 3
        System.out.println(num3);
    }
}
