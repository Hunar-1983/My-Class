package day10_Switch_Scanner;

public class SwitchStatementPpractice3 {
    public static void main(String[] args) {
        char ch = 'C';
        String result;
        switch (ch){
            case 'A':
                //System.out.println("A");
                result = "A";
                break;
            case 'B':
                //System.out.println("B");
                result = "B";
                break;
            case 'C':
               // System.out.println("C");
                result = "C";
                break;
            case 'D':
                //System.out.println("D");
                result = "D";
                break;
            case 'E':
                //System.out.println("E");
                result = "E";
                break;
            default:
                //System.out.println("Invalid");
                result = "Invalid";
        }
        System.out.println(result);
    }
}
