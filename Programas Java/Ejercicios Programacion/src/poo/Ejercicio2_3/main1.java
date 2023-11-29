package poo.Ejercicio2_3;

public class main1 {
    public static void main(String[] args) {

        Automovil car1 = new Automovil("FORD",1998,30, Automovil.TypeOfOil.BIOETANOL, Automovil.TypeOfCar.EXECUTIVE,4,120,Automovil.Colours.BLACK,100,true);

        car1.increaseSpeed(10);
        car1.increaseSpeed(30);
        car1.increaseSpeed(20);
        System.out.println("Es automatic:"+car1.isAutomatic());

    }
}
