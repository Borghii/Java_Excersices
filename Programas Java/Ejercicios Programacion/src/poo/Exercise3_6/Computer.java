package poo.Exercise3_6;

public class Computer {

    private String brand;
    private int amount;
    private String processorCharacteristics;
    enum OperativeSystem{WINDOWS,APPLE,LINUX}
    private OperativeSystem operativeSystem;
    private double priceComputer;

    public Computer(String brand, int amount, String processorCharacteristics, OperativeSystem operativeSystem, double priceComputer) {
        this.brand = brand;
        this.amount = amount;
        this.processorCharacteristics = processorCharacteristics;
        this.operativeSystem = operativeSystem;
        this.priceComputer = priceComputer;
    }

    public OperativeSystem getOperativeSystem() {
        return operativeSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", amount=" + amount +
                ", processorCharacteristics='" + processorCharacteristics + '\'' +
                ", operativeSystem=" + operativeSystem +
                ", priceComputer=" + priceComputer +
                '}';
    }
}
