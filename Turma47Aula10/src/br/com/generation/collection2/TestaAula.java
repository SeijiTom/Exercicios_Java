package br.com.generation.collection2;

import java.util.ArrayList;

public class TestaAula {

	public static void main(String[] args) {
		
		Aula a1 = new Aula("ArrayList", 90);//Aqui o construtos solicita parametros pois lá na classe aluno ele tem parametros (String titulo, int tempo)
		Aula a2 = new Aula("List", 60);
		Aula a3 = new Aula("Collections", 120);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		
		System.out.println(aulas);
		
	}

}
