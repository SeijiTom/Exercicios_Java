package br.com.generation.exercíciosVetoresMatrizes;

import java.util.Scanner;

public class Exercício04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double[][] valores = new double[3][3];
		double somaTotal = 0.0, somaDiagonal = 0.0;
		
		for(int l = 0; l < valores.length; l++) {
			
			for(int c = 0; c < valores[l].length; c++) {
				
				System.out.printf("Digite os valores %d %d: " , l,c);
				
				valores[l][c] = entrada.nextDouble();
				
				somaTotal = valores[l][c] + somaTotal;
				somaDiagonal = valores[0][0] + valores[1][1] + valores[2][2];
			}
			
		}
		
		System.out.println("Valores somados: " + somaTotal);
		System.out.println("Valores somados da primeira diagonal: " + somaDiagonal);
		entrada.close();
	}

}
