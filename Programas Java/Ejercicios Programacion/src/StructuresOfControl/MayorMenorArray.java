package StructuresOfControl;

public class MayorMenorArray {
    public static void main(String[] args) {
        int [] enteros = {2,10,20,6,4,50,3,1,-2,-250,300};
        int numMayor=enteros[0];
        int numMenor=enteros[0];

        for (int entero : enteros) {

            if (entero > numMayor) {
                numMayor = entero;
            }
            if (entero < numMenor) {
                numMenor = entero;
            }

        }
        System.out.print("Mayor: "+numMayor+ " Menor: "+numMenor);

    }


}
