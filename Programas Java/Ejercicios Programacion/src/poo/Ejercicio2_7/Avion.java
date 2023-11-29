package poo.Ejercicio2_7;

public class Avion {

    private String nameManufacturer;
    private int numberEngines;

    public Avion(String nameManufacturer, int numberEngines){
        this.nameManufacturer=nameManufacturer;
        this.numberEngines=numberEngines;
    }

    public void printNameManufacturer(){
        System.out.println("The name of the manufacturer is: "+ nameManufacturer);
    };

    public void changeManufacturer(Avion manufacturer){
        manufacturer.setNameManufacturer("Loockheed");
    }

    public String getNameManufacturer() {
        return nameManufacturer;
    }

    public void setNameManufacturer(String nameManufacturer) {
        this.nameManufacturer = nameManufacturer;
    }

    public int getNumberEngines() {
        return numberEngines;
    }

    public void setNumberEngines(int numberEngines) {
        this.numberEngines = numberEngines;
    }










}
