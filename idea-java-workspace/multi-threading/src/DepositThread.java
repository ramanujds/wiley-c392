import models.BankAccount;

public class DepositThread extends Thread {
    private BankAccount account;
    private double amount;

    public DepositThread(BankAccount account, double amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        System.out.println("Depositing Amopunt: " + amount);
        account.deposit(amount);
    }

}
