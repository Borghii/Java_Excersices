package poo.Exercise4_2;

public class Houses extends ResidentialProperties {
    protected int amountFloors;

    public Houses(double area, String address, int numberRooms, int numberBathrooms,int amountFloors) {
        super(area, address, numberRooms, numberBathrooms);
        this.amountFloors=amountFloors;

    }
}
