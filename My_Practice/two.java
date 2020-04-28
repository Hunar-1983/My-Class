package My_Practice;


import java.util.Arrays;

public class two {
    public static void main(String[] args) {
        String st = "a1b2c3";
        String num = "123456789";
        String res = "";
        for (int k = 0; k < num.length(); k++) {
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i) == num.charAt(k)) {
                    res += st.charAt(i);
                }
            }
        }
        System.out.println(res);
        String [] str = res.split("");
        System.out.println(Arrays.toString(str));
        int sum =0;
        for (String each: str){
             sum += Integer.valueOf(res);
        }
        System.out.println(sum);
    }
}