package Tasks_Day_3.T3;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main (String[] args){
        var MyBankAccount = new BankAccount(5000);
        var OtherBankAccount = new BankAccount(0);

        MyBankAccount.withdraw(5001);
        MyBankAccount.withdraw(1);
        MyBankAccount.printBalance();
        MyBankAccount.deposit(5001);
        MyBankAccount.deposit(1);
        MyBankAccount.printBalance();
        MyBankAccount.transfer(5001, OtherBankAccount);
        MyBankAccount.transfer(1, OtherBankAccount);
        MyBankAccount.printBalance();
        OtherBankAccount.printBalance();
    }
}
