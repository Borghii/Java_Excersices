package StructuresOfControl;

public class ElementosComunesArray {

    public static void main(String[] args) {
        
        int [] array1 = {1,2,3,4};
        int [] array2 = {4,5,6,7};

        for (int enteros1:array1) {
            for (int enteros2:array2) {
                if (enteros1==enteros2){
                    System.out.println(enteros1);
                }
            }
        }
        
        
        
    }
}
