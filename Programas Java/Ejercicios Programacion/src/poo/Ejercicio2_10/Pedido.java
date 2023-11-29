package poo.Ejercicio2_10;

public class Pedido {

    enum FirstCourse{
        CAPRESE_SALAD(10),
        BUTTERNUT_SQUASH_SOUP(20),
        SALMON_CARPACCIO(30);

        private final double price;
        FirstCourse(double price){
            this.price=price;
        }

        public double getPrice(){
            return price;
        }

    };
    private FirstCourse firstCourse;
    enum SecondCourse {
        LEMON_CHICKEN(10),
        VEGETARIAN_LASAGNA(20),
        SEAFOOD_PAELLA(30);

        private final double price;

        SecondCourse(double price){
            this.price=price;
        }

        public double getPrice() {
            return price;
        }
    }
    private SecondCourse secondCourse;

    enum Drink {
        MOJITO(10),
        FRUIT_INFUSED_WATER(20),
        RED_WINE(30);

        private final double price;

        Drink(double price){

            this.price=price;
        }

        public Double getPrice() {
            return price;
        }
    }
    private Drink drink;

    enum Dessert {
        TIRAMISU(10),
        CHOCOLATE_COVERED_FRUIT(10),
        VANILLA_ICE_CREAM_WITH_FRUIT(10);

        private final double price;

        Dessert(double price){
            this.price=price;
        }

        public double getPrice() {
            return price;
        }
    }
    private Dessert dessert;

    public Pedido(){

    }

    public void printPrice(FirstCourse firstCourse) {
        System.out.println("The price is equal to: " + firstCourse.getPrice());
    }

    public void printPrice(SecondCourse secondCourse) {
        System.out.println("The price is equal to: " + secondCourse.getPrice());
    }

    public void printPrice(Drink drink) {
        System.out.println("The price is equal to: " + drink.getPrice());
    }

    public void printPrice(Dessert dessert) {
        System.out.println("The price is equal to: " + dessert.getPrice());
    }

    public void printPrice(FirstCourse firstCourse, SecondCourse secondCourse) {
        System.out.println("The price is equal to: " + (firstCourse.getPrice() + secondCourse.getPrice()));
    }

    public void printPrice(FirstCourse firstCourse, Drink drink) {
        System.out.println("The price is equal to: " + (firstCourse.getPrice() + drink.getPrice()));
    }

    public void printPrice(FirstCourse firstCourse, Dessert dessert) {
        System.out.println("The price is equal to: " + (firstCourse.getPrice() + dessert.getPrice()));
    }

    public void printPrice(SecondCourse secondCourse, Drink drink) {
        System.out.println("The price is equal to: " + (secondCourse.getPrice() + drink.getPrice()));
    }

    public void printPrice(SecondCourse secondCourse, Dessert dessert) {
        System.out.println("The price is equal to: " + (secondCourse.getPrice() + dessert.getPrice()));
    }

    public void printPrice(Drink drink, Dessert dessert) {
        System.out.println("The price is equal to: " + (drink.getPrice() + dessert.getPrice()));
    }

    public void printPrice(FirstCourse firstCourse, SecondCourse secondCourse, Drink drink) {
        System.out.println("The price is equal to: " + (firstCourse.getPrice() + secondCourse.getPrice() + drink.getPrice()));
    }

    public void printPrice(FirstCourse firstCourse, SecondCourse secondCourse, Dessert dessert) {
        System.out.println("The price is equal to: " + (firstCourse.getPrice() + secondCourse.getPrice() + dessert.getPrice()));
    }









}
