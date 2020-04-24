package src.day17_WhileLoops;

public class PalindromeTest {
    public static void main(String[] args) {
        String str = "leveL";

        String reverseStr = "";
        int index = str.length()-1;
        while (index >= 0){
            reverseStr += str.charAt(index);
            index--;

        }
        System.out.println(reverseStr);

        if (str.equals(reverseStr)){
            System.out.println("it is palindrome");
        } else
            System.out.println("it isn't palindrome");
    }
}
