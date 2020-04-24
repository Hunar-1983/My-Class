package My_Practice;


import java.util.Arrays;

public class two {
    public static void main(String[] args) {
        int num = 1001;
        String number =""+num;
        String reverse = "";

        for (int i=number.length()-1; i >=0; i--){
            reverse += number.charAt(i);
        }
        System.out.println(number.equals(reverse));

    }

}