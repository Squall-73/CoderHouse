package clases;

public class Clase4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] colores= {"Blanco", "Negro", "Azul"};
		
		imprimir(colores);
		
		int cant=imprimir2(colores);
		
		System.out.println(cant);
	}

	
	private static void imprimir(String[] colores) {
		int i=1;
		
		for (String c: colores) {
			
			System.out.println("Color " + i + ": "+ c);
			i++;
		}
	}
	
	private static int imprimir2(String[] colores) {
		
		for (String c: colores) {
			
			System.out.println("Color: " + c);
			
		}
		
		return colores.length;
		

	}
}
