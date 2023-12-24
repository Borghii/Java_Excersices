package poo.Exercise4_1;

public class Account {
    protected double balance;
    protected int numDeposits;
    protected int numWithdrawals;
    protected double annualInterestRate;
    protected double monthlyFee;

    public Account(double initialBalance, double annualInterestRate) {
        this.balance = initialBalance;
        this.numDeposits = 0;
        this.numWithdrawals = 0;
        this.annualInterestRate = annualInterestRate;
        this.monthlyFee = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        numDeposits++;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            numWithdrawals++;
        } else {
            System.out.println("Insufficient balance to make the withdrawal.");
        }
    }

    public void calculateMonthlyInterest() {
        double monthlyInterest = (balance * (annualInterestRate / 100)) / 12;
        balance += monthlyInterest;
    }

    public void monthlyStatement() {
        balance -= monthlyFee;
        calculateMonthlyInterest();
    }

    public void printInfo() {
        System.out.println("Balance: " + balance);
        System.out.println("Number of deposits: " + numDeposits);
        System.out.println("Number of withdrawals: " + numWithdrawals);
        System.out.println("Annual interest rate: " + annualInterestRate + "%");
        System.out.println("Monthly fee: " + monthlyFee);
    }

    public static void main(String[] args) {
        // Example of usage
        Account exampleAccount = new Account(1000, 5);

        exampleAccount.deposit(500);
        exampleAccount.withdraw(200);
        exampleAccount.printInfo();

        exampleAccount.monthlyStatement();
        exampleAccount.printInfo();
    }
}
