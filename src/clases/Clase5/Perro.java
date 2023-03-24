package clases.Clase5;

public class Perro extends Animal{


    public Perro(String nombre, String raza) {
        super(nombre, raza);

    }

    public void emitirsonido(){

        System.out.println("El perro ladra y hace guau");
    }
}
