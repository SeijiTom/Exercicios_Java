package br.com.generation.sequencial;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double galoes, litros;
		
		System.out.println("Digite a quantidade de gal�es: ");
		galoes = leia.nextDouble();
		
		litros = galoes * 3.7854;
		
		System.out.println(galoes + " gal�es s�o: " + litros + " Litros.");
		/*Esse aqui � para fazer coment�rios com mais
		 * de uma linha.*/
		// J� esse aqui � s� para coment�rios de uma linha
		
		leia.close();

	}

}
