package br.com.generation.construtor;

public class Pessoa {
	//tudo aqui d� para fazer com encapsulamneto
	String nome;
	int idade;
	
	Pessoa(String n,int i){//quando eu quiser fazer uma altera��o no construtor da classe
		//o Java desliga o construtor padr�o
		System.out.println("Ol�! Eu sou o construtor da classe pessoa!");
		
		nome = n;
		
		idade = i;
	}
	
}
