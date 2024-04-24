package threadsynchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class MyBankAccount {
    private double balance;

    Lock lock = new ReentrantLock();

    public MyBankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        System.out.println("Depositing " + amount + "₹");
        lock.lock();
        double newBalance = balance + amount;

        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
            System.err.println(ex.getMessage());
        }

        balance = newBalance;
        lock.unlock();

        System.out.println("Balance after depositing : " + balance + "₹");

    }

}

class MyDepositThread extends Thread {
    private MyBankAccount account;
    private double depositAmount;

    public MyDepositThread(MyBankAccount account, double depositAmount) {
        this.account = account;
        this.depositAmount = depositAmount;
    }

    public void run() {
        account.deposit(depositAmount);
    }
}

public class ThreadSynchronizationWithLock {

    public static void main(String[] args) {
        MyBankAccount account = new MyBankAccount(0);

        MyDepositThread thread1 = new MyDepositThread(account, 5000);
        MyDepositThread thread2 = new MyDepositThread(account, 2000);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Final Account Balance : " + account.getBalance());

    }

}
