package accountmanagement;

public class AccountManagement {

    public static void main(String[] args) {

        // Create few accounts
        Account account1=new Account(154545555l, "Polaska", 100.00);
        Account account2=new Account(784545555l, "Torata", 100.00);
        // Display the no. of accounts created
        System.out.println(Account.numOfCustomers);
        // Do the basic operations(deposit/withdraw)
        account1.deposit(500);
        account2.withdraw(50);
        account1.showAccountInfo();
        account2.showAccountInfo();


    }

}