package clases.Ejercicio_Herencia;

public class Ejercicio_Herencia {

    public static void main(String[] args) {

        Persona pers1=new Persona(35242384, "Pablo", "Piazza");

        Cuenta cuenta1=new CuentaCorriente(1,5000,pers1,500);

        cuenta1.extraccion(2500);
        cuenta1.extraccion(2500);
        cuenta1.extraccion(500);
        cuenta1.extraccion(2500);

        cuenta1.mostrar();
    }

 }
