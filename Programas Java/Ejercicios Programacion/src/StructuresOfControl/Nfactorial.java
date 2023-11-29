package StructuresOfControl;

import java.util.Scanner;

public class Nfactorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial: ");

        int num = sc.nextInt();
        int tot=1;

        for (int i = 1; i <=num ; i++) {
            tot*=i;
        }

        System.out.println(tot);
    }
}
