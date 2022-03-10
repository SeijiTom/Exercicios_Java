package br.com.generation.collections3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaAluno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Aluno> alunos = new ArrayList<>();
		
		System.out.println("Quantos alunos você deseja adicionar?");
		int numeroAlunos = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < numeroAlunos; i++) {
			System.out.println("Idade do aluno: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Digite o nome do aluno: ");
			String nome = sc.nextLine();
			
			alunos.add(new Aluno(idade, nome));//cria um objeto novo, add idade e nome.
			//se o for rodar 5x ele vai criar 5 objetos ou seja 5 alunos
		}
		for(Aluno i: alunos) {
			System.out.println(i);
		}
		sc.close();
	}

}
