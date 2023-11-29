package StructuresOfControl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = obtenerValorNumerico("a");
        double b = obtenerValorNumerico("b");
        double c = obtenerValorNumerico("c");

        double discriminante = Math.pow(b,2)-4*a*c;

        if (discriminante >0) {
            double x1 = (-b+Math.sqrt(discriminante))/(2*a);
            double x2 = (-b-Math.sqrt(discriminante))/(2*a);
            System.out.println("Los resultados son "+x1+" y "+x2);
        } else if (discriminante==0) {
            double x1 = -b/(2*a);
            System.out.println("Tiene un unico resultado: "+x1);
        }else {
            System.out.println("No tiene solucion");
        }
    }

    static double obtenerValorNumerico(String letra){
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.print("Ingrese valor de "+letra+" : ");
                return sc.nextDouble();

            }catch (InputMismatchException e){
                System.out.println("Numero no valido: Ingrese valor numerico");
                sc.nextLine();
            }

        }

    }
}
