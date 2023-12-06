package poo.Exercise3_2;

public class Strings {

    private static String value = "Object Oriented Programming ";

    public static void main(String[] args) {

        String word = "Todo bIen Perri";

        System.out.println(getNumberCapitalLetters(word));
        System.out.println(countWord(word,'E'));
        System.out.println(invertWord(word));

    }

    public static int getNumberCapitalLetters(String word){
        int cant=0;
        char [] words = word.toCharArray();
        for (char e:words) {
            if (Character.isUpperCase(e))
                cant++;
        }
        return cant;
    }

    public static int countWord(String word,char letter){
        int amount=0;
        char [] words = word.toLowerCase().toCharArray();
        for(char e:words){
            if (Character.toLowerCase(letter) == e)
                amount++;
        }

        return amount;
    }

    public static String deleteSpaceWhite(String word){
        char [] words = word.toCharArray();
        String wordWithoutSpaces = "";
        for (char e:words){
            if(!Character.isSpaceChar(e))
                wordWithoutSpaces = wordWithoutSpaces.concat(String.valueOf(e));
        }
        return wordWithoutSpaces;

    }

    public static String invertWord(String word){
        return new StringBuilder(word).reverse().toString();
    }


}
