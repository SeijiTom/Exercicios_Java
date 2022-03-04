package br.com.generation.repeticao.exercícios;

import java.util.Scanner;

public class ExercícioRepeticao03 {

	public static void main(String[] args) {
		
		int idade = 0, mais50 = 0, menos21 = 0;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite as idades, lembrando que -99 encerra o programa: ");
		
		while(idade != -99) {
			
			idade = leia.nextInt();
			
			if(idade < 21) {
				++menos21;
			}
			else if (idade > 50) {
				++mais50;
			}
			
		}
		System.out.println("Quantidade de pessoas com menos de 21 anos: " + menos21);
		System.out.println("Quantidade de pessoas com mais de 50 anos: " + mais50);
		leia.close();
	}

}