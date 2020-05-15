package resources;

import src.day40_Encapsulation.Encapsulation;

public class Encapsulations_Test {

    public static void main(String[] args) {

        Encapsulation obj = new Encapsulation();
       // obj.SSN = 1000;

      //  System.out.println(obj.SSN);

        System.out.println(  obj.getSSN()  );  // 0 coz we didn't initialized yet

        obj.setSSN(123);

        System.out.println(  obj.getSSN()  );
    }
}
