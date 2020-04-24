package src.day15_ForLoop;

public class reversString {
    public static void main(String[] args) {
        String str = "java";
        int lastindexnum = str.length()-1;
        String reserve = "";
        for(int i = lastindexnum; i >=0; i--){
            reserve += str.charAt(i);
        }
        System.out.println(reserve);
    }
}
