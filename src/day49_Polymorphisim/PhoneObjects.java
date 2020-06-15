package src.day49_Polymorphisim;

public class PhoneObjects {
    public static void main(String[] args) {

        iphone phone1 = new iphone("iphone X pro",1000.50, "10 inches");
        System.out.println(phone1);
        phone1.calling(911);
        phone1.texting(911);
        phone1.faceTiming(911);
        phone1.selfie();
        phone1.downloadable();
    }
}
