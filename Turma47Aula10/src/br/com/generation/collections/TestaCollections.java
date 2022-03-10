package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestaCollections {

	public static void main(String[] args) {
		
		String aula1 = "ABloco I - Java";
		String aula2 = "DBloco II - SpringBoot";
		String aula3 = "CBloco III - FrontEnd";
		String aula4 = "BBloco IV - Mobile";
		String aula5 = "EBloco V - Festa";
		
		ArrayList<String> aulas = new ArrayList<>();
//criando uma lista com objeto que irá trabalhar com strings e importamos ela da biblioteca junto de seu construtor

		aulas.add(aula1);//-->[0]
		aulas.add(aula2);//-->[1]
		aulas.add(aula3);//-->[2]
		aulas.add(aula4);//-->[3]
		aulas.add(aula5);
		//a lista cria automaticamente essa posições como se fosse um vetor
		
		/*System.out.println(aulas);
		
		aulas.remove(2); //comando para remover uma posição
		System.out.println();
		System.out.println(aulas);*/
		
		//For - each -> laço mais moderninho, usado para trabalhar com listas
		//temos q declarar uma variável do mesmo tipo das variáveis da lista, ou seja, String.
		/*for(String i : aulas) {
			System.out.println("Aulas: " + i);
		}
		System.out.println();
		String primeiraAula = aulas.get(0);
		
		System.out.println("A 1° aula é: " + primeiraAula);
		//Existem varias possibilidades de imprimir
		System.out.println();
		System.out.println("A 4° aula é: " + aulas.get(3));
		
		
		for(int i = 0; i < aulas.size(); i++){
			System.out.println("Aulas: " + aulas.get(i));
		}//para o programa ser mais flexivel usamos no .size() pois irá percorrer a lista independete de seu tamanho, msm q o tamanho seja alterado no futuro não afetara esta parte do código
		
		System.out.println();
		System.out.println(aulas.size());*/
	
		Collections.sort(aulas);//sort--> funçao que coloca a lista em ordem crescente de posições [0][1]...[n]!
		System.out.println(aulas);
		
		
	}

}
