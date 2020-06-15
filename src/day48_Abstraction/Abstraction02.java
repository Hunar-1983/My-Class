package src.day48_Abstraction;

interface  A1{
   void method1(); // public coz in the interface just we have public access modifier
}

interface B1{
   abstract int method2(); // public coz in the interface just we have public access modifier
}

interface C1{
   public abstract void method3();
}
public class Abstraction02 implements A1, B1, C1{

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
    return 10;
    }

    @Override
    public void method3() {

    }
}
