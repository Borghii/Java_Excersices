package poo.Exercise4_2;

public class Property {
    protected static int id;
    protected double area;
    protected String address;

    public Property(double area, String address) {
        this.area = area;
        this.address = address;
        id += 1;
    }
    void calculatePrice(int price){
        System.out.println("The price is: "+price*area);
    }
}
