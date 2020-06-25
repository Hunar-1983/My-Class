package src.day53_Iterable_Maps;


import java.util.*;

public class Iterating_Collections2 {
    public static void main(String[] args) {

        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman",
                                    "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina")); // we want to remove all names which contains M && m;
        Iterator <String> it = names.iterator();
        while (it.hasNext()){
            if (it.next().toLowerCase().contains("m")){
                it.remove();
            }
        }
        System.out.println(names);

        System.out.println("============================");

        LinkedHashSet<String> students = new LinkedHashSet<>();
        students.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman",
                "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina")); // we want to remove all names which start with M && m;

        for (Iterator<String> I = students.iterator(); I.hasNext();  ){
            if (I.next().toLowerCase().startsWith("m")){
                I.remove();
            }
        }
        System.out.println(students);

        System.out.println("===========================================");

        LinkedHashSet<String> n = new LinkedHashSet<>();
        n.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman",
                "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina")); // we want to remove all names which start with M && m;
            n.removeIf(p -> p.toLowerCase().contains("m"));
        System.out.println(n);

        System.out.println("===========================================");

        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman",
                "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina"));
            T.removeAll(Arrays.asList("Mehmet", "Ozgur", "Mohammed"));
        System.out.println(T);

        System.out.println("===========================================");

        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList("Mehmet", "Mohammed", "Yucel", "Sha", "Ozgur", "Ahmet", "Osman",
                "Ozgur", "Ozgur", "Ozgur", "Ozgur", "Irina"));
        R.retainAll(Arrays.asList("Yucel", "Sha", "Ahmet")); // we wanna stay just those name for this task;
        System.out.println(R);

        System.out.println("===========================================");

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7));

        //here the task : Verify 5 , 6, 9, 8 are contained in the list;

        boolean result = list.containsAll(Arrays.asList(5,6,9,8));
        System.out.println(result);
        // or we can just pass our assertion like this :
        System.out.println(list.containsAll(Arrays.asList(5,6,9,8)));


    }
}
