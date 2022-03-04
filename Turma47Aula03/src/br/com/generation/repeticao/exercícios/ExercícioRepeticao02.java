package br.com.generation.repeticao.exercícios;

import java.util.Scanner;

public class ExercícioRepeticao02 {

	public static void main(String[] args) {
		
		int[] vetor = new int [10];
		int par = 0, impar = 0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite 10 números: ");
		
		for (int i = 0; i <= 9; i++) {
		
			vetor[i] = leia.nextInt();
			
			if(vetor[i]%2 == 0) {
				par++;
			}
			else {
				impar++;
			}
		}
		System.out.println("Quantidade de números pares digitados: " + par);
		System.out.println("Quantidade de números ímpares digitados: " + impar);
		leia.close();
	}

}
