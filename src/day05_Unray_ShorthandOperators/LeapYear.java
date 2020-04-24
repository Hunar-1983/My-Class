package day05_Unray_ShorthandOperators;

public class LeapYear {
    public static void main(String[] args) {
/*
1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
		Ex:
			year = 2020  ==> short;
			LeapYear =true/false;
		output:
			2020 is leap year: true
 */
        short year = 2025;

        // leapYear: year % 4 == 0
        // if returns true ==> learpYear,  if it returns false ==> not leapYear

        boolean leapYear = year % 4 == 0; //  if the year can be devided by 4 without any reminder, then it's leap year

        //  System.out.println( year + " is leap year: " + leapYear );

        String result =  year + " is leap year: " + leapYear;
        System.out.println(result);

        System.out.println("============================");


        int num5 = 80;
        boolean num6 = num5 % 2 ==0;
        boolean num7 = num5 % 3 ==0;
        boolean num8 = num5 % 5 ==0;
        System.out.println("80 is divisible by 2:"+ num6);
        System.out.println("80 is divisible by 2:"+ num7);
        System.out.println("80 is divisible by 2:"+ num8);
    }

}
