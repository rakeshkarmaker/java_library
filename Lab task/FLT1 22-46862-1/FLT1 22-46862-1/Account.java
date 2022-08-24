import java.lang.*;

public class Account
{
    private int accountNumber;
    private String  accountHolderName;
    private double balance;

    //part two starts
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName = accountHolderName;
    }
    public void setAccountBalance(double balance){
        this.balance = balance;
    }

    public int getAccountNumber(){
        return accountNumber;

    }
    public String getAccountHolderName(){
        return accountHolderName;

    }
    public double getBalance(){
        return balance;
    }
    public  Account (int accountNumber, String accountHolderName, double balance) {
        System.out.println("Para Account");
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public  Account(){
        System.out.println("Empty Account");


    }
    public void showDetails(){

        System.out.println("Account Details are:\n"+" Account Name:"+accountHolderName+"\n Account Number:"+accountNumber+"\n Account balance:"+balance);
    }


}