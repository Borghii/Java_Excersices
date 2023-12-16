package poo.Exercise3_6;

public class Main {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Ryzen",16,"2000Mhz", Computer.OperativeSystem.APPLE,60000 );
        Computer computer2 = new Computer("Intel",8,"3000Mhz", Computer.OperativeSystem.LINUX,80000 );
        Computer computer3 = new Computer("Intel",8,"3000Mhz", Computer.OperativeSystem.WINDOWS,90000 );
        Computer computer4 = new Computer("Nashe",16,"2000Mhz", Computer.OperativeSystem.APPLE,60000 );
        Computer computer5 = new Computer("Intel",8,"3000Mhz", Computer.OperativeSystem.WINDOWS,90000 );

        Shop shop1= new Shop("Borghi Industry","Borghi",10);
        shop1.addComputer(computer1);
        shop1.addComputer(computer2);
        shop1.addComputer(computer3);
        shop1.addComputer(computer4);
        shop1.addComputer(computer5);

        System.out.println("List of computers: ");
        shop1.listComputers();

        System.out.println("List of updated computers: ");

        shop1.deleteComputer(Computer.OperativeSystem.APPLE);

        shop1.listComputers();

    }
}
