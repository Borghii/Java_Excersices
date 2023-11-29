package poo.Ejercicio2_5;

public class Main1 {
    public static void main(String[] args) {
        BankAccount empleado1 = new BankAccount("Tomas","Borghi", BankAccount.typeAccount.CURRENT_ACCOUNT);
        BankAccount empleado2 = new BankAccount("Olivia","Bousoño", BankAccount.typeAccount.SAVING_ACCOUNT);


        System.out.println(empleado1.getState());

        empleado1.setAccountBalance(9000);
        empleado2.setAccountBalance(10000);

        System.out.println(empleado1.getState());

        empleado1.takeOutMoney(9000);
        System.out.println(empleado1.getState());


    }
}
