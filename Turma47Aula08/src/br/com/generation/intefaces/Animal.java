package br.com.generation.intefaces;

public interface Animal {
	
	double PI = 3.14;

	public void somAnimal();//Geralmente em intefacers coloca-se as assinaturas dos m�todos para implementa��o
	public void dormir();
//polimorfismo � quando temos m�tdos dentro de uma interface e que est�o sendo utilizados
//por classes diferentes, onde nessas classes eles ser�o usados de maneira diferente...
//ou seja, cada classe ir� introduzir instru��es diferentes dentro de um msm metodo.
// e quando elas forem chamadas no main cada um
// poli ocorre de classe pra classe tbm e n somente de interface pra classe.
}
