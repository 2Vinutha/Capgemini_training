import java.util.Scanner;
abstract class LoanSystem {
    String loanType;
    double amount;
    int creditScore;

    LoanSystem(String type, double amt, int score) {
        this.loanType = type;
        this.amount = amt;
        this.creditScore = score;
    }

    abstract boolean checkEligibility();
    abstract double calculateEMI();

    public void processLoan() {
        System.out.println("\n--- Processing " + loanType + " ---");
        
        if (checkEligibility()) {
            System.out.println("Status: Eligibility check passed.");
            System.out.println("Monthly EMI: ₹" + calculateEMI());
            System.out.println("Final Result: Loan Approved!");
        } else {
            System.out.println("Status: Eligibility check failed.");
            System.out.println("Final Result: Loan Rejected (Low Credit Score).");
        }
    }
}

class HomeLoan extends LoanSystem {
    HomeLoan(double amt, int score) {
        super("Home Loan", amt, score);
    }
    @Override
    boolean checkEligibility() {
        return creditScore >= 750; 
    }
    @Override
    double calculateEMI() {
        double annualRate = 0.085; 
        return (amount * annualRate) / 12;
    }
}

class EducationLoan extends LoanSystem {
    EducationLoan(double amt, int score) {
        super("Education Loan", amt, score);
    }

    @Override
    boolean checkEligibility() {
        return creditScore >= 650; 
    }

    @Override
    double calculateEMI() {
        double annualRate = 0.06; 
        return (amount * annualRate) / 12;
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Loan Portal");
        System.out.print("Enter Loan Type (1 for Home, 2 for Education): ");
        int choice = sc.nextInt();

        System.out.print("Enter Loan Amount: ₹");
        double userAmount = sc.nextDouble();

        System.out.print("Enter Your Credit Score: ");
        int userScore = sc.nextInt();

        LoanSystem myLoan = null;

        if (choice == 1) {
            myLoan = new HomeLoan(userAmount, userScore);
        } else if (choice == 2) {
            myLoan = new EducationLoan(userAmount, userScore);
        } else {
            System.out.println("Invalid choice. Exiting...");
        }

        if (myLoan != null) {
            myLoan.processLoan();
        }
    }
}