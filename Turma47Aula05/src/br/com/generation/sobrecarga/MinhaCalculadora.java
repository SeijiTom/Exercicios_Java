package br.com.generation.sobrecarga;

public class MinhaCalculadora {
	//Sobrecarga
	public int soma(int numero1, int numero2) {
		System.out.println("Soma de inteiros: ");
		return numero1 + numero2;
	}
	
	public double soma(double numero1, double numero2) {
		System.out.println("Soma de fracionários: ");
		return numero1 + numero2;
	}

	public double soma(double numero1, int numero2) {
		//apesar de double ser o primeiro n, o segundo tbm...
		//pode ser double e o primeiro int
		//ex: 10 + 6.5 = 16.5
		return numero1 + numero2;
	}
	public double soma(double numero1, double numero2, double numero3) {
		System.out.println("Três parametros");
		return numero1 + numero2 + numero3;
	}
	
}
