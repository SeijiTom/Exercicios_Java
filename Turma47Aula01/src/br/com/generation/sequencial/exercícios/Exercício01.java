package br.com.generation.sequencial.exercícios;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		
		int anos, meses, dias, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade em anos, meses e dias: ");
		anos = leia.nextInt();
		meses = leia.nextInt();
		dias = leia.nextInt();
		
		resultado = anos*365 + meses*30 + dias;
				
		System.out.println("Sua idade é de " + resultado + " dias!");
		
		leia.close();
	}

}
