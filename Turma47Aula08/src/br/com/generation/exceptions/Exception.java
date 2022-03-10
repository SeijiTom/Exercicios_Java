package br.com.generation.exceptions;

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) throws InterruptedException {
		Scanner entrada = new Scanner(System.in);
		
		int[] vetor = new int[4];
		
		System.out.println("Antes do erro!");
		try {
			System.out.println("Digite o valor do vetor <= 3: ");
			vetor[4] = entrada.nextInt();//-> posicao 4 no vetor nao existe pois ele possui 4 posições porém vai de 0-3
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Erro no código!");
		}
		for(int i = 0; i < 10; i++) {
			System.out.println("Contador i: " + i);
			Thread.sleep(500);
		}
		entrada.close();
	}

}