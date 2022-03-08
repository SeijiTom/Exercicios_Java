package br.com.generation.classes;

public class Carro {
	//atribuir variáveis
	String modelo;
	String marca;
	String placa;
	int ano;
	int velocidade;
	
	//Métodos --> ações --> verbos
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void frear(int reduzir) {
		velocidade -= reduzir;
	}
	
}
