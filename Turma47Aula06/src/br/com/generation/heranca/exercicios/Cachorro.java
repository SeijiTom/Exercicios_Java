package br.com.generation.heranca.exercicios;

public class Cachorro extends Animal{
	
	private double volumeDoLatido;
	private double velocidadeAbanaCalda;
	
	
	void corre(int aceleracao) {
		setVelocidade(getVelocidade() + aceleracao);
		System.out.println("Correndo...");
	}


	public double getVolumeDoLatido() {
		return volumeDoLatido;
	}


	public void setVolumeDoLatido(double volumeDoLatido) {
		this.volumeDoLatido = volumeDoLatido;
	}


	public double getVelocidadeAbanaCalda() {
		return velocidadeAbanaCalda;
	}


	public void setVelocidadeAbanaCalda(double velocidadeAbanaCalda) {
		this.velocidadeAbanaCalda = velocidadeAbanaCalda;
	}
	
}
