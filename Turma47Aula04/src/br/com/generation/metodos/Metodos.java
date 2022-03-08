package br.com.generation.metodos;

import java.util.Scanner;

public class Metodos {//Ao menos uma classe deve ter o método main

	static int numero3, numero4, multiplicacao, numero5 = 25, numero8, numero9, numero10, numero11;
	//variáveis globais
	
	public static void main(String[] args) {
// O método principal é que roda todo o programa
// Então é preciso chamar os outros métodos no principal para poder executa-los
		
		metodo1();
		metodo2();
		metodo3();
		metodo4();
		scan();
		metodo5(numero8, numero9);
		metodo7();

	}
	
	public static void scan() {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com os valores de parametro do metodo - 5: ");
		int numero8, numero9;
		numero8 = entrada.nextInt();
		numero9 = entrada.nextInt();
		System.out.println("Valores do metodo - 7: ");
		numero10 = entrada.nextInt();
		numero11 = entrada.nextInt();
		entrada.close();	
		
	}
	
	public static void metodo1() {
		
		System.out.println("Olá, eu sou o método - 01");
		
	}
	
	public static void metodo2() {
		
		int numero1 = 10, numero2 = 30, soma;
		soma = numero1 + numero2;
		System.out.println("Soma no método - 02: " + soma);
		System.out.println(numero5);
			
	}
	
	public static void metodo3() {
		int numero1 = 60;
		System.out.println(numero1);
		multiplicacao = numero3 * numero4;
		
		
	}
	
	public static void metodo4() {
		System.out.println("Multiplicação no método - 03: " + multiplicacao);
	}
	
	public static void metodo5(int numero6, int numero7) {
		int divisao = numero6 / numero7;
		System.out.println("Divisão método - 05: " + divisao);
	}
	
	public static void metodo7() {
		System.out.println(TestaMetodoFora.metodo6(1, 10));
		
	}

}
