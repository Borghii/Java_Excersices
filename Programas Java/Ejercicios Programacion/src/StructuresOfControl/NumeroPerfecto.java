package StructuresOfControl;

import java.util.Scanner;

public class NumeroPerfecto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = 0;

        do {
            System.out.println("Enter one number to verify is perfect or not ");
        } while (!numberPerfect(sc.nextInt()));


    }

    static boolean numberPerfect(int num){
        int tot=0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                tot += i;
        }
        return tot == num;
    }


}
