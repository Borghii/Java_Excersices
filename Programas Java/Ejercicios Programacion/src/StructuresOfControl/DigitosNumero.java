package StructuresOfControl;

import java.util.Scanner;

public class DigitosNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");

        int num = sc.nextInt();
        int cant = 0;

        String num1 = Integer.toString(num);

        System.out.println("La cantidad de digitos es: " + num1.length());

    }
}
