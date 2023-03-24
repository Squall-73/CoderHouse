package clases;

public class Prestamo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Capital solicitado
		
		int capitalSolicitado=200000;
		
		//Interes mensual
		
		float interes=0.08f;
		
		//Periodo de meses a pagar 
		
		int periodo=12;
		
		// Calculo el interes total
		
		float interesTotal=capitalSolicitado*interes*periodo;
		
		// Monto total a pagar:
		
		float montoTotal=capitalSolicitado+interesTotal;
		
		//Imprimo por consola
		
		System.out.println("El monto total a pagar es de : $" + montoTotal + " en el cual se incluye el capital solicitado de : $" + 
		
				capitalSolicitado + " y un interes de : 	" + interesTotal);
	}

}
