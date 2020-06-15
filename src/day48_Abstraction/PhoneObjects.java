package src.day48_Abstraction;

public class PhoneObjects {
    public static void main(String[] args) {

        iphone iphone1 = new iphone("X", 1000, "10 inches");
        iphone iphone2 = new iphone("8", 900, "8 inches");

        System.out.println(iphone1);
        System.out.println(iphone2);

        iphone1.faceTiming(540545454);
        iphone1.calling(540545454);
        iphone1.texting(540545454);

        System.out.println("===============================================");

        Samsung samsung1 = new Samsung("Note10 Plus", 1200, "Large");
        System.out.println(samsung1);

        samsung1.calling(540540555);
        samsung1.texting(540540555);
        samsung1.freezing();


    }
}
