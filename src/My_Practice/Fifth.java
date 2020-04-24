package src.My_Practice;
/*
1.  write a return method that accepts a String and removes duplicate values from the String
		Ex:
				RemoveDuplicate("aaabbbccc");  ==> "abc"

2. write a return method that accepts two strings str1 & str2, and returns the frequency of str2
in str1 as an int
		Ex:
			Frequency("AAABB", "A");  ==> 3
			Frequency("ABAB", "B"); ==> 2

 */


public class Fifth {
    public static String remove (String str){
        String str1 = "aaabbbccc";
        String nonDop = "";

        for (int i = 0; i < str1.length(); i++){
            if (!nonDop.contains(str1.charAt(i)+"")){
                nonDop += str1.charAt(i);
            }
        }
        System.out.println(nonDop);
            return nonDop;
     }

    public static String frequency (String str){
     //   Frequency("AAABB", "A");  ==> 3
     //   Frequency("ABAB", "B"); ==> 2
        String str1 = "AAABB";
        String result = "";
        String nonDop = "";

        for (int k = 0; k < str1.length(); k++){
            if (!nonDop.contains(str1.charAt('A')+"")){
                nonDop += str1.charAt('A');
            }
        }
        for (int i = 0; i < nonDop.length(); i++){
            int count = 0;
            for (int k = 0; k < str1.length(); k++){
                if (nonDop.charAt('A') == str1.charAt('A')){
                    count++;
                }
            }
            result += count;
        }
        System.out.println(result);
        return result;
    }


    public static void main(String[] args) {
        remove("aaabbbccc");
        frequency("AAABB");
    }
}
