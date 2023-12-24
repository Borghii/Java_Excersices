package poo.Exercise4_2;

public class ResidentialProperties extends Property {
    protected int numberRooms;
    protected int numberBathrooms;
    public ResidentialProperties(double area, String address, int numberRooms, int numberBathrooms) {
        super(area, address);
        this.numberRooms=numberRooms;
        this.numberBathrooms=numberBathrooms;
    }
}
