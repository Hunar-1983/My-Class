package src.day42_Inheritance;
class A {
    int a = 100;
    public A(double b){
        System.out.println(this.a);
    }

}

public class SuperKeyword extends A{
    int a = 200;
    SuperKeyword(){
        super(3.0); // 100
        System.out.println(super.a); // 100
    }

    public static void main(String[] args) {

       // SuperKeyword obj = new SuperKeyword();
        A obj = new  A(5.5);
    }
}
