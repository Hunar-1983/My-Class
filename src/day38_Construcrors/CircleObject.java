package src.day38_Construcrors;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleObject {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");  // if we want to adapt our result with this format;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        double r = scan.nextDouble() ;

        Circle circle1 = new Circle(r);

        double areaOfCirlce = circle1.area();
        System.out.println("Diameter is: "+ circle1.diameter);
        System.out.println("Perimeter is: "+ circle1.perimeter());
        System.out.println("Area is: " + df.format(  areaOfCirlce ) );

    }
}
