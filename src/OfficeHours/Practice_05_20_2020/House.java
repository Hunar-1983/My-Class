package src.OfficeHours.Practice_05_20_2020;

public class House {
    public static void main(String[] args) {
/*
Dog dog1 = new Dog();
        dog1.name = "asg";
        dog1.age = 2;
        dog1.breed = "Husky";
        dog1.color = "White";
        dog1.size = "Big";
        dog1.bark();
        dog1.drink("Water");
        dog1.eat("food");
        dog1.sleep(" his house");
        System.out.println(dog1);
 */
        Dog dog1 = new Dog("Karabas",5,"black","large","Husky");
        System.out.println(dog1);

        Dog dog2 = new Dog("Rindik", 5, "White", "Huge","Kangal");
        System.out.println(dog2);
        dog2.bark();

        Cat cat1 = new Cat("Muffin",7,"white","medium","Ragdoll");
        System.out.println(cat1);
        cat1.scratch();

        Bunny bunny1 = new Bunny("Bug",3,"white","small","tiny");
        System.out.println(bunny1);
        bunny1.dig();


    }
}
