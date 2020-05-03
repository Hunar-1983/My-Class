package src.day30_ArrayList;

/*
1. write a program that can return the sum of all the digits from a string
			ex:
				input: "a1b2c3"
				output: 6
					(1+2+3= 6)
				input: "Today's date is 04/27/2020"
				output: 17
					(0+4+2+7+2+0+2+0=17)
			HINT: on ascii table, the characters between #48 ~ #57 are digits
 */

import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        String str = "a1b2c3d4";
        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));

        int sum = 0;    // will conatain sum of all digits

        for(char each  : arr ){ // '0'

            if(each >= 48 && each <= 57){  // if each is digit , we will convert to int and add it to sum
                sum += Integer.parseInt(""+each);  // "0"
            }


            if( Character.isDigit(each) ){  // isDigit(): identifies if the given character is digit
                sum += Integer.parseInt(""+each);
            }


        }



        System.out.println(sum);

        boolean a = Character.isAlphabetic('A');  // identifies if the character is alphabet



        /*
        assignment task:
            extract the digits and letters form a string
         */
        String word = "2322jk4g5jhg46gh";
        String lettre = "";
        String nums = "";
        char[] array = word.toCharArray();
        for (int i =0; i < array.length; i++){
            char ch2 = array[i];
            if (Character.isDigit(ch2)){
                nums += ch2;
            } else lettre += ch2;
        }
        System.out.println(nums);
        System.out.println(lettre);

        String leetter1 = "";
        String nums1 = "";
        for (char each : array){
            if (Character.isDigit(each)) nums1 += each;
            else leetter1 += each;
        }
        System.out.println(nums1);
        System.out.println(leetter1);
    }
}
