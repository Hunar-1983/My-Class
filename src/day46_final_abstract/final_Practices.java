package src.day46_final_abstract;

public class final_Practices {
    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);
        // a = 20; // can not be reassigned
    }

    static {
        System.out.println(b);
        // b = 30;
    }

    public final_Practices(){

    }
     final void method1(){

    }
    public final static void method2(){

    }
}

 class test extends final_Practices{
  /*  protected void method1(){ // we can not overriding this method coz the method in the super class was final;

    }
   */

 }
