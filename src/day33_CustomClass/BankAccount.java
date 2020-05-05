package src.day33_CustomClass;

public class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;


    public void checkingBalance (){
        System.out.println("Avalaibale Balance: "+ balance);
    }

    public void deposit(double amount){
        System.out.println("Depositing $"+amount);
        balance += amount;
    }

    public void withDraw (double amount){
        System.out.println("Withdrawing $"+amount);
        balance-= amount;
     }



    public String toString (){
        return "AccountHolder: "+accountHolder+"\nAccount Number: "+ accountNumber+"\nAvailable Balance: "+balance;
    }


}
