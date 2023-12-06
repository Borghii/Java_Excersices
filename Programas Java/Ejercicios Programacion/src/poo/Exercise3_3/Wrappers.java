package poo.Exercise3_3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Wrappers {
    /*
    u Definir un método que convierta los tipos primitivos de datos presentados
    en la tabla en sus respectivos wrappers y, luego, imprimir
    sus valores en pantalla.
    u Definir un método que realice las conversiones inversas, es decir,
    que convierta los wrappers anteriores en sus tipos primitivos de
    datos e imprima sus valores en pantalla.
    u Definir un método que evalúe si el valor de e:
            ○ Está en mayúscula.
    ○ Está en minúscula.
    ○ Es una letra.
    ○ En un dígito.
    ○ Convierta el carácter en minúscula.
    */
    static byte a = 1;
    static Byte A = 1;
    static int b = 100;

    static Integer B = 100;
    static float c = 28.9f;

    static Float C = 28.9f;
    static double d = 271.8;

    static Double D = 271.8;
    static char e = '8';

    static Character E = 'm';

    static char[] arr = {'a','c','b','e','d'};

    public static void main(String[] args) {
        convertWrappers(a);
        convertWrappers(b);
        convertWrappers(c);
        convertWrappers(d);
        convertWrappers(e);

        unconvertWrappers(A);

        analizeCharacter(e);

        sortAlphabetic(arr);

        System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE);
        System.out.println("Valor máximo de int: " + Integer.MAX_VALUE);

        System.out.println("Valor mínimo de long: " + Long.MIN_VALUE);
        System.out.println("Valor máximo de long: " + Long.MAX_VALUE);

        // Valores mínimos y máximos para float y double
        System.out.println("Valor mínimo de float: " + Float.MIN_VALUE);
        System.out.println("Valor máximo de float: " + Float.MAX_VALUE);

        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);
        System.out.println("Valor máximo de double: " + Double.MAX_VALUE);

        convertAllTypes(b);


    }

    public static void analizeCharacter(char e){

        System.out.println("It is upper case: "+ Character.isUpperCase(e));
        System.out.println("It is lower case: "+ Character.isLowerCase(e));
        System.out.println("It is a letter: " +Character.isLetter(e));
        System.out.println("It is a digit: " +Character.isDigit(e));
        System.out.println("Convert to upper case: " + Character.toUpperCase(e));





    }

    public static void convertAllTypes(long data){
        int data_int = (int)data;

        float data_float = data;
        System.out.println(data_float);
    }

    public static void sortAlphabetic(char [] arr){
        Arrays.sort(arr);
        System.out.println(arr);

    }

    public static void convertWrappers(byte value) {
        Byte wrappedValue = value;
        System.out.println("Byte Wrapper: " + wrappedValue);
    }

    public static void unconvertWrappers(Byte value){
        byte unwrappedValue = value;
        System.out.println("Byte Unwrapped: "+unwrappedValue);
    }

    public static void convertWrappers(int value) {
        Integer wrappedValue = value;
        System.out.println("Integer Wrapper: " + wrappedValue);
    }

    public static void convertWrappers(float value) {
        Float wrappedValue = value;
        System.out.println("Float Wrapper: " + wrappedValue);
    }

    public static void convertWrappers(double value) {
        Double wrappedValue = value;
        System.out.println("Double Wrapper: " + wrappedValue);
    }

    public static void convertWrappers(char value) {
        Character wrappedValue = value;
        System.out.println("Character Wrapper: " + wrappedValue);
    }



}
