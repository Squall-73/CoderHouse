package clases.Clase5;

public class Animal {

    String nombre;

    String raza;

    public void emitirsonido(){

    }
    public Animal(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String sonido) {
        this.raza = sonido;
    }
}
