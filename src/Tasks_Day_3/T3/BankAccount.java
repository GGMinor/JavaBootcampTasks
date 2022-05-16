package Tasks_Day_3.T3;

public class BankAccount {
    private double balance;

    BankAccount(){}

    BankAccount(double balance){
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>5000){
            System.out.println("Transaction cancelled. Max deposit - 5000 | Your deposit: "+ amount);
        }else {
            this.balance = this.balance + amount;
        }
    }

    public void withdraw(double amount){
        if(this.balance-amount<0){
            System.out.println("There is not enough funds.");
        }else {
            this.balance = this.balance - amount;
        }
    }

    public void printBalance(){
        System.out.println("Your current balance is " + this.balance + " units!");
    }

    public void transfer(double amount, BankAccount transferTo){
        if(this.balance-amount<0){
            System.out.println("Transfer cancelled. You are trying to transfer"+ amount + " units, but only "+ this.balance + " are available.");
        } else {
            this.withdraw(amount);
            transferTo.deposit(amount);
        }
    }
}
