package poo.Exercise4_2;

public class Apartments extends ResidentialProperties {
    protected double costAdministration;

    public Apartments(double area, String address, int numberRooms, int numberBathrooms, double costAdministration) {
        super(area, address, numberRooms, numberBathrooms);
        this.costAdministration = costAdministration;
    }

    @Override
    public String toString() {
        return "Apartments{" +
                "costAdministration=" + costAdministration +
                ", numberRooms=" + numberRooms +
                ", numberBathrooms=" + numberBathrooms +
                ", area=" + area +
                ", address='" + address + '\'' +
                '}';
    }

}

