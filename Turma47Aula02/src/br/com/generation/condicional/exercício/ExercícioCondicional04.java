package br.com.generation.condicional.exerc�cio;

import java.util.Scanner;

public class Exerc�cioCondicional04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero, resultado;
		
		System.out.println("Digite o n�mero: ");
		numero = leia.nextDouble();
		
		if(numero%2 == 0) {
			System.out.println("Raiz quadrada de " + numero + " �: " + Math.sqrt(numero));
		}
		else {
			resultado = numero*numero;
			System.out.println(numero + " elevado ao quadrado �: " + resultado);
		}
		leia.close();
	}

}
