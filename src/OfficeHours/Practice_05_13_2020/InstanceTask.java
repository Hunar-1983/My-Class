package src.OfficeHours.Practice_05_13_2020;


public class InstanceTask {
    public static void main(String[] args) {
        Instances obj1 = new Instances();
        obj1.name = "Muhtar";
        Instances obj2 = new Instances();
        obj2.name = "Kuzzat";

        System.out.println(obj1.name);  // Muhtar
        System.out.println(obj2.name);  // Kuzzat

        obj1.printName(); // Muhtar
        obj2.printName(); // Kuzzat

    }
}

class InstanceBlock{
    public static void main(String[] args) {
        Instances obj1 = new Instances();

        System.out.println( obj1.name   );
    }
}
