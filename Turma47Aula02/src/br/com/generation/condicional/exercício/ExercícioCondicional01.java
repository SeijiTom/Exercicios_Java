package br.com.generation.condicional.exercício;

import java.util.Scanner;

public class ExercícioCondicional01 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números: ");
		n1 = leia.nextInt();
		n2 = leia.nextInt();
		n3 = leia.nextInt();
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("O maior número é: " + n1);
		}
		else if(n2 >= n1 && n2 >= n3) {
			System.out.println("O maior número é: " + n2);
		}
		else {
			System.out.println("O maior número é: " + n3);
		}
		leia.close();
	}
}