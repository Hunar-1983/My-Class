package src.day13_StringClass;

public class StringLiterals {
    public static void main(String[] args) {
        String str1 = "Cat"; // String pool
        String str2 = new String("cat"); // java heap
        System.out.println(str1+" : "+str2);

        System.out.println(str1 == str2); // two different object, false

        String str3 = "cat"; // // String pool
        System.out.println(str1 == str3); // true,

        String str4 = new String("cat");
        System.out.println(str2 == str4); // false because those are two independent object.
    }
}
