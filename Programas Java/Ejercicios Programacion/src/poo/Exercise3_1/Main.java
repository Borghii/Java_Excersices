package poo.Exercise3_1;

public class Main {
    public static void main(String[] args) {
        Atlhete athlete1 = new Atlhete("Tomas",10);
        Atlhete athlete2 = new Atlhete("Tos",8);
        Atlhete athlete3 = new Atlhete("lola",8);
        Atlhete athlete4 = new Atlhete("nashe",7);

        athlete1.sumTime();
        athlete2.sumTime();
        athlete3.sumTime();
        athlete4.sumTime();

        Atlhete.getTime();

        System.out.println(athlete1.toString());



    }


}
