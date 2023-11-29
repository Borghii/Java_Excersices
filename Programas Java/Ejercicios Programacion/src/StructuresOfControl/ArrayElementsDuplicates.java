package StructuresOfControl;

import java.util.ArrayList;

public class ArrayElementsDuplicates {

    public static void main(String[] args) {

        int[] unArray = {1,2,3,4,5,6,6,7,8,8};
        ArrayList<Integer> duplicators = new ArrayList<Integer>();

        for (int i=0 ; i<unArray.length;i++){
            for (int j = 0; j <unArray.length ; j++) {

                if (unArray[i] == unArray[j] && i != j) {
                    if (!duplicators.contains(unArray[i])){
                        duplicators.add(unArray[i]);
                    }
                }
            }
        }

        for (int e:duplicators) {
            System.out.println(e);
        }

    }
}
