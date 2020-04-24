package Practice_04_15_2020;

import com.oracle.webservices.internal.api.databinding.WSDLResolver;

public class foeEachLoop {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4};

        String result = "";
        for (int each : arr){
            if (each == 3){
                continue;
            }
            result += each+" ";

        }
        System.out.println(result.trim());


        int [] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String evenNum = "";
        for (int each : arr2){
            if (each % 2 == 0){
                evenNum += each+" ";
            }
        }
        System.out.println(evenNum.trim());



    }
}
