package br.com.generation.sobrecarga;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		//Estanciar a classe Minhacalculadora
		MinhaCalculadora calc = new MinhaCalculadora();
		
		//soma dos valores
		System.out.println(calc.soma(10,6.5));
		
		//três parâmetros
		System.out.println(calc.soma(10.0,6.5,11.5));

	}

}
