package StructuresOfControl;

import java.util.Scanner;

public class WhileEjer {
    /*
    Escribir un programa que dado un número entero positivo n, calcule
    la suma de la siguiente serie: 1 + 1/2 + 1/3 + 1/4 + 1/5 + … + 1/n
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        float total = 0.0F;
        System.out.println("Enter one number: ");
        int num = sc.nextInt();

        while (n<num){
            n++;
            total+= (float) 1 /(n);
        }

        System.out.println("El total es: "+total);

    }


}
