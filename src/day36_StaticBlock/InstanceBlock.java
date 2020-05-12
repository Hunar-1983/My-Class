package src.day36_StaticBlock;

public class InstanceBlock {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        InstanceBlock obj = new InstanceBlock();
        InstanceBlock obj2 = new InstanceBlock();

    }
}
