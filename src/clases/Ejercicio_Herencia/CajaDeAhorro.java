package clases.Ejercicio_Herencia;

public class CajaDeAhorro extends Cuenta{

    int intentos;

    double limite;

    public CajaDeAhorro(int nroCuenta, double saldo, Persona titular, int intentos, double limite) {
        super(nroCuenta, saldo, titular);
        this.intentos = intentos;
        this.limite = limite;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public boolean puedeExtraer(double importe) {

        boolean extraer;

        if(intentos>0 && saldo-importe>=0 && limite-importe>=0){
            extraer=true;

        }else{extraer=false;}

        return extraer;

        }

    @Override
    public void extraccion(double importe) {

        boolean  puede=puedeExtraer(importe);

        if(puede==true){
            saldo -= importe;
            intentos--;
            limite-=importe;
            System.out.println("Extracción realizada");

        } else if (intentos==0) {
            System.out.println("No quedan extracciones disponibles");
        } else if (limite-importe<0) {
            System.out.println("Limite diario superado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void mostrar(){

        System.out.println("El titular de la cuenta es : " + titular.toString() + " tiene un saldo actual de : " + saldo + "$, le quedan " + intentos + " extraciones por realizar hoy y " +
                "su saldo disponible para extraer es " + limite);
    }
}

