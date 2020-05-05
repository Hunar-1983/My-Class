package src.day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount Hunar = new BankAccount();
        Hunar.accountHolder = "Hunar";
        Hunar.accountNumber = 123456;

    Hunar.checkingBalance();
    Hunar.deposit(33);

    Hunar.checkingBalance();

    Hunar.withDraw(20);

    Hunar.checkingBalance();

    Hunar.withDraw(0);

        System.out.println("===========================");
        System.out.println(Hunar);
    }
}
