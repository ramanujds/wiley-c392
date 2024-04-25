package models;

public class BankAccount {
    private long accountNumber;
    private double balance;

    public BankAccount(long accountNumber, double amount) {
        this.accountNumber = accountNumber;
        this.balance = amount;
    }

    // Getter method
    public double getBalance() {
        return balance;
    }

    // accounInfo getter
    public String getAccountInfo() {
        return "Account Number: " + accountNumber + " Balance: " + balance;
    }

    // deposit method
    public void deposit(double amount) {
       synchronized (this){

            double newBalance = balance + amount;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
            System.out.println("Deposited: " + amount + " New Balance: " + balance);
        }
    }
}
