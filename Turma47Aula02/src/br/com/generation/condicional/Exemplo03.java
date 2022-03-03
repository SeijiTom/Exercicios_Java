package br.com.generation.condicional;

import java.util.Scanner;

public class Exemplo03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escreva uma letra entre a e d: ");
		String letra = entrada.next();
		
		switch(letra) {
		case "a", "A": //aqui é possivel escolher entre a e A
			System.out.println("Anna");
		break;
		
		case "b", "B":
			System.out.println("Bruno");
		break;
		
		case "c", "C":
			System.out.println("Carlos");
		break;
		
		case "d", "D":
			System.out.println("Daniela");
		break;
		
		default:
			System.out.println("Opção inválida!");
		break;
		}
		
		entrada.close();
	}

}
