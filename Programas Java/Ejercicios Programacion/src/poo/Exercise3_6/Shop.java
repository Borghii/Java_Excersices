package poo.Exercise3_6;

import poo.Exercise3_6.Computer.OperativeSystem;

import java.lang.reflect.Array;
import java.util.Vector;

public class Shop {

    private String nameShop;
    private String nameProprietary;
    private int identifier;
    private int size;
    private Vector<Object> amountComputer;
    private static int numberComputers;

    public Shop(String nameShop, String nameProprietary,int size) {
        if (size<1){
            System.out.println("Isufficient computers");
        }else {
            this.nameShop = nameShop;
            this.nameProprietary = nameProprietary;
            this.amountComputer = new Vector<>();
            this.size=size;
        }



    }

    public boolean emptyShop(){
        return numberComputers==0;
    }
    public boolean fullShop(){
        return numberComputers==size;
    }

    public void addComputer(Computer computer){
        if (fullShop()){
            System.out.println("The computer`s shop is full");
        }else {
            amountComputer.add(computer);
            numberComputers++;
        }
    }

    public void deleteComputer(OperativeSystem operativeSystem){
        for (int i = 0; i < amountComputer.size(); i++) {
            Computer e = (Computer) amountComputer.get(i);
            if (e.getOperativeSystem()==operativeSystem){
                amountComputer.remove(i);
            }
        }
    }

    public void listComputers(){
        for(Object e:amountComputer)
//            if(e != null)
                System.out.println(e);

    }

}
