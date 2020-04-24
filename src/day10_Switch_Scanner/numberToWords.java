package day10_Switch_Scanner;

public class numberToWords {
    /*
    String result3 = "";

        if(num > 0  && num < 8 ){ // num can obly be 1 ~ 7

            result3 = (num==1)?"Monday" :(num==2)? "Tuesday" :(num==3)?"Wednesday" :(num==4)?"Thursday":(num==5)?"Friday"
                    :(num==6)?"Saturday" : "Sunday" ;

        }else{
            result3 = "Invalid";
        }

        System.out.println(result3);
     */
    public static void main(String[] args) {
       int num = -9;
       String ward = (num == 0)? "Zero" :(num ==1)?"one"
       :(num ==2)?"Two" :(num ==3)?"Three" :(num==4)?"Foure"
       :(num==5)?"Five" :(num==6)?"Six" :(num==7)?"Seven"
       :(num==8)?"Eight" :(num==9)?"Nine" :"Invalid number";

        System.out.println(ward);

    }
}
