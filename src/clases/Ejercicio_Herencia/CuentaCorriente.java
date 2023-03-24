package clases.Ejercicio_Herencia;

public class CuentaCorriente extends Cuenta {

    double limiteDescubierto;

    public CuentaCorriente(int nroCuenta, double saldo, Persona titular, double limiteDescubierto) {
        super(nroCuenta, saldo, titular);
        this.limiteDescubierto = limiteDescubierto;
    }

    public double getLimiteDescubierto() {
        return limiteDescubierto;
    }

    public void setLimiteDescubierto(double limiteDescubierto) {
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public boolean puedeExtraer(double importe) {

        boolean extraer;

        if(saldo-importe+limiteDescubierto>=0){
            extraer=true;
            System.out.println("Extracción realizada");

        }else{extraer=false;}

        return extraer;

    }

    @Override
    public void extraccion(double importe) {

        boolean  puede=puedeExtraer(importe);

        if(puede==true){
            saldo -= importe;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrar(){
        System.out.println("El titular de la cuenta es : " + titular.toString() + " tiene un saldo actual de : " + saldo + "$, y su descubierto máximo es de " + limiteDescubierto + "$");

    }
}
