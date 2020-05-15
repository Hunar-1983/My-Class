package src.day40_Encapsulation;

public class Test {
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
       // System.out.println(  obj.SSN   ); we can not get the value of SSN coz it's private

        System.out.println(  obj.getSSN()  );

        // obj.SSN = 123456;
        obj.setSSN(123456);
        System.out.println(obj.getSSN());
    }
}
