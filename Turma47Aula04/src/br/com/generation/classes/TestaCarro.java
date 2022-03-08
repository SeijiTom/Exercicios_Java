package br.com.generation.classes;

public class TestaCarro {

	public static void main(String[] args) {
		//estaciamento de objeto, qnd vc cria um objeto baseado numa classe
		//vc está estanceando o objeto, é um jargão técnico
		Carro c1 = new Carro();
		Carro c2 = new Carro();
			
		c1.modelo = "GLA - 250";
		c1.marca = "Mercedes - Benz";
		c1.ano = 2011;
		c1.velocidade = 0;
		
		c2.velocidade = 10;
		
		System.out.println("Velocidade: " + c1.velocidade);
		System.out.println("Velocidade 2: " + c2.velocidade);
		
		c1.acelerar(50);
		c2.acelerar(150);
		System.out.println("Velocidade acelerando...: " + c1.velocidade);
		System.out.println("Velocidade acelerando carro2...: " + c2.velocidade);
		
		c1.frear(20);
		c2.frear(60);
		System.out.println("Velocidade freiada...: " + c1.velocidade);
		System.out.println("Velocidade freiada carro2...: " + c2.velocidade);
	}

}
