package br.com.generation.metodos;

public class TestaMetodoFora {

	public static String metodo6(int i, int f) {//metodo String e não void
		//não deu pra colocar final pq é uma falavra reservada
		// então coloquei f e i de inicial
		
		String numeroString = "";
		
		for(int c = i; c <= f; c++) {
			
			numeroString += c + " ";
			
		}
		
		return numeroString;
		
	}
	
}
