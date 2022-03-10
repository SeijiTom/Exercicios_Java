package br.com.generation.heranca.exercicios;

import java.util.Scanner;

public class TestaAnimal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Cavalo cavalo = new Cavalo();
		Cachorro cao = new Cachorro();
		Preguica preguica = new Preguica();
		
		cavalo.emitirSom();
		cao.emitirSom();
		preguica.emitirSom();
		
		System.out.println("Digite a(s) cor(es) do cavalo: ");
		cavalo.setCor(entrada.next());
		
		System.out.println("Digite a(s) cor(es) do cachorro: ");
		cao.setCor(entrada.next());
		
		System.out.println("Digite a(s) cor(res) da pregui�a: ");
		preguica.setCor(entrada.next());
		
		System.out.println();
		
		System.out.println("Cor(es) do cavalo: " + cavalo.getCor());
		System.out.println("Cor(es) do cachorro: " + cao.getCor());
		System.out.println("Cor(es) da pregui�a: " + preguica.getCor());
		
		entrada.close();
	}

		// TODO Auto-generated method stub
	
}
	

