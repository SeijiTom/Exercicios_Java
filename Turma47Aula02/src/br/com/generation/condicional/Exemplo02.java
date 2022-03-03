package br.com.generation.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double numero1, numero2, resultado = 0.0;
		char operacao;
		
		System.out.println("Digite o primeiro número: ");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite a operação: ");
		operacao = entrada.next().charAt(0);
		
		System.out.println("Digite o segundo número");
		numero2 = entrada.nextDouble();
		
		if(operacao == '+') {
			resultado = numero1 + numero2;
		}
		else if(operacao == '-') {
			resultado = numero1 - numero2;
		}
		else if(operacao == '*') {
			resultado = numero1 * numero2;
		}
		else if (operacao == '/') {
			resultado = numero1 / numero2;
		}
		else {
			System.out.println("Operação inválida!");
		}
		
		System.out.println("Resultado da operação: " + resultado);
		entrada.close();
	}

}
