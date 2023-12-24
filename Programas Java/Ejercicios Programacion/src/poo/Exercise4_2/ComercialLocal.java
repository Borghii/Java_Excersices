package poo.Exercise4_2;

public class ComercialLocal extends Locals{
    private String shoppingCentre;

    public ComercialLocal(double area, String address, Localization localization, String shoppingCentre) {
        super(area, address, localization);
        this.shoppingCentre = shoppingCentre;
    }
}
