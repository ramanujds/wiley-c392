package accountmanagement;

public class Account {

    private long accountNo;
    private String customerName;
    private double balance;
    static int accountCount;

    public Account(long accountNo, String customerName, double balance) {
        this.accountNo = accountNo;
        this.customerName = customerName;
        this.balance = balance;
        accountNo+=1;
    }

    public void deposit(double amount){

    }

    public void withdraw(double amount){

    }

    public void showAccountInfo(){

    }

}
