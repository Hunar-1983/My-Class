package src.day22_Arrays_Loop;

public class Nested_ForEach {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        for (int each : arr){
            System.out.print(each+" ");
        }
        System.out.println("=====================");

        int [] [] arr2D = { {1,2,3} , {4,5,6}   };
        for (int[] each : arr2D){
            for (int eachElement : each){
                System.out.print(eachElement+" ");
            }
        }
        System.out.println("=====================");
        char [][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H'}};

        for (char[] each1 : ch2D){
            for (char each2 : each1){
                System.out.print(each2+" ");
            }

            System.out.println("=====================");



        }

    }
}
