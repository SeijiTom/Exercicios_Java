package br.com.generation.exerc�ciosVetoresMatrizes;

import java.util.Scanner;

public class Exerc�cio01 {

	public static void main(String[] args) {
		
		int[] vetor = new int [5]; 
		double maiorP = 0.0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite as 5 pontua��es obtidas da atividade: ");
		
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
			System.out.println("A maior pontua��o obtida foi: " + maiorP);
			leia.close();
	}

}
