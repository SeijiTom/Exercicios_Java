package br.com.generation.metodos;

public class TestaMetodoFora {

	public static String metodo6(int i, int f) {//metodo String e n�o void
		//n�o deu pra colocar final pq � uma falavra reservada
		// ent�o coloquei f e i de inicial
		
		String numeroString = "";
		
		for(int c = i; c <= f; c++) {
			
			numeroString += c + " ";
			
		}
		
		return numeroString;
		
	}
	
}
