package br.com.generation.intefaces;

public class Cachorro implements Animal{

	@Override
	public void somAnimal() {
		System.out.println("O som do cachorro: au au");
		//dentro de um m�todo podemos fazer um calculo, a chamada de outro m�todo,
		//fazer qualquer a��o, etc.
	}

	@Override
	public void dormir() {
		System.out.println("Cachorro dormindo...");
		
	}
	
	

}
