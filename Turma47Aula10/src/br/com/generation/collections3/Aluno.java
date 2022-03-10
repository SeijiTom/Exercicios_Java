package br.com.generation.collections3;

public class Aluno {
	
	private int idade;
	private String nome;
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Aluno(int idade, String nome) {
		super();
		this.idade = idade;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Aluno [idade=" + idade + ", nome=" + nome + "]";
	}

}