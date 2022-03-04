package br.com.generation.sequencial;

import java.util.Scanner;

public class Exemplo04 { //Exemplo04 = classe

	public static void main(String[] args) { // Aqui é igual a método/função
		
		Scanner leia = new Scanner(System.in);
		
		int a, b, soma, subtracao;
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		soma = a + b;
		subtracao = a - b;
		
		System.out.println("Resultado: " + soma);
		System.out.println("Resultado: " + subtracao);
		
		leia.close(); //para fechar o leia, impedindo invasões e roubo de dados
		
		fim(); //aqui estou chamando a função "fim" para a função "main"
		
	}
	
	public static void fim() {
		
		//No caso como não tem nada aqui não acontecerá nada!
	}

}
