package poo.Ejercicio2_3;

public class Automovil {
    private String brand;
    private int model;
    private int engine;
    enum TypeOfOil {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
    private TypeOfOil typeOil;
    enum TypeOfCar {CAR_CITY, SUB_COMPACT, COMPACT, FRIENDLY, EXECUTIVE, SUV}
    private TypeOfCar typeCar;
    private int numberDoors;
    private final int speedMax;
    enum Colours {WHITE, BLACK, RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET}
    private Colours colour;
    private int speedCurrently;
    private final boolean automatic;
    private int strikes;


    public Automovil(String brand, int model, int engine, TypeOfOil typeOil, TypeOfCar typeCar, int numberDoors, int speedMax, Colours colour, int speedCurrently,boolean automatic) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.typeOil = typeOil;
        this.typeCar = typeCar;
        this.numberDoors = numberDoors;
        this.speedMax = speedMax;
        this.colour = colour;
        this.speedCurrently = speedCurrently;
        this.automatic = automatic;
        this.strikes=0;
    }
    //methods of class Automovil
    public boolean isAutomatic() {
        return automatic;
    }


    public void calculateTimetoArrive(int distance){
        System.out.println("The time to reach the target is: "+(distance/this.speedCurrently)+"hs");
    }

    public void increaseSpeed(int speed){
        if (this.speedCurrently+speed > speedMax){
            System.out.println("Sobrepaso la velocidad permitida "+(this.speedCurrently+speed)+"km/h > " +speedMax+" km/h");
            System.out.println("Se ha generado una multa de 10000$");
            this.strikes+=10000;
            System.out.println("El monto total de multas a pagar es de: "+strikes+"$");
        }else{
            this.speedCurrently +=speed;
            System.out.println("Su nueva velocidad es: "+this.speedCurrently+"km/h");
        }
    }
    public void decreaseSpeed(int speed){
        if (this.speedCurrently-speed < 0){
            System.out.println("No existe la velocidad negativa");
        }else{
            this.speedCurrently -=speed;
            System.out.println("Su nueva velocidad es: "+this.speedCurrently+"km/h");
        }
    }

    public void stopSpeed(){
        this.speedCurrently=0;
        System.out.println("Se ha parado el automovil");
    }

    //setter and getter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public TypeOfOil getTypeOil() {
        return typeOil;
    }

    public void setTypeOil(TypeOfOil typeOil) {
        this.typeOil = typeOil;
    }

    public TypeOfCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeOfCar typeCar) {
        this.typeCar = typeCar;
    }

    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public Colours getColour() {
        return colour;
    }

    public void setColour(Colours colour) {
        this.colour = colour;
    }

    public int getSpeedCurrently() {
        return speedCurrently;
    }

    public void setSpeedCurrently(int speedCurrently) {
        this.speedCurrently = speedCurrently;
    }
    @Override
    public String toString() {
        return "Automovil{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", engine=" + engine +
                ", typeOil=" + typeOil +
                ", typeCar=" + typeCar +
                ", numberDoors=" + numberDoors +
                ", speedMax=" + speedMax +
                ", colour=" + colour +
                ", speedCurrently=" + speedCurrently +
                '}';
    }
}

