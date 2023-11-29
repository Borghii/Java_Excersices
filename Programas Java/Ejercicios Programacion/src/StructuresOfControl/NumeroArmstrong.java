package StructuresOfControl;

import java.util.Scanner;

public class NumeroArmstrong {
    /*
    Se quiere desarrollar un programa que determine si un número es un número
    de Amstrong. Un número de Amstrong es aquel que es igual a la suma
    de sus dígitos elevados a la potencia de su número de cifras.
    Por ejemplo, el número 371 es un número que cumple dicha característica
    ya que tiene tres cifras y:
            371 = 33 + 73 + 13 = 27 + 343 + 1 = 371
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int len = 0;
        String nums = "";
        int total = 0;

        while (true){
            System.out.println("Enter one number to verify if it is one number of Atmstrong or not: ");
            num = sc.nextInt();

            nums = String.valueOf(num);
            char [] numc = nums.toCharArray();



            for (char number : numc){
                total+= (int) Math.pow(Character.getNumericValue(number),numc.length);
            }
            if (total == num){
                System.out.println("The number: "+num+" is a Number of Armstrong");
                break;
            }else {
                System.out.println("The number: "+num+" isn`t a Number of Armstrong");
                total = 0;
            }

        }
    }

}
