package src.day47_Abstraction;
class Test1{
    public Test1(){ }
    public void method1(){  }
    public static void method2(){  }
 // public abstract void method3();  // we can not create abstract method in regular class ut's very important to know;

    int a = 200;
    static int b = 200;

    {

    }
    static {

    }



}
abstract class Test2{
    public Test2(){  }
    public void method1(){  }
    public static void method2(){  }
    public abstract void method3(); // couz Test2 is abstract class, so we can create abstract method here;
    int a = 100;
    static int b = 200;

    {

    }
    static {

    }

  //  Test2 obj = new Test2(); // we can not create any objects in the abstract class coz it's not physically exist;
  //  abstract class can not be final

}

public class Abstract_VS_NonAbstract {

}
