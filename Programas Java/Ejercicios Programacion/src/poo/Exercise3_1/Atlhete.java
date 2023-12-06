package poo.Exercise3_1;

public class Atlhete {

    private int identifierAthlete;
    private static int identifier=0;
    private String nameAthlete;
    private double time400;
    private static final String nationality = "Argentina";
    private static double timeTeam;

    public Atlhete(String nameAthlete, double time400){
        identifierAthlete = identifier+1;
        this.nameAthlete=nameAthlete;
        this.time400=time400;

    }

    public void sumTime(){
        timeTeam+=time400;
    }

    static public void getTime(){
        System.out.println(timeTeam);
    }

    @Override
    public String toString() {
        return "Atlhete{" +
                "identifierAthlete=" + identifierAthlete +
                ", nameAthlete='" + nameAthlete + '\'' +
                ", time400=" + time400 +'\'' +
                ", nationality= " +nationality+
                '}';
    }
}
