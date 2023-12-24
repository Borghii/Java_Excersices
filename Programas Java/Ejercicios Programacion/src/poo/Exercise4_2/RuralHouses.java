package poo.Exercise4_2;

public class RuralHouses extends Houses{
    private final double distanceMunicipalCapital;
    public double altitudeAboveSea;

    public RuralHouses(double area, String address, int numberRooms, int numberBathrooms, int amountFloors, double distanceMunicipalCapital, double altitudeAboveSea) {
        super(area, address, numberRooms, numberBathrooms, amountFloors);
        this.distanceMunicipalCapital = distanceMunicipalCapital;
        this.altitudeAboveSea = altitudeAboveSea;
    }

    void calculatePrice() {
        super.calculatePrice(1500000);
    }
}
