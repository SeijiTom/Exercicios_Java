package br.com.generation.sequencial.exercícios;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		
		int diasAnos, dias, meses, anos;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");
		diasAnos = leia.nextInt();
		
		anos = diasAnos/365;
		meses = (diasAnos%365)/30;
		dias = (diasAnos%365)%30;
		
		System.out.println("Sua idade é de: " + anos + " anos, " + meses + " meses e " + dias + " dias");

		leia.close();
	}

}
