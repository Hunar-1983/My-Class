package day07_IfStatments;
/*
2. write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */
public class MaxNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        if (a > b && a > c){
            System.out.println(a + " Is greater number");
        }
        if (b > a && b > c){
            System.out.println(b+ " Is greater number");
        }
        if (c > a && c > b){
            System.out.println(c+ " Is greater number");
        }
    }
}
