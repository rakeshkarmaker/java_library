import java.lang.*;

public class Start
{
    public static void main(String[] args)
    {
        Account a = new Account();
        a.setAccountNumber(111111);
        a.setAccountHolderName("OOP1 G");
        a.setAccountBalance(2000.20);

        Customer c = new Customer();
        c.setPhoneNumber("+8801521584710");

        System.out.println("Account phone Number: "+ c.getPhoneNumber());
        System.out.println("Account Account Number; "+ a.getAccountNumber());
        System.out.println("Account Account Name: "+ a.getAccountHolderName());
        System.out.println("Account Balance: "+ a.getBalance());

        //part two
        System.out.println("--------------------------------------------");
        Account z;
        z = new Account (222222222,"OOP1 C",2500.00);
        Customer x;
        x = new Customer ("+8801841813122",z);


        System.out.println("Customer phone Number: "+ x.getPhoneNumber());
        System.out.println("Customer Account Number; "+ x.getAccount().getAccountNumber());
        System.out.println("Customer Account Name: "+ x.getAccount().getAccountHolderName());
        System.out.println("Customer Balance: "+ x.getAccount().getBalance());

    }

}