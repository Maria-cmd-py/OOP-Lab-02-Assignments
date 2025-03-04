package BankLoanManagementSystem;
class LoanAccount {
    double loanAmount;
    double interestRate;
    double remainingBalance;
    // Default Constructor
    LoanAccount() {
        loanAmount = 0.0;
        interestRate = 0.0;
        remainingBalance = 0.0; }
    // Method to apply for a loan
    void applyLoan(double amount, double rate) {
        loanAmount = amount;
        interestRate = rate;
        remainingBalance = amount; }
    // Method to make a payment
    void makePayment(double payment) {
        if (payment <= remainingBalance) {
            remainingBalance -= payment;
            System.out.println("Payment of " + payment + " made. Remaining balance: " + remainingBalance);
        } else {
            System.out.println("Payment exceeds remaining balance!");
        } }
    // Method to display loan details
    void display() {
        System.out.println("Loan Amount: " + loanAmount + ", Interest Rate: " + interestRate + "%, Remaining Balance: " + remainingBalance); }
}