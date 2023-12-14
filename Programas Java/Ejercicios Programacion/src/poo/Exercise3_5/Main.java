package poo.Exercise3_5;

public class Main {
    public static void main(String[] args) {

        Medicamento medicamento = new Medicamento("Ibuprofeno","MessiIndustry", "Oral" );
        Medicamento.Posologia posologia = medicamento.new Posologia("Adults and over 16 years old",200.0,"6hours","You should not take this medicine on an empty stomach.");

        medicamento.setPosologia(posologia);
        System.out.println(medicamento.toString());
        System.out.println(medicamento.posologia.toString());
    }
}
