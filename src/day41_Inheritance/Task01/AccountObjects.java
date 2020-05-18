package src.day41_Inheritance.Task01;

public class AccountObjects {
    public static void main(String[] args) {

        CheckingAccount obj = new CheckingAccount();
        obj.accountHolder = "Hunar Mohammad";
        obj.showBalance();
        System.out.println(obj);

        obj.deposit(25000);
        obj.showBalance();

        obj.withDraw(10000);
        obj.showBalance();
        System.out.println(obj);
        System.out.println("=============================================");

        SavingAccount saving = new SavingAccount();
        saving.accountHolder = "Roshna";

        saving.deposit(30000);
        saving.showBalance();
        System.out.println(SavingAccount.interestRate);

        System.out.println(saving);


    }
}
