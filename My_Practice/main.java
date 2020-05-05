package My_Practice;

public class aa {
    public static void main(String[] args) {
        String str = "xxxx";
        int count = 0;
        String x = "xx";
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) {
                count++;
            }
        }
        System.out.println(count);

    }
}