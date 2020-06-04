package src.day47_Abstraction;

abstract class A{
   public abstract void method1();
   public void method2() {  }


}

public class Abstract_VS_NonAbstract2 extends A{ // MANDATORY to override abstract method coz it's not abstract class itself
    // we have 2 method in this class method1 & method2
    @Override
    public void method1() {

    }
}

abstract class B extends A{ // optional to override abstract method coz it's abstract class itself
 // we have 2 method in this class from super class (A class)

}

class C extends B {
    public void method1(){

    }
}