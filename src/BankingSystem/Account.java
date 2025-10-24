package BankingSystem;

public class Account {
    String name;
    double balance;
    int creditscore;

    public Account(String name,double balance, int creditscore ){
        this.name=name;
        this.balance=balance;
        this.creditscore=creditscore;
    }

    public void deposit(double amount){
        balance=balance+amount;
        System.out.println("Balance after depositing: "+balance);
    }
    public void getDetails(){
        System.out.println("name: "+name);
        System.out.println("balance: "+balance);
    }
}
