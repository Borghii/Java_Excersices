package poo.Exercise4_2;

public class Locals extends Property{

    enum Localization{INTERN, STREET};
    Localization localization;
    public Locals(double area, String address, Localization localization) {
        super(area, address);
        this.localization = localization;
    }
}

