package br.com.generation.classes;

public class Carro {
	//atribuir vari�veis
	String modelo;
	String marca;
	String placa;
	int ano;
	int velocidade;
	
	//M�todos --> a��es --> verbos
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void frear(int reduzir) {
		velocidade -= reduzir;
	}
	
}
