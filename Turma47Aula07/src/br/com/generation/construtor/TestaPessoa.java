package br.com.generation.construtor;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String n = entrada.next();
		System.out.println("Digite sua idade: ");
		int i = entrada.nextInt();
		
		Pessoa p1 = new Pessoa("Dany", 23);
		System.out.println(p1.idade);
		System.out.println(p1.nome);
		
		entrada.close();
	}
	
}
