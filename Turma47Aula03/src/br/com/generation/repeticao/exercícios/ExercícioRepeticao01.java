package br.com.generation.repeticao.exerc�cios;

public class Exerc�cioRepeticao01 {

	public static void main(String[] args) {
		
		System.out.println("Os n�meros que divididos por 11 com resto 5 entre 1000 a 1999 s�o:");
			
		for(int i = 1000; i <= 1999; i++) {
			
			if(i%11 == 5) {
				System.out.println(i);
			}
			
		}

	}

}
