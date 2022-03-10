package br.com.generation.polimorfismo;

public class ImprimeAnimal {

	public static void main(String[] args) {
		
		TestaAnimal t = new TestaAnimal();
		
	//quem define o objeto é o contrutor com "new 'nomeDaClasse()'"
		
		t.fazerAnimalComer(new Tigre());
		t.fazerAnimalComer(new Cachorro());

	}

}
