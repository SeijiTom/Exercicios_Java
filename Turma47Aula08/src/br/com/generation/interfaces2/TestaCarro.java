package br.com.generation.interfaces2;

public class TestaCarro {
	
	public static void main(String[] args) {
		
		Carro c = new Ferrari();
//meu objeto "c" se baseia na minha interface "Carro" é a planta do objeto, porem suas característica é de outra classe/construtor"Ferrari".
//ou seja o c é o objeto e o Ferrari é o construtor, que de fato irá construir nosso objeto.		
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
