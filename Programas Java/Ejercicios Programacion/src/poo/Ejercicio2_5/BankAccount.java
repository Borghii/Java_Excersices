package poo.Ejercicio2_5;

public class BankAccount {

    private static int counterNumber = 0;
    private final String nameHolder;
    private final String surnameHolder;
    private final int numberAccount;
    enum typeAccount{SAVING_ACCOUNT,CURRENT_ACCOUNT}

    private final typeAccount typeofAccount;

    private double accountBalance;

    private final double interestRate;

    private boolean state;




    public BankAccount(String nameHolder, String surnameHolder, typeAccount typeofAccount){
        this.nameHolder=nameHolder;
        this.surnameHolder=surnameHolder;
        this.typeofAccount=typeofAccount;

        interestRate=setInterestRate(typeofAccount);
        state=setState(0);

        accountBalance =0 ;
        counterNumber++;
        numberAccount=counterNumber;

    }

    public void compareAmount(BankAccount account ){
        if (account.accountBalance>accountBalance){
            System.out.println("The account of : "+ account.nameHolder +" has more money than " + nameHolder);
        }else {
            System.out.println("The account of : "+ nameHolder +" has more money than " + account.nameHolder);
        }
    }

    public void transferMoney(BankAccount account, double amount){
        if (takeOutMoney(amount)){
            account.setAccountBalance(amount);
        }
    }

    public void newAmountMonthly(){
        accountBalance-=(accountBalance*interestRate);
        System.out.println("Your new account balance with "+interestRate+" is equals to "+accountBalance);
    }

    public boolean takeOutMoney(double money){
        if (accountBalance-money<0){
            System.out.println("Your account does`t have enough money");
            return false;
        }else{
            accountBalance-=money;
            System.out.println("Your new account balance is "+accountBalance+ "$");
            state = setState(accountBalance);
            return true;

        }
    }

    public boolean getState(){
        return state;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance){
        this.accountBalance +=accountBalance;
        state = setState(this.accountBalance);
    }

    private static double setInterestRate(typeAccount typeofAccount){
        if (typeofAccount == typeAccount.CURRENT_ACCOUNT){
            return 0.30;
        }else{
            return 0.10;
        }
    }

    private static boolean setState(double accountBalance){
        return accountBalance != 0;
    }



    @Override
    public String toString() {
        return "BankAccount{" +
                "nameHolder='" + nameHolder + '\'' +
                ", surnameHolder='" + surnameHolder + '\'' +
                ", numberAccount=" + numberAccount +
                ", typeofAccount=" + typeofAccount +
                ", accountBalance=" + accountBalance +
                ", interestRate=" + interestRate +
                '}';
    }


}
