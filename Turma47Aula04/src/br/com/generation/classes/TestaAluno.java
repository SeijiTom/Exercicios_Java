package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(); //estou criando o objeto a1 baseado na classe aluno
		Aluno a2 = new Aluno();//possuem as mesmas caracter�sticas, fazem as mesmas a��es
		//mas o que vamos manipular dentro deles � diferente!
		
		a1.nome = "Thiago";
		a1.idade = 20;
		a1.curso = "Bloco I - Java";
		a1.matricula = "RA3655";
		
		System.out.println(a1.nome);
		System.out.println(a1.idade);
		System.out.println(a1.curso);
		System.out.println(a1.matricula);
		
		a1.assitirAula();
		a1.estudar();
		a1.fazerProvas();

		System.out.println();
		
		a2.nome = "Andr�";
		a2.idade = 25;
		a2.curso = "Bloco II - Spring";
		a2.matricula = "RA7894";
		
		System.out.println(a1.nome);
		System.out.println(a1.idade);
		System.out.println(a1.curso);
		System.out.println(a1.matricula);
		
		a1.assitirAula();
		a1.estudar();
		a1.fazerProvas();
		
	}

}
