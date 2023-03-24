package clases;

import java.util.ArrayList;


public class Clase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ArrayList<Integer> nro= new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			
			nro.add((int) (Math.random()*1000));
			
		}
		
		int j=0;
		
		while(j<nro.size()) {
			
			System.out.println("El elemento " + j + " vale " + nro.get(j));
			
			if (nro.get(j)%3==0 && nro.get(j)!=0) {
				
				j=nro.size();
			}
			
			j++;
		}
		
}
}
