import BankingSystem.*;

public class Q3 {
    public static void main(String[] args) {
        Account user1 = new Account("Gauri",150000,100);
        user1.deposit(10000);
        Loan loan = new Loan();
        loan.getLoan(user1,5000000);
        Account user2 = new Account("Java",150000,50);
        Loan loan2 = new Loan();
        loan2.getLoan(user2,5000000);
    }
}
