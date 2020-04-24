package day23_methods;

public class Method_WithParameters2 {
    public static void main(String[] args) {
    String name1 = "hunar";
    ReverseString(name1);

    String name2 = "cybertek";
    ReverseString(name2);
    }


    public static void ReverseString (String str){
        for (int i = str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }


}
