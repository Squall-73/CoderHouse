package clases.Ejercicio_Herencia;

public class Cuenta {

    int nroCuenta;

    double saldo;

    Persona titular;

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, double saldo, Persona titular) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.titular = titular;

    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    public void depositar(double importe) {

        saldo += importe;
    }


    public boolean puedeExtraer(double importe){

        boolean extraer;

        if(saldo-importe>=0){

            extraer=true;

        }else{extraer=false;}

        return extraer;
    }

    public void extraccion(double importe) {

        boolean  puede=puedeExtraer(importe);

        if(puede==true){
            saldo -= importe;
            System.out.println("Extracción realizada");
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrar(){

        System.out.println("El titular de la cuenta es : " + titular.toString() + " y tiene un saldo actual de : " + saldo + "$");
    }


}
