package My_Practice;


import java.util.Arrays;

public class two {
    public static void main(String[] args) {
        String word = "a1b2c3";
        String nums="0123456789";
        int res=0;
        for (int i = 0; i < word.length(); i++) {
            for(int j=0;j<nums.length();j++){
                if (word.charAt(i) == nums.charAt(j)) {
                    int num=Integer.parseInt(""+word.charAt(i));
                    res += num;
                }
            }
        }
        System.out.println(res);


        String str = "a1b2c3";
        String num ="0123456789";
        int sum = 0;


    }
}