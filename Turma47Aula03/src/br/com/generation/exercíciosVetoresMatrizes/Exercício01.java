package br.com.generation.exercíciosVetoresMatrizes;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		int[] vetor = new int [5]; 
		double maiorP = 0.0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite as 5 pontuações obtidas da atividade: ");
		
		for(int i = 0; i <=4; i++) {
			
			vetor[i] = leia.nextInt();
			
			if(vetor[i] >= maiorP) {
				maiorP = vetor[i];
			}
			
		}
		for(int i = 0; i <=4; i++) {
			System.out.print(" | " + vetor[i] + " | ");
		}
			System.out.println();
			System.out.println("A maior pontuação obtida foi: " + maiorP);
			leia.close();
	}

}
