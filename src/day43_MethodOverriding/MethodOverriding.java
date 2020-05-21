package src.day43_MethodOverriding;

class Test{
     public void method(){
         System.out.println("Hunar");
     }
 }


public class MethodOverriding extends Test {

    public void method(){
        System.out.println("Roshna");
    }

    public static void main(String[] args) {

     Test obj1 = new Test();
     obj1.method();  // Hunar

    MethodOverriding obj2 = new MethodOverriding();
    obj2.method();  // Hunar

    }
}
