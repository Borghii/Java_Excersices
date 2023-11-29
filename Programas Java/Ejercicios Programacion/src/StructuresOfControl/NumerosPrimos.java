package StructuresOfControl;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int num;

        while (true){

            System.out.println("Ingrese un numero para ver si es primo o no:(ingrese 0 para finalizar) ");
            num = sc.nextInt();

            if (num == 0) {
                break;
            }

            if (num_primo(num)) {
                System.out.println("Es primo");
            }else{
                System.out.println("NO es primo");
            }
        }

    }
    static boolean num_primo(int a){
        if ((a == 0) | (a==1)){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}
