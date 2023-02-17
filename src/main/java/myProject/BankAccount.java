package myProject;

public class BankAccount {
    private static int valueForAccount;
    private int accountNumber;
    private double balance;
   //owner can be refactored as a separate class
   private String owner;
    public BankAccount(){
        this.accountNumber=++valueForAccount;
    };
    public BankAccount(double balance,String onwer){
        this.accountNumber=++valueForAccount;
        this.balance=balance;
        this.owner=onwer;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double DisplayBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
}
public void withdraw(double amount){
        if(amount>0&&amount<balance){
            balance-=amount;
        }
        else{
            System.out.println("You type incorrect data or not enough funds");
        }
}
}
