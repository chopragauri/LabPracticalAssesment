package BankingSystem;

public class Loan {
int amt;
public void getLoan(Account acc, int amt){
    if(acc.creditscore>=100){
        System.out.println("Loan sanctioned of rupees "+ amt );
    }
    else{
        System.out.println("Not eligible");
    }
 }

}
