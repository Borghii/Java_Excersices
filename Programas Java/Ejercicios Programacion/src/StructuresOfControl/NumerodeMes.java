package StructuresOfControl;

import java.time.chrono.ChronoLocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;
import java.time.*;
public class NumerodeMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero del mes para saber su nombre y dias: ");
        int numMes= sc.nextInt();

        Month mes = Month.of(numMes);

        String nombreMes = mes.getDisplayName(TextStyle.FULL, Locale.getDefault()) ;
        int diasMes = mes.maxLength();

        System.out.println("El numero " +numMes+ " pertenece al mes "+nombreMes+" y tiene "+diasMes+" dias");


    }

}
