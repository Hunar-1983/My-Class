package day07_IfStatments;

public class If_Else_Statements {
    public static void main(String[] args) {
        int number = -400;

        if (number % 2 == 0){
            System.out.println(number+" is even number");
        } else {
            System.out.println( number+" is odd number");
        }

    byte age = 17;
        if (age >= 21){
            System.out.println("Here is your vodka");
        } else {
            System.out.println("Go home kid");
        }

        boolean testedPositiveForCorona = false;
        if (testedPositiveForCorona){
            System.out.println("Buy more toilet paper and stay home");
        } else {
            System.out.println("come to work");
        }


    }
}
