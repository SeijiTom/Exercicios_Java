package br.com.generation.condicional.exercício;

import java.util.Scanner;

public class ExercícioCondicional02 {

	public static void main(String[] args) {
		
		double n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite os três números: ");
		n1 = leia.nextDouble();
		n2 = leia.nextDouble();
		n3 = leia.nextDouble();
		
		if(n1 >= n2 && n2 >= n3) {
			System.out.println("Números na ordem crescente: " + n3 + " | " + n2 + " | " + n1);
		}
		else if (n1 >= n3 && n3 >= n2) {
			System.out.println("Números na ordem crescente: " + n2 + " | " + n3 + " | " + n1);
		}
		else if (n1 >= n2 && n3 >= n1) {
			System.out.println("Números na ordem crescente: " + n2 + " | " + n1 + " | " + n3);
		}
		else if (n1 >= n3 && n2 >= n1) {
			System.out.println("Números na ordem crescente: " + n3 + " | " + n1 + " | " + n2);
		}
		else if (n1 <= n3 && n2 >= n3) {
			System.out.println("Números na ordem crescente: " + n1 + " | " + n3 + " | " + n2);
		}
		else {
			System.out.println("Números na ordem crescente: " + n1 + " | " + n2 + " | " + n3);
		}
		leia.close();
	}

}
