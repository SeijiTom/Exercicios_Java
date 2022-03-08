package br.com.generation.construtor;

public class Pessoa {
	//tudo aqui dá para fazer com encapsulamneto
	String nome;
	int idade;
	
	Pessoa(String n,int i){//quando eu quiser fazer uma alteração no construtor da classe
		//o Java desliga o construtor padrão
		System.out.println("Olá! Eu sou o construtor da classe pessoa!");
		
		nome = n;
		
		idade = i;
	}
	
}
