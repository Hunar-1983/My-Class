package day23_methods;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Scanner;

/*
    4. create a function that can print the maximum number from any given array
	5. create a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]
 */
public class assignment {
    public static void main(String[] args) {

            MaXMin(6);
            reverseArra();

    }

    public static void MaXMin(int number){
        int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 300};
        int max = num [0];
        int min = num [0];
        for (int i = 0; i <= num.length-1; i++){
            if (num[i] >= max){
                max = num[i];
            } else
                min = num[i];
        }
        System.out.println("Max number is: "+max);
        System.out.println("Min number is: "+min);

        System.out.println();
    }


        public static void reverseArra(){
            int [] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 300};

            int [] arrarev = new int [num.length];

            int j =num.length-1;
            for (int i = 0; i <= num.length-1; i++){
                arrarev[j] = num[i];
                j--;
            }
            System.out.println(Arrays.toString(arrarev));

        }



}
