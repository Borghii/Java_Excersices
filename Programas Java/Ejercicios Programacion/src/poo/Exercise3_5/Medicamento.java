package poo.Exercise3_5;

public class Medicamento {
    private String nameMedicine;
    private String nameProducer;
    private String routeAdministration;

    Posologia posologia;

    public Medicamento(String nameMedicine, String nameProducer, String routeAdministration) {
        this.nameMedicine = nameMedicine;
        this.nameProducer = nameProducer;
        this.routeAdministration = routeAdministration;
    }

    public void setPosologia(Posologia posologia){
        this.posologia=posologia;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nameMedicine='" + nameMedicine + '\'' +
                ", nameProducer='" + nameProducer + '\'' +
                ", routeAdministration='" + routeAdministration + '\'' +
                '}';
    }

    public class Posologia{
        private String users;
        private double dose;
        private String period;
        private String recommendations;

        public Posologia(String users, double dose, String period, String recommendations) {
            this.users = users;
            this.dose = dose;
            this.period = period;
            this.recommendations = recommendations;
        }

        @Override
        public String toString() {
            return "Posologia{" +
                    "users='" + users + '\'' +
                    ", dose=" + dose +
                    ", period='" + period + '\'' +
                    ", recommendations='" + recommendations + '\'' +
                    '}';
        }
    }





}
