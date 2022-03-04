package br.com.generation.matriz;

public class ExemploMatriz01 {

	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[2][4];
		
		notasAlunos[0][0] = 9.9;
		notasAlunos[0][1] = 7.9;
		notasAlunos[0][2] = 6.5;
		notasAlunos[0][3] = 8.5;
		
		notasAlunos[1][0] = 0.1;
		notasAlunos[1][1] = 9.7;
		notasAlunos[1][2] = 5.6;
		notasAlunos[1][3] = 5.8;
		
		System.out.println("Calcule a média dos Alunos: ");
		double soma;
		//Impressão das notas
		
		for(int l = 0; l < notasAlunos.length; l++) {
			
			soma = 0;
			for(int c = 0; c < notasAlunos[l].length; c++) {
				
				soma += notasAlunos[l][c];
				System.out.print(notasAlunos[l][c] + " | ");
				
			}
			
			System.out.println();
			System.out.println("A média do aluno " + (l+1) + " é: " + (soma/4));
		}
	}

}
