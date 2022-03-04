package br.com.generation.matriz;

import java.util.Scanner;

public class ExemploMatriz02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double[][] notasAlunos = new double[2][4];
		System.out.println("===Notas dos Alunos===");
		
		for(int l = 0; l < notasAlunos.length; l++) {
			
			for(int c = 0; c < notasAlunos[l].length; c++) {
				
				System.out.printf("Digite as notas %d %d: " , l,c);
				//%d serve para mostrar ao usuario
				//s�o dois %d pois s�o dois numeros a serem mostrados, no caso as posicoes l,c da matriz
				//seria %f se a variavel fosse flutuante e assim por diante
				notasAlunos[l][c] = entrada.nextDouble();
			}
			System.out.println();
		}
		
		System.out.println("Calcule a m�dia dos Alunos: ");
		double soma;
		//Impress�o das notas
		
		for(int l = 0; l < notasAlunos.length; l++) {
			
			soma = 0;
			for(int c = 0; c < notasAlunos[l].length; c++) {
				
				soma += notasAlunos[l][c];
				System.out.print(notasAlunos[l][c] + " | ");
				
			}
			
			System.out.println();
			System.out.println("A m�dia do aluno " + (l+1) + " �: " + (soma/4));
			
			entrada.close();
		}
		
		
	}

}
