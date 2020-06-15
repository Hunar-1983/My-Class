package src.day50_polimorphism;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        int a = 100;
        double b = a;  // here the casting is implicitly done;

        Dog dog = new Dog("lucy", 1, "f");
        Animal animal1 = dog;

        Cat cat = new Cat("a", "f", 1);
       // Dog dog2 = (Cat) cat;   // we can not casting cat into dog coz there is no is relation;

        Animal animal2 = (Animal) cat; // here the casting is implicitly done, we don't need to do it manually;

        System.out.println("=============================================");

        double c = 10;
        int d = (int) c; // here we did explicit casting and it need to do manually;

        Animal animal3 = new Dog("A", 12, "F");
        Dog dog3 = (Dog) animal3;  // down casting, MUST be done MANUALLY

        Animal animal4 = new Cat("C", "female", 7);

        Cat cat2 = (Cat) animal4;  // down casting, MUST be done MANUALLY

        System.out.println("=============================================");

        Animal animal5 = new Dog("LL", 3, "female");
       // animal5.bark(); // we can not call bark method coz reference decide what is visible an call it;
       // first way
        Dog dog2 = (Dog) animal5;
        dog2.bark();  // here we can call bark method coz we did casting into Dog class;
        // second way :
        ((Dog) animal5).bark(); // here we are doing grouping with out declar any new variable like first way;

    }
}
