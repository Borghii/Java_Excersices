import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Cuenta cuenta1 = new Cuenta("Alfonso","1056",10.56,10000);
        Cuenta cuenta2 = new Cuenta("Alfonso","1056",10.56,5000);
        Cuenta cuenta3 = new Cuenta();


        cuenta3.setNumeroCuenta(pedirNumeroCuenta(sc));

        cuenta1.transferencia(cuenta2,2000);
        cuenta2.transferencia(cuenta1,5000);

        System.out.println(cuenta1.toString()+cuenta2.toString());
    }

    public static String pedirNumeroCuenta(Scanner sc){
        String numeroCuenta="";
        boolean entradaValida = false;
        while (!entradaValida){
            try {
                System.out.println("Ingrese el numero de cuenta");
                numeroCuenta = sc.next();
                entradaValida = true;
            }catch (InputMismatchException e){
                System.out.println("Ingrese una entrada valida");
                sc.next();
            }
        }
        return numeroCuenta;
    }
}
