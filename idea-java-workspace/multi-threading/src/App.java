import models.BankAccount;

public class App {
    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount(12345, 1000);
        DepositThread t1 = new DepositThread(account, 500);
        DepositThread t2 = new DepositThread(account, 300);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Balance: " + account.getBalance());
    }
}
