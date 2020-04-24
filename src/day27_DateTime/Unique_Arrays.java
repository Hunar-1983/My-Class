package src.day27_DateTime;
/*
3. write a method that can print out the unique elements from an int array
			Ex: {1,1,2,3,3} ==> 2
			{6,6,7,7,8,9} ==> 8 9
4. write a method that can print out the unique elements from a double array
			Note: Apply method overloading
:+1:
3
 */
public class Unique_Arrays {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 2, 4, 5};
        UniqueElements(arr);
        System.out.println("++++++++++++");
        int [] arr2 = {3, 3, 4, 4, 5,5, 6, 7, 8,9 };
        UniqueElements(arr2);
        System.out.println("+++++++++");

        double [] arr1 = {1.5, 1.5, 2.5, 3.5, 3.5, 4.5};
        Unique(arr1);
    }

    public static void UniqueElements (int [] arr){
        for (int each2: arr){
            int count = 0;
            for (int each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        }
    }

    public static void Unique (double [] arr){
        for (double each2: arr){
            int count = 0;
            for (double each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        }
    }
}
