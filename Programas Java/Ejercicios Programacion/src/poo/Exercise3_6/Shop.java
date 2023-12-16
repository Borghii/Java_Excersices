package poo.Exercise3_6;

import poo.Exercise3_6.Computer.OperativeSystem;

import java.lang.reflect.Array;

public class Shop {

    private String nameShop;
    private String nameProprietary;
    private int identifier;
    private static int id;
    Computer [] amountComputer;
    private static int numberComputers;

    public Shop(String nameShop, String nameProprietary, int size) {
        if (size<1){
            System.out.println("Insufficient number of computers");
        }else {
            this.nameShop = nameShop;
            this.nameProprietary = nameProprietary;
            amountComputer = new Computer[size];
            id=id+1;
            this.identifier=id;
        }
    }

    public boolean emptyShop(){
        return numberComputers==0;
    }
    public boolean fullShop(){
        return numberComputers==amountComputer.length;
    }

    public void addComputer(Computer computer){
        if (fullShop()){
            System.out.println("The computer`s shop is full");
        }else {
            amountComputer[numberComputers]=computer;
            numberComputers++;
        }
    }

    public void deleteComputer(OperativeSystem operativeSystem){
        for (int i = 0; i < amountComputer.length; i++)
            if (amountComputer[i]!= null)
                if (amountComputer[i].getOperativeSystem() ==operativeSystem )
                    amountComputer[i]=null;

                    for (int i = 0; i <amountComputer.length-1 ; i++) {
                        amountComputer[i]=amountComputer[i+1];
                    }
    }
    public void listComputerBrand(OperativeSystem operativeSystem){
        for (int i = 0; i < amountComputer.length; i++)
            if (amountComputer[i]!= null)
                if (amountComputer[i].getOperativeSystem() ==operativeSystem )
                    System.out.println(amountComputer[i]);
    }

    public void listComputers(){
        for(Computer e:amountComputer)
//            if(e != null)
                System.out.println(e);

    }

}
