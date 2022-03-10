package br.com.generation.heranca.exercicios;

public class Preguica extends Animal{
	
	public void emitirSom() {
		System.out.println("Preguiça gritando: Haaa! Haaa!");
	}

	private int quantidadeGarras;
	private double volumeDoGrito;
	
	void subirArvore(int aceleracao) {
		setVelocidade(getVelocidade() + aceleracao);
		System.out.println("Correndo...");
	}

	
	public int getQuantidadeGarras() {
		return quantidadeGarras;
	}

	public void setQuantidadeGarras(int quantidadeGarras) {
		this.quantidadeGarras = quantidadeGarras;
	}

	public double getVolumeDoGrito() {
		return volumeDoGrito;
	}

	public void setVolumeDoGrito(double volumeDoGrito) {
		this.volumeDoGrito = volumeDoGrito;
	}
	
}
