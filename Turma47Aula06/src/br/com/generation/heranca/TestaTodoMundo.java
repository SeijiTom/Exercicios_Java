package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		//Professor verde � o construtor			
		Professor pf = new Professor();
		FuncionarioAdm fa = new FuncionarioAdm();
		
		pf.setNome("Jeff");
		pf.setIdade(25);
		pf.setEnderaco("Rua das Flores 190");
		pf.setSalario(3500);
		pf.setDisciplina("Java");
		
		System.out.println("Nome: " + pf.getNome());
		System.out.println("Idade: " + pf.getIdade());
		System.out.println("Endere�o: " + pf.getEnderaco());
		System.out.println("Sal�rio: " + pf.getSalario());
		System.out.println("Disciplina: " + pf.getDisciplina());
		System.out.println();
		
		fa.setNome("Esmeralda");
		fa.setIdade(20);
		fa.setEnderaco("Rua do Barulho, 200.. apto 220");
		fa.setSalario(5000);
		fa.setFuncao("Dev Java Jr");
		fa.setSetor("Tecnologia da informa��o");
		
		System.out.println("Nome: " + fa.getNome());
		System.out.println("Idade: " + fa.getIdade());
		System.out.println("Endere�o: " + fa.getEnderaco());
		System.out.println("Sal�rio: " + fa.getSalario());
		System.out.println("Disciplina: " + fa.getFuncao());
		System.out.println("Disciplina: " + fa.getSetor());
		
	}

}
