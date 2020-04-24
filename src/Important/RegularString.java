package src.Important;
/*
  ==> Reverse regular String;
  ==> Palindrome regular String;
  ==> Remove duplicate regular String;
  ==> Print Unique regular String;
  ==> Frequency regular String;
 */
public class RegularString {
    public static void main(String[] args) {
        String str = "I like java and python";    // ==> Reverse regular String;
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("============================");

        String word = "aya";   // ==> Palindrome regular String;
        String result = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i);
        }
        if (result.equalsIgnoreCase(word)) {
            System.out.println("This word is palindrome");
        } else System.out.println("This word is not palindrome");

        System.out.println("============================");

        String str1 = "AABCCD";   // ==> Remove duplicate regular String;
        String nonDop = "";

        for (int i = 0; i < str1.length(); i++) {
            if (!nonDop.contains(str1.charAt(i) + "")) {
                nonDop += str1.charAt(i);
            }
        }
        System.out.println(nonDop);

        System.out.println("============================");

        String word1 = "AABCCDEE";  // ==> Print Unique regular String;
        String unique = "";

        for (int h = 0; h < word1.length(); h++) {
            int count = 0;
            for (int i = 0; i < word1.length(); i++) {
                if (word1.charAt(i) == word1.charAt(h)) {
                    count++;
                }
            }
            if (count == 1) {
                unique += word1.charAt(h);
            }
        }
            System.out.println(unique);

        System.out.println("============================");

        String str2 = "ABBCCCDD";  // ==> Frequency regular String;
        String nonDop2 = "";
        String result2 = "";

        for (int i =0; i < str2.length(); i++){
            if (!nonDop2.contains(str2.charAt(i)+"")){
                nonDop2 += str2.charAt(i);
            }
        }
        for (int h =0; h < nonDop2.length(); h++){
            int count = 0;
            for (int i =0; i < str2.length(); i++){
                if (nonDop2.charAt(h) == str2.charAt(i)){
                    count++;
                }
            }
            result2 += nonDop2.charAt(h) +"" + count;
        }
        System.out.println(result2);

    }
}
