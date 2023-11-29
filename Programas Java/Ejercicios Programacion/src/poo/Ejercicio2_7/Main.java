package poo.Ejercicio2_7;

public class Main {
    public static void main(String[] args) {

        Avion A1 = new Avion("Bichito",4);
        Avion A2 ;
        Avion A3 = new Avion("Olivia", 4);
        A2=A1;

        A1.printNameManufacturer();
        A2.printNameManufacturer();
        A3.printNameManufacturer();

        A1.setNameManufacturer("Nashe");

        A1.printNameManufacturer();
        A2.printNameManufacturer();
        A3.printNameManufacturer();

        A1.changeManufacturer(A2);

        A1.printNameManufacturer();
        A2.printNameManufacturer();
        A3.printNameManufacturer();

    }
}
