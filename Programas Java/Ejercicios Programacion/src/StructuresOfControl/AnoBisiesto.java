package StructuresOfControl;

import java.util.Scanner;
import java.time.*;
public class AnoBisiesto {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year to find out if it is a leap year or not: ");

        try {
            LocalDate ld = LocalDate.of(sc.nextInt(), 2, 29);

            System.out.println("The year is a leap year");

        }catch (java.time.DateTimeException s){

            System.out.println("The year isn`t a leap year");
        }








    }
}
