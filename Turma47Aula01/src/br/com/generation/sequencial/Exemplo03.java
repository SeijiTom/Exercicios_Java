package br.com.generation.sequencial;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Digite a quantidade de galões: ");
		galoes = leia.nextDouble();
		
		litros = galoes * 3.7854;
		
		System.out.println(galoes + " galões são: " + litros + " Litros.");
		/*Esse aqui é para fazer comentários com mais
		 * de uma linha.*/
		// Já esse aqui é só para comentários de uma linha
		
		leia.close();

	}

}
