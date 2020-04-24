package day07_IfStatments;
/*
write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
 */
public class MediamNumber {
    public static void main(String[] args) {
        double a = 150.5;
        double b = 200;
        double c = 100;

        if ((a > b && a < c) || (a < b && a > c)){
            System.out.println(a + " Is the medium number");
        }
        if ((b > a && b < c) || (b < a && b > c)){
            System.out.println(b+ " Is the medium number");
        }
        if ((c > a && c < b) || (c < a && c > b)){
            System.out.println(c+ " Is the medium number");
        }
    }
}
