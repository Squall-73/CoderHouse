package entregables;

public class NumeroFlotantePiazza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Numero flotante
		
		float nro=10.5987f;
		
		//Asigno la parte entera del numero flotante a un entero haciendo un casteo
		
		int entero=(int)nro;
		
		//Asigno la parte decimal del número flotante a otro float, sacando el resto que queda al dividir por 1	
		
		float decimal=nro%1;
		
		// Imprimo por consola ambas partes
		
		System.out.println("La parte entera del numero flotante es : " + entero);
		
		System.out.println("La parte decimal del numero flotante es : " + decimal);
		
		
	}

}
