package br.com.generation.repeticao;

public class ExemploWhile02 {

	public static void main(String[] args) throws InterruptedException {
		// Enquanto --------> while
		// Fa�a enquanto ---> do - while
		// Para ------------> for

		int contador = 10;
		
		while(contador >= -10) {
			
			System.out.println("Repeti��o nr: " + contador);
			
			contador--;
			Thread.sleep(500);
		}
		
	}

}
