package br.com.generation.sequencial.exercícios;

import java.util.Scanner;

public class Exercício03 {

	public static void main(String[] args) {
		
		int horas, mins, segs, segsTotal;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tempo de duração de um evento na fábrica expressa em segundos: ");
		segsTotal = leia.nextInt();
		
		horas = (segsTotal/60)/60;
		mins = (segsTotal/60)%60;
		segs = segsTotal%60;
		
		System.out.println("O evento durou: " + horas + " horas, " + mins + " minutos e " + segs + " segundos");
		
		leia.close();
		
	}

}
