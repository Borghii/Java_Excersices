import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class utils{
    static void ingresoDosPalbras(String[] a, String[] b){

        Scanner sc = new Scanner(System.in);

        System.out.println("INgrese el primer letra o palabra: ");
        a[0]=sc.next();
        System.out.println("INgrese la segunda letra o palabra: ");
        b[0]=sc.next();

    }
}
public class StringExercise{
    public static void main(String[] args) {

        String[] a = new String[1];
        String[] b = new String[1];

        utils.ingresoDosPalbras(a,b);





    }

    /**
     * Programam that return the operations binaries ==,!=,in,count
     *
     * @param a
     * @param b
     */
    static void exercise1(String a,String b){
        System.out.println(a.equals(b));
        System.out.println(!a.equals(b));
        System.out.println(a.contains(b));
        System.out.println(count(a,b.charAt(0)));

    }
    static int count(String a,char b){
        int cont=0;
        for (char letras: a.toCharArray()) {
            if (letras==b){
                cont++;
            }
        }
        return cont;
    }

}
class StringExercise2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a;
        String b;

        System.out.println("INgrese el primer letra o palabra: ");
        a=sc.next();
        System.out.println("INgrese la segunda letra o palabra: ");
        b=sc.next();

        System.out.println(concanateAndCapitalize(a,b));
    }

    static String concanateAndCapitalize(String a,String b){
        String resultado = a+" "+b;
        StringBuilder palabra = new StringBuilder();

        String [] resu = resultado.split(" ");

        for (String resu1:resu ) {

            char firstLetter = Character.toUpperCase(resu1.charAt(0));
            String resto = resu1.substring(1).toLowerCase();
            palabra.append(firstLetter).append(resto);

        }
        return palabra.toString();
    }

}
class StringExercise3{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] valor1 = new String [1];
        String [] valor2 = new String [1];

        utils.ingresoDosPalbras(valor1,valor2);

        if (valor1[0].endsWith(valor2[0])) {
            // Elimina el sufijo
            String resultado = valor1[0].substring(0, valor1[0].length() - valor2[0].length());
            System.out.println("Resultado después de eliminar el sufijo: " + resultado);
        } else {
            System.out.println("El segundo valor no es un sufijo del primero.");
        }

        scanner.close();
    }



}
class StringExercise4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el 1 valor: ");
        String value1 = sc.next();

        System.out.println("Ingrese el 2 valor: ");
        String value2 = sc.next();

        System.out.println("Ingrese el 3 valor: ");
        int value3 = sc.nextInt();

        System.out.print(value1.concat(value2).toUpperCase().repeat(value3));
    }
}
class StringExercise5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el 1 valor: ");
        String value1 = sc.next();

        System.out.println("Ingrese el 2 valor: ");
        String value2 = sc.next();

        System.out.println("Ingrese el 3 valor: ");
        String value3 = sc.next();

        System.out.println(value1.replace(value2,value3));

    }
}



