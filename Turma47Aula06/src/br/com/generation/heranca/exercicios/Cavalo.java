package br.com.generation.heranca.exercicios;

public class Cavalo extends Animal{
	
	public void emitirSom() {
		System.out.println("Cavalo relinchando: hiin in in hinir");
	}

	private double tamanhoCrista;
	private double volumeDoRelinche; 
	
	void corre(int aceleracao) {
		setVelocidade(getVelocidade() + aceleracao);
		System.out.println("Correndo...");
	}
	

	public double getTamanhoCrista() {
		return tamanhoCrista;
	}

	public void setTamanhoCrista(double tamanhoCrista) {
		this.tamanhoCrista = tamanhoCrista;
	}

	public double getVolumeDoRelinche() {
		return volumeDoRelinche;
	}

	public void setVolumeDoRelinche(double volumeDoRelinche) {
		this.volumeDoRelinche = volumeDoRelinche;
	}
	
}
