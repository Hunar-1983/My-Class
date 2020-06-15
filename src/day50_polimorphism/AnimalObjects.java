package src.day50_polimorphism;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog obj1 = new Dog("Lucy", 5, "Female");   // we create an object by using Dog reference
        System.out.println(obj1.dogName);
        obj1.bark();

        Animal obj2 = new Dog("Kito", 6, "Female"); // we create an object by using Animal reference
       // System.out.println(obj2.dogName); // we con not called dogName here because our reference to the obj2 is parent class not Dog class
        // obj2.bark(); also we con not call bark method here and the reason is same with above!

        obj2.eat();  // but for METHODS when we call methods if this methods overriding it will call overriding one by default!!
        obj2.methodA();

        Animal animal1 = new Cat("A","F", 1);

        boolean isCat = animal1 instanceof Cat;
        System.out.println(isCat);

        Dog d1 = new Dog("A",1,"f");

        // boolean r1 = d1 instanceof Cat; // there is no IS A relation between dog and cat

        Animal animal2 = new Cat("Q","f",2);

        boolean r2 = animal2 instanceof Dog;

        System.out.println(r2);


    }
}
