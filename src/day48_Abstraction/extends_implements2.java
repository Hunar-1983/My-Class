package src.day48_Abstraction;

interface P{
    void method1();
}
interface Q {
    int method2();
}
abstract class R {
    abstract void method3();
}
public class extends_implements2 extends R implements Q, P{ // we have to extends and then implements if we wanna use both of them at the same time
    public static void main(String[] args) {
      //  R obj = new R(); // coz abstracter is not concrete so we acn not create from abstracter
      // Q obj2 = new Q(); // coz interface is not concrete so we acn not create from interface

    }
    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }

    @Override
    void method3() {

    }

}
