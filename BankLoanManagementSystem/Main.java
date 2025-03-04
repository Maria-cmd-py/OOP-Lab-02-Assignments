package BankLoanManagementSystem;
public class Main {
    public static void main(String[] args) {
        LoanAccount loan1 = new LoanAccount(); // Create object
        loan1.applyLoan(10000, 5); // Apply for a loan
        loan1.display(); // Display loan details
        loan1.makePayment(2000); // Make a payment
        loan1.display(); // Display updated details
    }
}