package br.com.generation.classes.exercicios;

public class Avi�o {
	
	String modelo;
	String agenciaAeria;
	String cores;
	int ano;
	int velocidade;
	
	void acelerar(int aceleracao) {
		velocidade += aceleracao;
	}
	void decolar() {
		System.out.println("Avi�o com velocidade suficiente!"
				+ "Levantando voo...");
	}
	void desacelerar(int reducao) {
		velocidade -= reducao;
	}
	void pousar( ) {
		System.out.println("Velocidade e altura baixas o"
				+ " suficiente! pousando...");
	}
	
		public static void main(String[] args) {
			
			Avi�o a1 = new Avi�o();
			
			a1.modelo = "Boeing 787";
			a1.agenciaAeria = "Gol";
			a1.cores = "branco e laranja";
			a1.ano = 2013;
			a1.velocidade = 0;
			
			
			
		}
}
