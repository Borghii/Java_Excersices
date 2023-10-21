public class Cuenta {

    private String nombreCliente;
    private String numeroCuenta;
    private double tipoInteres;
    private int saldo;

    Cuenta(){

    }

    Cuenta(String nombreCliente, String numeroCuenta, double tipoInteres, int saldo ){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.tipoInteres = tipoInteres;
        this.saldo = saldo;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean ingreso(int saldo){
        if (saldo>=0){
            this.saldo+=saldo;
            return true;
        } else {
            System.out.println("Ingreso un saldo negativo");
            return false;
        }
    }

    public boolean reintegro(int saldo){
        if (saldo>=0){
            this.saldo-=saldo;
            return true;
        } else {
            System.out.println("No tiene saldo");
            return false;
        }
    }

    public void transferencia(Cuenta cuenta, int importe){
        if ((importe>0) & (saldo>=importe)){
            cuenta.ingreso(importe);
            reintegro(importe);
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", tipoInteres=" + tipoInteres +
                ", saldo=" + saldo +
                '}';
    }
}
