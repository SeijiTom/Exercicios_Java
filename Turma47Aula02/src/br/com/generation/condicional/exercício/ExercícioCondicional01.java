package br.com.generation.condicional.exerc�cio;

import java.util.Scanner;

public class Exerc�cioCondicional01 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("O maior n�mero �: " + n1);
		}
		else if(n2 >= n1 && n2 >= n3) {
			System.out.println("O maior n�mero �: " + n2);
		}
		else {
			System.out.println("O maior n�mero �: " + n3);
		}
		leia.close();
	}
}