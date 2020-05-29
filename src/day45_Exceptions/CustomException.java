package src.day45_Exceptions;

class BreakTimeException extends RuntimeException{ // custom uncheck exception
    public BreakTimeException(){
        super("It's break time, we should take break");
    }

    public BreakTimeException(String str){
        super(str);
    }

}

public class CustomException {

    public static void main(String[] args) {

        boolean breakTime = true;

        if(breakTime){
            throw new BreakTimeException();

        }else {
            System.out.println("Continue the class");
        }

        //   throw new RuntimeException("It's break time, we should take break");


    }
}
