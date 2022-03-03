package br.com.generation.condicional.exercício;

import java.util.Scanner;

public class ExercícioCondicional03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println(idade + " anos. Categoria infantil!");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println(idade + " anos. Categoria juvenil!");
		}
		else if (idade >= 18 && idade <= 25) {
			System.out.println(idade + " anos. Categoria adulto!");
		}
		else {
			System.out.println("Idade inválida ou categoria inexistente para tal idade!");
		}
		leia.close();
	}

}