package src.day35_Static;

public class StaticVariables {
    int a2 = 200;  // this one is instance variable

    static int a3 = 300;    // this one is static variable
    public static void main(String[] args) {
        int a =  100; // this one local variable

        StaticVariables obj1 = new StaticVariables();
            obj1.a2 = 1000;

            obj1.a3 = 4000; // static variable it has just one copy for all objects

        StaticVariables obj2 = new StaticVariables();
            obj2.a2 = 2000;
            obj2.a3 = 5000;


        System.out.println(obj1.a2);
        System.out.println(obj2.a2);



        System.out.println(obj1.a3); // 5000
        System.out.println(obj2.a3); // 5000   because it's static variable an this type just has one copy fo all objects

    }
}
