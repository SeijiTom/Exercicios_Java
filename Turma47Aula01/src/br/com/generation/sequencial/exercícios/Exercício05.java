package br.com.generation.sequencial.exercícios;

import java.util.Scanner;

public class Exercício05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double nota1, nota2, nota3, resultado;
		
		System.out.println("Digite os valores das 3 notas: ");
		
		nota1 = leia.nextDouble();
		nota2 = leia.nextDouble();
		nota3 = leia.nextDouble();
		
		if(nota1 >= 0 && nota2 >= 0 && nota3 >= 0) {
		
		resultado = ((nota1*2.3) + (nota2*5) + nota3) / 8.3;
		
		System.out.println("Média ponderada: " + resultado);
		} else {System.out.println("Valores digitados inválidos!");}
		
		leia.close();
	}

}
