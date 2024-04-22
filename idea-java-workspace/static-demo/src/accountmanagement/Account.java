package accountmanagement;

public class Account {

    public static int numOfCustomers=0;
    private long accountNo;
    private String customerName;
    private double balance;

    Account(long accountNo,String customerName, double balance)
    {
        this.accountNo=accountNo;
        this.customerName=customerName;
        this.balance=balance;
        numOfCustomers+=1;
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Successfully Deposited "+amount);
    }

    public void withdraw(double amount){
        if(amount<=balance)
        balance-=amount;
        else
        System.out.println("Insufficient Balance");
    }

    public void showAccountInfo(){
        System.out.println("Name : "+customerName);
        System.out.println("Account No. : "+accountNo);
        System.out.println("Balance : "+balance);
    }

}