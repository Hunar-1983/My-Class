package src.OfficeHours.Practice_05_27_2020;

public class methodOverriding {
    public void method1(){
        System.out.println("Super Class");
    }
}
 class Test extends methodOverriding{
    // Sub               Super

     public void method1(){
        System.out.println("Sub Class");
     }

     public static void main(String[] args) {
        Test obj = new Test();
        obj.method1();
     }
}
