package poo.Exercise3_5;

public class ShippingPackage {
    private Person sender;
    private Person recipient;
    private int weight;
    enum TypeShipment{ NATIONAL, INTERNATIONAL};
    private final TypeShipment typeShipment;
    enum Content{DOCUMENT, MERCHANDISE};
    private final Content content;

    public ShippingPackage(int weight, TypeShipment typeShipment, Content content) {
        this.weight = weight;
        this.typeShipment = typeShipment;
        this.content = content;
    }

    public void setSender(Person sender,Person recipient){
        this.sender=sender;
        this.recipient=recipient;
    }

    public class Person{
        private String name;
        private String surname;
        private int identyDocument;
        private String adress;
        private int numberPhone;

        public Person(String name, String surname, int identyDocument, String adress, int numberPhone) {
            this.name = name;
            this.surname = surname;
            this.identyDocument = identyDocument;
            this.adress = adress;
            this.numberPhone = numberPhone;
        }

        public void calculatePriceShipping(){
            int price=0;
            if (typeShipment==TypeShipment.NATIONAL){
                if (content== Content.DOCUMENT){
                    if (weight>2){
                        price=weight*3000;
                    }else{
                        price=weight*2000;
                    }
                }else{
                    if (weight>5){
                        price=weight*7000;
                    }else{
                        price=weight*5000;
                    }
                }
            }
            if (typeShipment==TypeShipment.INTERNATIONAL){
                if (content== Content.DOCUMENT){
                    if (weight>2){
                        price=weight*15000;
                    }else{
                        price=weight*10000;
                    }
                }else{
                    if (weight>5){
                        price=weight*20000;
                    }else{
                        price=weight*12000;
                    }
                }
            }
            System.out.println("The price final is: "+price);
        }
    }
}
