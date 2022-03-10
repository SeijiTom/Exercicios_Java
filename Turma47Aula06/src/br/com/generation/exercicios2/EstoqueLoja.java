package br.com.generation.exercicios2;

public class EstoqueLoja {

	private String produto;
	private int quantidade;
	
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public EstoqueLoja(String produto, int quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return "Estoque da loja -> produto: " + produto + ", quantidade no estoque: " + quantidade;
	}
	
	
	
}
