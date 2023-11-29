package StructuresOfControl;

import java.util.Scanner;

public class NumerosAmigos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Num1: ");
        int num1 = sc.nextInt();
        int totn1 = 0;
        System.out.println("Num2: ");
        int num2 = sc.nextInt();
        int totn2 = 0;

        for (int i = 1; i < num1; i++) {
            if (num1%i==0)
                totn1+=i;
        }
        for (int i = 1; i < num2; i++) {
            if (num2%i==0)
                totn2+=i;
        }

        if(totn1 == num2 && totn2 == num1)
            System.out.println("Son amigos");

    }

}
