package src.day43_MethodOverriding;

public class CarShop {
    public static void main(String[] args) {

        Tesla tesla1 = new Tesla();
        tesla1.start();
        System.out.println("=========================");

        Honda honda1 = new Honda();
        honda1.start();
        System.out.println("=========================");

        Jeep jee1 = new Jeep();
        jee1.start();
    }
}
