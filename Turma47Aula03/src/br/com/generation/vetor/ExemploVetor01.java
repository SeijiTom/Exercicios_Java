package br.com.generation.vetor;

public class ExemploVetor01 {

	public static void main(String[] args) {
		
		int[] arrayVetor = new int[10]; // [0]...[9]
		
		arrayVetor[7] = 6;
		arrayVetor[2] = 5000;
		
		int numero = 900;
		
		arrayVetor[5] = numero;
		arrayVetor[3] = 456;
		
		int numero2 = arrayVetor[3];
		
		for(int i = 0; i <= 9; i++) {
			System.out.println(i + " - " + arrayVetor[i]);
		}
		System.out.println(numero2);

	}

}
