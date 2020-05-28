package src.day44_Exceptions;

public class Unchecked {
    public static void main(String[] args) {

        System.out.println("Test started");

       // System.out.println( 9 / 0);           one of the type Uncheck Exception
        String str = "cybertek";
       // System.out.println(str.charAt(-1));   one of the type Uncheck Exception

        int[] arr = {1,2,3};
       // System.out.println(arr[200]);     //    one of the type Uncheck Exception
        System.out.println("Test completed");



    }
}
