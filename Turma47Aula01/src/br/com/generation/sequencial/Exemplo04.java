package br.com.generation.sequencial;

import java.util.Scanner;

public class Exemplo04 { //Exemplo04 = classe

	public static void main(String[] args) { // Aqui � igual a m�todo/fun��o
		
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
		
		leia.close(); //para fechar o leia, impedindo invas�es e roubo de dados
		
		fim(); //aqui estou chamando a fun��o "fim" para a fun��o "main"
		
	}
	
	public static void fim() {
		
		//No caso como n�o tem nada aqui n�o acontecer� nada!
	}

}
