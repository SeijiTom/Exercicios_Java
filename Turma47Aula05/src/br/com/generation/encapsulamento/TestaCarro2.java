package br.com.generation.encapsulamento;

import java.util.Scanner;

public class TestaCarro2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com a marca do veículo: ");
		String marca = entrada.next();
		
		System.out.println("Entre com o modelo do veículo: ");
		String modelo = entrada.next();
		
		System.out.println("Entre com a cor do veículo: ");
		String cor = entrada.next();
		
		
		Carro2 c1 = new Carro2();
		
		c1.setMarca(marca);
		c1.setModelo(modelo);
		c1.setCor(cor);
		c1.setNumPassageiro(2);
		
		System.out.println("Marca: " + c1.getMarca());
		System.out.println("Modelo: " + c1.getModelo());
		System.out.println("Cor: " + c1.getCor());
		System.out.println("Número de passageiros: " + c1.getNumPassageiro());
		
		entrada.close();
	}

}
