package poo.Exercise4_2;

public class OfficesLocal extends Locals{
    private boolean isGovernment;
    public OfficesLocal(double area, String address, Localization localization, boolean isGovernment) {
        super(area, address, localization);
        this.isGovernment = isGovernment;
    }
}
