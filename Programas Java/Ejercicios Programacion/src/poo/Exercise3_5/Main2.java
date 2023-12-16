package poo.Exercise3_5;

public class Main2 {
    public static void main(String[] args) {
        ShippingPackage shipping = new ShippingPackage(2, ShippingPackage.TypeShipment.INTERNATIONAL, ShippingPackage.Content.DOCUMENT);
        ShippingPackage.Person person = shipping.new Person("Tomas","Borghi",44994806,"Orsetti 586",2674626);

        person.calculatePriceShipping();
    }
}
