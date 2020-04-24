package day08_IfStatements;

public class MultiBrunchIf_Practice {
    public static void main(String[] args) {
        double scor = 89.5;
        boolean AGrade = scor >= 90 && scor <= 100;
        boolean BGrade = scor >= 80 && scor < 90;
        boolean CGrade = scor >= 70 && scor < 80;
        boolean DGrade = scor >= 60 && scor < 70;

        char grade = ' ';

        if (AGrade){
            grade = 'A';
        } else if (BGrade){
            grade = 'B';
        } else if (CGrade){
            grade = 'C';
        } else if (DGrade){
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Score "+scor + " is: "+grade);
    }
}
