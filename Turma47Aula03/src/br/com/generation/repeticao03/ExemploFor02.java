package br.com.generation.repeticao03;

public class ExemploFor02 {

	public static void main(String[] args) throws InterruptedException {
		
		int n = 20;
		int i, soma;
		
		for(i = 0, soma = 0; i <= n; i++) {
			System.out.println("Soma = " + soma + "+" + i);
			soma += i; // --> soma = soma + i
			System.out.println(" = " + soma);
			Thread.sleep(500);
		}
	}

}
