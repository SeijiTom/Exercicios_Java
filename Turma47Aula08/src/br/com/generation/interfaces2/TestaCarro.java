package br.com.generation.interfaces2;

public class TestaCarro {
	
	public static void main(String[] args) {
		
		Carro c = new Ferrari();
//meu objeto "c" se baseia na minha interface "Carro" � a planta do objeto, porem suas caracter�stica � de outra classe/construtor"Ferrari".
//ou seja o c � o objeto e o Ferrari � o construtor, que de fato ir� construir nosso objeto.		
//Exemplo temos um carro(objeto) que tem uma base(Carro) e sua parte de cima(Ferrari)
		c.acelerar();
		
		c = new Fusca();
		c.acelerar();
		
//Se eu quisesse chamar o objeto diferente de "c" eu tenho q declarar a interface dnv!
//Exemplo:
		
		Carro d = new Fusca();
		d.acelerar();
		
	}

}
