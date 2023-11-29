package poo.Ejercicio2_4;

public class Main1 {
    public static void main(String[] args) {

        Circulo cr1 = new Circulo(2);

        Triangulo tr1 = new Triangulo(3,5);

        Cuadrado c1 = new Cuadrado(3);

        Rectangulo r1 = new Rectangulo(1,2);

        cr1.calcularArea();
        cr1.calcularArea();

        tr1.calcularArea();
        tr1.calcularPerimetro();

        c1.calcularArea();
        c1.calcularPerimetro();

        r1.calcularArea();
        r1.calcularPerimetro();


    }
}
