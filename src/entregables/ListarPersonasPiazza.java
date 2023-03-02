package entregables;

import java.util.*;


public class ListarPersonasPiazza {

    public static void main(String[] args) {

        //Creación de elementos Persona
        Persona persona1=new Persona("Pablo", "Piazza");
        Persona persona2=new Persona("Laura", "Juiz");
        Persona persona3=new Persona("Juana", "Perez");
        Persona persona4=new Persona("Ivanna", "Rodriguez");
        Persona persona5=new Persona("Sebastian", "Lopez");

        //Creación de Lista
        ArrayList<Persona> listaPersonas=new ArrayList<>();

        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        listaPersonas.add(persona4);
        listaPersonas.add(persona5);


        /*Lo que se realiza a continuación es lo siguiente.
            Se utiliza el metodo sort de la clase collections para ordenar la lista a partir de los valores otorgados
            por el comparador.
            El comparador compara caracter a caracter los Strings, y retorna -1 si el caracter del elemento "p1" es menor
            que el del elemento "p2", 0 si son iguales o 1 en caso contrario.
            Al invertir los elementos en el return (comparar p2 frente a p1 en vez de comparar p1 frente a p2)
            la lista se ordena en sentido contrario
        */
        //Comparador usado para ordenar el nombre de forma alfabetica

        Collections.sort(listaPersonas, new Comparator<Persona>(){

            public int compare(Persona p1, Persona p2){

                return p1.getNombre().compareTo(p2.getNombre());
            }

        });

            System.out.println("Lista ordenada alfabeticamente por nombre: " + listaPersonas.toString());
            System.out.println();

        //Comparador usado para ordenar el apellido de forma alfabetica

        Collections.sort(listaPersonas, new Comparator<Persona>(){

            public int compare(Persona p1, Persona p2){

                return p1.getApellido().compareTo(p2.getApellido());
            }

        });

            System.out.println("Lista ordenada alfabeticamente por apellido: " + listaPersonas.toString());
            System.out.println();
        //Comparador usado para ordenar el apellido de forma inversa desde la Z a la A

        Collections.sort(listaPersonas, new Comparator<Persona>(){

            public int compare(Persona p1, Persona p2){

                return p2.getApellido().compareTo(p1.getApellido());
            }

        });

            System.out.println("Lista ordenada alfabeticamente inversa por apellido: " + listaPersonas.toString());
            System.out.println();
    }

}

//Creación de clase Persona
    class Persona {

    String nombre;
    String apellido;

    //Constructor genérico

        public Persona(){}

    //Constructor
        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        //Getter y Setters
        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        //sobreescribo método ToString
    @Override
    public String toString() {
        return  nombre + " " +apellido;
        }
}
