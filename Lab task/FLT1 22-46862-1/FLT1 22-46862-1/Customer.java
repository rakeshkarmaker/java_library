import java.lang.*;

public class Customer
{
    private String phoneNumber;
    private Account account;

    public Customer(){

        System.out.println("Empty Customer");
    }
    public  Customer(String phoneNumber, Account account){
        System.out.println("Para Customer");
        this.phoneNumber = phoneNumber;
        this.account =account;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setAccount(Account account){
        this.account =account;
    }
    public Account getAccount(){
        return account;
    }
    public void Customer(){
        System.out.println("Empty Customer");
    }

    public void showDetails(){


        System.out.println("Customer phone Number: "+getPhoneNumber());
        account.showDetails();


    }
}