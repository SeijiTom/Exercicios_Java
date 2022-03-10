package br.com.generation.intefaces;

public interface Animal {
	
	double PI = 3.14;

	public void somAnimal();//Geralmente em intefacers coloca-se as assinaturas dos métodos para implementação
	public void dormir();
//polimorfismo é quando temos métdos dentro de uma interface e que estão sendo utilizados
//por classes diferentes, onde nessas classes eles serão usados de maneira diferente...
//ou seja, cada classe irá introduzir instruções diferentes dentro de um msm metodo.
// e quando elas forem chamadas no main cada um
// poli ocorre de classe pra classe tbm e n somente de interface pra classe.
}
