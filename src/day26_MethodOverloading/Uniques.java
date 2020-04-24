package src.day26_MethodOverloading;

public class Uniques {
    public static void main(String[] args) {
        String str2 = "Cybertek";
        String result2 = uniques("Cybertek");
        System.out.println(result2);
    }


    public static int Frequency (String str, char ch){

        char [] arr = str.toCharArray(); // ['A', 'A', 'A'];
        int count =0;
        for (char each : arr){
            if (each == ch) count++;
        }
        return count;
    }
    public static String uniques (String str){
        String result = "";
        for (int i=0; i < str.length(); i++) {
            int num = Frequency(str, str.charAt(i));
            if (num == 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
