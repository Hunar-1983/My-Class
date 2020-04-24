package src.day25_MethodsRecap;

public class return_Methods {

    public static int Max (int a, int b){

        int max= 0;
        if ( a >= b) max = a;
        else max = b;
        return max;
    }

    public static int Max2 (int a, int b){
        if (a >= b) return a;
        return b; // here if you want you can don't write 'else' write just retuned;
    }

    public static void main(String[] args) {
      int c =  Max(10, 9);
        System.out.println(c);

        int d = Max2(10, 9);
        System.out.println(d);
    }
}
