package br.com.generation.repeticao;

public class ExemploWhile {

	public static void main(String[] args) throws InterruptedException {
		// Enquanto --------> while
		// Faça enquanto ---> do - while
		// Para ------------> for

		int contador = 0;
		
		while(contador <= 10) {
			
			System.out.println("Repetição nr: " + contador);
			
			contador++;
			Thread.sleep(1000);
		}
		
	}

}
