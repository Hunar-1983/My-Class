package src.OfficeHours.Practice_05_13_2020;

public class Static {

    int instanceVariable = 100;
    static  int staticVariable = 200;

    public static void  staticMethod(){
        //instanceMethod();
       // System.out.println(  instanceVariable  );
        System.out.println(  staticVariable  );

    }
    public void instanceMethod(){
        staticMethod();
        System.out.println(staticVariable);
        System.out.println(  instanceVariable  );
    }

    public static void main(String[] args) {
        staticMethod();
        System.out.println(  staticVariable  );
        // instanceMethod();
      //  System.out.println(  instanceMethod  );

    }

}
