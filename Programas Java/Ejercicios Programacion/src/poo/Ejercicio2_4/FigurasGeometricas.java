package poo.Ejercicio2_4;

public abstract class FigurasGeometricas {
    protected double area;
    protected double perimetro;

    public FigurasGeometricas(){
        this.area=0;
        this.perimetro=0;
    }
    abstract void calcularArea();
    abstract void calcularPerimetro();

}

class Circulo extends FigurasGeometricas {

    private double radio;

    public Circulo(double radio){
        super();
        this.radio=radio;
    }

    public void calcularArea(){
        this.area= Math.PI*(Math.pow(radio,2));
        System.out.println("El area es: "+this.area);
    }

    public void calcularPerimetro(){
        this.perimetro= Math.PI*radio*2;
        System.out.println("El area es: "+this.perimetro);
    }
}

class Rectangulo extends FigurasGeometricas{

    private double base;
    private double altura;

    public Rectangulo(double base,double altura){
        super();
        this.base=base;
        this.altura=altura;
    }

    public void calcularArea(){
        this.area=base*altura;
        System.out.println("El area del rectangulo es: " +this.area);
    }

    public void calcularPerimetro(){
        this.perimetro=2*(base+altura);
        System.out.println("EL perimtro es: "+this.perimetro);
    }


}

class Cuadrado extends FigurasGeometricas{

    private double lado;

    public Cuadrado(double lado){
        super();
        this.lado=lado;
    }


    public void calcularArea(){
        this.area=lado*lado;
        System.out.println("EL area es: "+this.area);
    }
    public void calcularPerimetro(){
        this.perimetro=lado*4;
        System.out.println("El perimtro es: "+this.perimetro);
    }

}

class Triangulo extends FigurasGeometricas{

    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        super();
        this.base=base;
        this.altura=altura;
    }

    public void calcularArea(){
        System.out.println("El area es igual a: "+((base*altura)/2));
    }

    public void calcularPerimetro(){
        double hip;
        hip = Math.sqrt(Math.pow(base,2)+Math.pow(altura,2));
        System.out.println("El perimetro es igual a: "+(base+altura+hip));
    }

}



