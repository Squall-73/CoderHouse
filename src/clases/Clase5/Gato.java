package clases.Clase5;

public class Gato extends Animal {

    public Gato (String nombre, String raza) {
        super(nombre, raza);

    }

    public void emitirsonido(){

        System.out.println("El gato maulla y hace miau");
    }
}
