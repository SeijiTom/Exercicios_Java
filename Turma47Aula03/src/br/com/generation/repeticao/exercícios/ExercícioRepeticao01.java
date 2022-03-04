package br.com.generation.repeticao.exercícios;

public class ExercícioRepeticao01 {

	public static void main(String[] args) {
		
		System.out.println("Os números que divididos por 11 com resto 5 entre 1000 a 1999 são:");
			
		for(int i = 1000; i <= 1999; i++) {
			
			if(i%11 == 5) {
				System.out.println(i);
			}
			
		}

	}

}
