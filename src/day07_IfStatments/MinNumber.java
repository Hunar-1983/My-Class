package day07_IfStatments;
/*
write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
 */
public class MinNumber {
    public static void main(String[] args) {
        double a = 500.5;
        double b = 2;
        double c = 300;

        if (a < b && a < c){
            System.out.println(a + " Is smaller number");
        }
        if (b < a && b < c){
            System.out.println(b+ " Is smaller number");
        }
        if (c < a && c < b){
            System.out.println(c+ " Is smaller number");
        }
    }
}
