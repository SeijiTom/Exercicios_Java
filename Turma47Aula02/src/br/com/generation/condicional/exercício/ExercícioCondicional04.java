package br.com.generation.condicional.exercício;

import java.util.Scanner;

public class ExercícioCondicional04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero, resultado;
		
		System.out.println("Digite o número: ");
		numero = leia.nextDouble();
		
		if(numero%2 == 0) {
			System.out.println("Raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
		}
		else {
			resultado = numero*numero;
			System.out.println(numero + " elevado ao quadrado é: " + resultado);
		}
		leia.close();
	}

}
