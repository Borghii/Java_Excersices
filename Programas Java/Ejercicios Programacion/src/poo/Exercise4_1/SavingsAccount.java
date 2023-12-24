package poo.Exercise4_1;

public class SavingsAccount extends Account {
    private boolean stateAccount;
    public SavingsAccount(double initialBalance, double annualInterestRate) {
        super(initialBalance, annualInterestRate);
        stateAccount= !(initialBalance < 10000);
    }

    @Override
    public void deposit(double amount) {
        if (stateAccount)
            super.deposit(amount);
        else System.out.println("The account is inactive");
    }

    @Override
    public void withdraw(double amount) {
        if (stateAccount)
            super.withdraw(amount);
        else System.out.println("The account is inactive");
    }
    

}
