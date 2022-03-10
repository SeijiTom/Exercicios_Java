package br.com.generation.intefaces;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
		
		Cachorro mc = new Cachorro();
		mc.somAnimal();
		mc.dormir();
		
		System.out.println();
		
		Gato gt = new Gato();
		gt.somAnimal();
		gt.dormir();
//Ambos as classes possuem o mesmos métodos, porem cada um executa uma coisa diferente.
//Isso se chama Polimorfismo!
	}

}
