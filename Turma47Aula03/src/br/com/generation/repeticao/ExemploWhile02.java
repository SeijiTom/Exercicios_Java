package br.com.generation.repeticao;

public class ExemploWhile02 {

	public static void main(String[] args) throws InterruptedException {
		// Enquanto --------> while
		// Faça enquanto ---> do - while
		// Para ------------> for

		int contador = 10;
		
		while(contador >= -10) {
			
			System.out.println("Repetição nr: " + contador);
			
			contador--;
			Thread.sleep(500);
		}
		
	}

}
