package clases.Clase5;

public class Clase5 {

    public static void main(String[] args) {

        Animal perro1= new Perro("benito", "doberman");

        Animal gato1 = new Gato("alba", "callejero");

        System.out.println("El gato se llama " + perro1.nombre + " , es de raza " + perro1.raza);

        perro1.emitirsonido();

        System.out.println("El gato se llama " + gato1.nombre + " , es de raza " + gato1.raza);

        gato1.emitirsonido();
    }
}
