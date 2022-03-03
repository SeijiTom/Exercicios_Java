package br.com.generation.condicional;

import java.util.Scanner;

public class CalculadoraSwitch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double n1, n2, resultado = 0;
		char operador;
		
		System.out.println("Digite o primeiro número: ");
		n1 = scan.nextDouble();
		
		System.out.println("Escolha um dos operadores ( + | - | * | / )");
		operador = scan.next().charAt(0);
		
		System.out.println("Digite o segundo número: ");
		n2 = scan.nextDouble();
		
		switch(operador) {
		
		case '+': resultado = n1 + n2;
		System.out.println("Resultado: " + resultado);
		break;
		
		case '-': resultado = n1 - n2;
		System.out.println("Resultado: " + resultado);
		break;
		
		case '*': resultado = n1 * n2;
		System.out.println("Resultado: " + resultado);
		break;
		
		case '/': resultado = n1 / n2;
		System.out.println("Resultado: " + resultado);
		break;
		
		default: System.out.println("Operador inválido!");
		}
		scan.close();
	}

}
