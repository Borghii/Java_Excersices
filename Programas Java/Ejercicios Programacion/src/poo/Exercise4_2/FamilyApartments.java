package poo.Exercise4_2;

public class FamilyApartments extends Apartments{
    public FamilyApartments(double area, String address, int numberRooms, int numberBathrooms, double costAdministration) {
        super(area, address, numberRooms, numberBathrooms, costAdministration);
    }

    @Override
    public String toString() {
        return "FamilyApartments{" +
                "costAdministration=" + costAdministration +
                ", numberRooms=" + numberRooms +
                ", numberBathrooms=" + numberBathrooms +
                ", area=" + area +
                ", address='" + address + '\'' +
                "ID="+Property.id+
                '}';
    }
}
