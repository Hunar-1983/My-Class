package src.day48_Abstraction;

import resources.Inheritance2;

public interface Interface2 {

//    public Interface2 (){  // we can not have constructor in interface coz isn't class;
//
//    }

//    public void method1(){  // we can not have instance method in interface coz isn't class;
//
//    }

//    {   // we can not have instance block in interface coz isn't class;
//
//    }

//    static {  // we can not have static block in interface coz isn't class;
//
//    }

    int a = 100;

    public static void main(String[] args) {
        System.out.println(a);  // by default is static coz we can call it directly

       // a = 200;  // we can not re-assigning coz by default is final;

        System.out.println(Interface2.a);
        Interface2.method4();

}
static void method4(){
    }

    void method5();

    public default void method6(){ // this methid it can be created just in interface;
        System.out.println("Defoult method");
    }
}
