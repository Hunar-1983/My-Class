package src.day40_Encapsulation;

public class Person_Objects {
    public static void main(String[] args) {

     Person obj = new Person("Hunar");

        System.out.println(  obj.name  );

        // System.out.println(  obj.SSN  );
        System.out.println( "Object's SNN "+ obj.getSNN()  );

        obj.setSNN(12345);

        System.out.println( "Object's SNN "+ obj.getSNN()  );

     //   System.out.println( "Object's ID "+ obj.ID  );

        System.out.println( "Object's ID "+ obj.getID()  );

        obj.setID(123);
        System.out.println( "Object's ID "+ obj.getID()  );


    }
}
